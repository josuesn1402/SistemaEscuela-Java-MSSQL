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
    SELECT code AS codigo,
           apae AS apellido_paterno,
           amae AS apellido_materno,
           nome AS nombre,
           edae AS edad,
           sexe AS genero
    FROM Estudiantes;
END;
GO

CREATE PROCEDURE sp_AgregarEstudiante
    @codigo VARCHAR(10),
    @apellidoPaterno VARCHAR(50),
    @apellidoMaterno VARCHAR(50),
    @nombre VARCHAR(50),
    @edad INT,
    @genero CHAR(1)
AS
BEGIN
    INSERT INTO Estudiantes (code, apae, amae, nome, edae, sexe)
    VALUES (@codigo, @apellidoPaterno, @apellidoMaterno, @nombre, @edad, @genero);
END;
GO

CREATE PROCEDURE sp_ModificarEstudiante
    @codigo VARCHAR(10),
    @apellidoPaterno VARCHAR(50),
    @apellidoMaterno VARCHAR(50),
    @nombre VARCHAR(50),
    @edad INT,
    @genero CHAR(1)
AS
BEGIN
    UPDATE Estudiantes
    SET apae = @apellidoPaterno,
        amae = @apellidoMaterno,
        nome = @nombre,
        edae = @edad,
        sexe = @genero
    WHERE code = @codigo;
END;
GO
