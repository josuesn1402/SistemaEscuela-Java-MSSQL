USE bdescuela;
GO

IF OBJECT_ID('dbo.sp_ListarEstudiantes', 'P') IS NOT NULL
    DROP PROCEDURE dbo.sp_ListarEstudiantes;
GO

IF OBJECT_ID('dbo.sp_AgregarEstudiante', 'P') IS NOT NULL
    DROP PROCEDURE dbo.sp_AgregarEstudiante;
GO

IF OBJECT_ID('dbo.sp_ModificarEstudiante', 'P') IS NOT NULL
    DROP PROCEDURE dbo.sp_ModificarEstudiante;
GO

-- Crear los procedimientos almacenados
CREATE PROCEDURE sp_ListarEstudiantes
AS
BEGIN
    SELECT code AS Codigo,
           apae AS ApellidoPaterno,
           amae AS ApellidoMaterno,
           nome AS Nombre,
           edae AS Edad,
           sexe AS Sexo
    FROM Estudiantes;
END;
GO

CREATE PROCEDURE sp_AgregarEstudiante
    @codigo VARCHAR(10),
    @apellidoPaterno VARCHAR(50),
    @apellidoMaterno VARCHAR(50),
    @nombre VARCHAR(50),
    @edad INT,
    @sexo CHAR(1)
AS
BEGIN
    INSERT INTO Estudiantes (code, apae, amae, nome, edae, sexe)
    VALUES (@codigo, @apellidoPaterno, @apellidoMaterno, @nombre, @edad, @sexo);
END;
GO

CREATE PROCEDURE sp_ModificarEstudiante
    @codigo VARCHAR(10),
    @apellidoPaterno VARCHAR(50),
    @apellidoMaterno VARCHAR(50),
    @nombre VARCHAR(50),
    @edad INT,
    @sexo CHAR(1)
AS
BEGIN
    UPDATE Estudiantes
    SET apae = @apellidoPaterno,
        amae = @apellidoMaterno,
        nome = @nombre,
        edae = @edad,
        sexe = @sexo
    WHERE code = @codigo;
END;
GO
