CREATE DATABASE bdescuela;
GO

USE bdescuela;
GO

CREATE TABLE Cursos (
    codcur VARCHAR(10) PRIMARY KEY,  -- Código del curso
    descur VARCHAR(100)  -- Descripción del curso
);
GO

CREATE TABLE Turno (
    codt INT PRIMARY KEY,  -- Código del turno
    dest VARCHAR(20)  -- Descripción del turno (mañana, tarde, etc.)
);
GO

CREATE TABLE Lectivo (
    codl VARCHAR(10) PRIMARY KEY,  -- Código del período lectivo
    desl VARCHAR(50)  -- Descripción del período lectivo (año escolar, semestre, etc.)
);
GO

CREATE TABLE Estudiantes (
    code VARCHAR(10) PRIMARY KEY,  -- Código del estudiante
    apae VARCHAR(50),  -- Apellido paterno del estudiante
    amae VARCHAR(50),  -- Apellido materno del estudiante
    nome VARCHAR(50),  -- Nombre del estudiante
    edae INT,  -- Edad del estudiante
    sexe CHAR(1)  -- Sexo del estudiante (M: masculino, F: femenino)
);
GO

CREATE TABLE Matriculas (
    idMatricula VARCHAR(10) PRIMARY KEY,  -- Identificador de la matrícula
    code VARCHAR(10),  -- Código del estudiante
    codl VARCHAR(10),  -- Código del período lectivo
    codt INT,  -- Código del turno
    Fecha DATETIME,  -- Fecha de la matrícula
    FOREIGN KEY (code) REFERENCES Estudiantes(code),  -- Clave foránea que referencia al estudiante
    FOREIGN KEY (codl) REFERENCES Lectivo(codl),  -- Clave foránea que referencia al período lectivo
    FOREIGN KEY (codt) REFERENCES Turno(codt)  -- Clave foránea que referencia al turno
);
GO

CREATE TABLE Detalle_Matriculas (
    idMatricula VARCHAR(10),  -- Identificador de la matrícula
    codcur VARCHAR(10),  -- Código del curso
    Nota INT,  -- Nota obtenida en el curso
    PRIMARY KEY (idMatricula, codcur),  -- Clave primaria compuesta por idMatricula y codcur
    FOREIGN KEY (idMatricula) REFERENCES Matriculas(idMatricula),  -- Clave foránea que referencia a Matriculas
    FOREIGN KEY (codcur) REFERENCES Cursos(codcur)  -- Clave foránea que referencia al curso
);
GO