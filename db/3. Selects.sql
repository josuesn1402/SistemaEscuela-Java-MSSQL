select * from bdescuela.dbo.Cursos
select * from bdescuela.dbo.Detalle_Matriculas
select * from bdescuela.dbo.Estudiantes
select * from bdescuela.dbo.Lectivo
select * from bdescuela.dbo.Matriculas
select * from bdescuela.dbo.Turno
go

SELECT codcur, descur
FROM Cursos
WHERE codcur NOT IN (
    SELECT DISTINCT codcur
    FROM Detalle_Matriculas
    WHERE idMatricula = 'E0001'
);