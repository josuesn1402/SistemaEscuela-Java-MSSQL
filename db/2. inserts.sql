USE bdescuela;
GO

-- Insertar datos en la tabla Cursos
INSERT INTO Cursos (codcur, descur)
VALUES 
('C0001', 'EDUCACIÓN SEXUAL'),
('C0002', 'GEOGRAFÍA');

-- Insertar datos en la tabla Turno
INSERT INTO Turno (codt, dest)
VALUES 
(1, 'MAÑANA'),
(2, 'TARDE');

-- Insertar datos en la tabla Lectivo
INSERT INTO Lectivo (codl, desl)
VALUES 
('L0001', '2024');

-- Insertar datos en la tabla Estudiantes
INSERT INTO Estudiantes (code, apae, amae, nome, edae, sexe)
VALUES 
('E0001', 'Torres', 'Fuentes', 'Sergio', 25, 'M'),
('E0002', 'Puente', 'Atelo', 'Pedroso', 16, 'F'),
('E0003', 'Palacios', 'Aguirre', 'Padaguan', 26, 'F'),
('E0004', 'Puente', 'Atelo', 'Pedroso', 16, 'F'),
('E0005', 'Puente', 'Atelo', 'Pedroso', 16, 'F'),
('E0006', 'Puente', 'Atelo', 'Pedroso', 16, 'F'),
('E0007', 'Puente', 'Atelo', 'Pedroso', 16, 'F'),
('E0008', 'Puente', 'Atelo', 'Pedroso', 16, 'F'),
('E0009', 'Puente', 'Atelo', 'Pedroso', 16, 'F');

-- Insertar datos en la tabla Matriculas
INSERT INTO Matriculas (idMatricula, code, codl, codt, Fecha)
VALUES 
('M0001', 'E0001', 'L0001', 1, '2024-04-19'); -- Fecha en formato 'YYYY-MM-DD'
