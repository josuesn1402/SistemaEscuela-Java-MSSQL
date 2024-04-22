exec sp_columns Matriculas

CREATE PROCEDURE VerMatriculas
AS
BEGIN
    SELECT 
        m.idMatricula,
        CONCAT_WS(' ', e.apae, e.amae, e.nome) AS Estudiante,
        l.desl AS Lectivo,
        t.dest AS Turno,
        m.Fecha
    FROM 
        Matriculas m
    JOIN 
        Estudiantes e ON m.code = e.code
    JOIN 
        Lectivo l ON m.codl = l.codl
    JOIN 
        Turno t ON m.codt = t.codt;
END;
GO

CREATE PROCEDURE ObtenerDesCur
AS
BEGIN
    SELECT descur FROM Cursos;
END;
GO

exec ObtenerDesCur

CREATE PROCEDURE ObtenerDest
AS
BEGIN
    SELECT dest FROM Turno;
END;
GO

CREATE PROCEDURE ObtenerDesl
AS
BEGIN
    SELECT desl FROM Lectivo;
END;
GO

CREATE PROCEDURE ObtenerNombresEstudiantes
AS
BEGIN
    SELECT apae + ' ' + amae + ' ' + nome AS NombreCompleto FROM Estudiantes;
END;
GO

exec sp_columns Turno

select * from Estudiantes

CREATE PROCEDURE InsertarMatricula
    @code VARCHAR(12),
    @codl VARCHAR(12),
    @codt INT,
   --@codcur VARCHAR(12),
    @Fecha DATETIME
AS
BEGIN
    DECLARE @idMatricula VARCHAR(12);
    DECLARE @maxId INT;

    SELECT @maxId = ISNULL(MAX(RIGHT(idMatricula, LEN(idMatricula) - 1)), 0) FROM Matriculas;

    SET @maxId = @maxId + 1;
    SET @idMatricula = 'M' + RIGHT('0000' + CAST(@maxId AS VARCHAR(5)), 4);

    DECLARE @formattedCodl VARCHAR(12);
    SET @formattedCodl = 'L' + RIGHT('0000' + SUBSTRING(@codl, PATINDEX('%[0-9]%', @codl), LEN(@codl)), 4);

    --DECLARE @formattedCodcur VARCHAR(12);
    --SET @formattedCodcur = 'C' + RIGHT('0000' + SUBSTRING(@codcur, PATINDEX('%[0-9]%', @codcur), LEN(@codcur)), 4);

    DECLARE @formattedCode VARCHAR(12);
    SET @formattedCode = 'E' + RIGHT('0000' + SUBSTRING(@code, PATINDEX('%[0-9]%', @code), LEN(@code)), 4);

    INSERT INTO Matriculas (idMatricula, code, codl, codt, Fecha)
    VALUES (@idMatricula, @formattedCode, @formattedCodl, @codt, @Fecha);

    --INSERT INTO Detalle_Matriculas (idMatricula, codcur)
    --VALUES (@idMatricula, @formattedCodcur);
END;

CREATE PROCEDURE ModificarMatricula
    @idMatricula VARCHAR(12),
    @code VARCHAR(12),
    @codl VARCHAR(12),
    @codt INT,
    --@codcur VARCHAR(12),
    @Fecha DATETIME
AS
BEGIN
    -- Formatear @code
    DECLARE @formattedCode VARCHAR(12);
    SET @formattedCode = 'E' + RIGHT('0000' + SUBSTRING(@code, PATINDEX('%[0-9]%', @code), LEN(@code)), 4);

    -- Formatear @codl
    DECLARE @formattedCodl VARCHAR(12);
    SET @formattedCodl = 'L' + RIGHT('0000' + SUBSTRING(@codl, PATINDEX('%[0-9]%', @codl), LEN(@codl)), 4);

    -- Formatear @codcur
    --DECLARE @formattedCodcur VARCHAR(12);
    --SET @formattedCodcur = 'C' + RIGHT('0000' + SUBSTRING(@codcur, PATINDEX('%[0-9]%', @codcur), LEN(@codcur)), 4);

    -- Actualizar la tabla Matriculas
    UPDATE Matriculas
    SET code = @formattedCode,
        codl = @formattedCodl,
        codt = @codt,
        Fecha = @Fecha
    WHERE idMatricula = @idMatricula;

    -- Actualizar la tabla Detalle_Matriculas
    --UPDATE Detalle_Matriculas
    --SET codcur = @formattedCodcur
    --WHERE idMatricula = @idMatricula;
END;


exec VerMatriculas

select * from Lectivo
