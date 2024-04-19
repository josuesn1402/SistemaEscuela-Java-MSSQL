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

CREATE PROCEDURE InsertarMatricula
    @code VARCHAR(12),
    @codl VARCHAR(12),
    @codt VARCHAR(12),
    @Fecha DATETIME
AS
BEGIN
    DECLARE @idMatricula VARCHAR(12);
    DECLARE @maxId INT;

    SELECT @maxId = ISNULL(MAX(RIGHT(idMatricula, LEN(idMatricula) - 1)), 0) FROM Matriculas;

    SET @maxId = @maxId + 1;

    SET @idMatricula = 'M' + RIGHT('0000' + CAST(@maxId AS VARCHAR(5)), 4);

    INSERT INTO Matriculas (idMatricula, code, codl, codt, Fecha)
    VALUES (@idMatricula, @code, @codl, @codt, @Fecha);
END;
GO

CREATE PROCEDURE ModificarMatricula
    @idMatricula VARCHAR(12),
    @code VARCHAR(12),
    @codl VARCHAR(12),
    @codt VARCHAR(12),
    @Fecha DATETIME
AS
BEGIN
    UPDATE Matriculas
    SET code = @code,
        codl = @codl,
        codt = @codt,
        Fecha = @Fecha
    WHERE idMatricula = @idMatricula;
END;
GO


exec VerMatriculas

select * from Lectivo
