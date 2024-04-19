CREATE DATABASE bdescuela;
GO

USE bdescuela;
GO

CREATE TABLE Cursos (
    codcur VARCHAR(10) PRIMARY KEY,
    descur VARCHAR(100)
);
GO

CREATE TABLE Turno (
    codt INT PRIMARY KEY,
    dest VARCHAR(20)
);
GO

CREATE TABLE Lectivo (
    codl VARCHAR(10) PRIMARY KEY,
    desl VARCHAR(50)
);
GO

CREATE TABLE Estudiantes (
    code VARCHAR(10) PRIMARY KEY,
    apae VARCHAR(50),
    amae VARCHAR(50),
    nome VARCHAR(50),
    edae INT,
    sexe CHAR(1)
);
GO

CREATE TABLE Matriculas (
    idMatricula VARCHAR(10) PRIMARY KEY,
    code VARCHAR(10),
    codl VARCHAR(10),
    codt INT,
    Fecha DATETIME,
    FOREIGN KEY (code) REFERENCES Estudiantes(code),
    FOREIGN KEY (codl) REFERENCES Lectivo(codl)
);
GO

CREATE TABLE Detalle_Matriculas (
    idMatricula VARCHAR(10) PRIMARY KEY,
    codcur VARCHAR(10),
    Nota INT,
    FOREIGN KEY (codcur) REFERENCES Cursos(codcur)
);
GO
