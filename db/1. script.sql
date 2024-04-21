CREATE DATABASE bdescuela;
GO

USE bdescuela;
GO

CREATE TABLE Cursos (
    codcur VARCHAR(10) PRIMARY KEY,  -- C�digo del curso
    descur VARCHAR(100)  -- Descripci�n del curso
);
GO

CREATE TABLE Turno (
    codt INT PRIMARY KEY,  -- C�digo del turno
    dest VARCHAR(20)  -- Descripci�n del turno (ma�ana, tarde, etc.)
);
GO

CREATE TABLE Lectivo (
    codl VARCHAR(10) PRIMARY KEY,  -- C�digo del per�odo lectivo
    desl VARCHAR(50)  -- Descripci�n del per�odo lectivo (a�o escolar, semestre, etc.)
);
GO

CREATE TABLE Estudiantes (
    code VARCHAR(10) PRIMARY KEY,  -- C�digo del estudiante
    apae VARCHAR(50),  -- Apellido paterno del estudiante
    amae VARCHAR(50),  -- Apellido materno del estudiante
    nome VARCHAR(50),  -- Nombre del estudiante
    edae INT,  -- Edad del estudiante
    sexe CHAR(1)  -- Sexo del estudiante (M: masculino, F: femenino)
);
GO

CREATE TABLE Matriculas (
    idMatricula VARCHAR(10) PRIMARY KEY,  -- Identificador de la matr�cula
    code VARCHAR(10),  -- C�digo del estudiante
    codl VARCHAR(10),  -- C�digo del per�odo lectivo
    codt INT,  -- C�digo del turno
    Fecha DATETIME,  -- Fecha de la matr�cula
    FOREIGN KEY (code) REFERENCES Estudiantes(code),  -- Clave for�nea que referencia al estudiante
    FOREIGN KEY (codl) REFERENCES Lectivo(codl),  -- Clave for�nea que referencia al per�odo lectivo
    FOREIGN KEY (codt) REFERENCES Turno(codt)  -- Clave for�nea que referencia al turno
);
GO

CREATE TABLE Detalle_Matriculas (
    idMatricula VARCHAR(10),  -- Identificador de la matr�cula
    codcur VARCHAR(10),  -- C�digo del curso
    Nota INT,  -- Nota obtenida en el curso
    PRIMARY KEY (idMatricula, codcur),  -- Clave primaria compuesta por idMatricula y codcur
    FOREIGN KEY (idMatricula) REFERENCES Matriculas(idMatricula),  -- Clave for�nea que referencia a Matriculas
    FOREIGN KEY (codcur) REFERENCES Cursos(codcur)  -- Clave for�nea que referencia al curso
);
GO