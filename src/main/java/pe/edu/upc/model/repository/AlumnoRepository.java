package pe.edu.upc.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entity.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Integer>
{

}
