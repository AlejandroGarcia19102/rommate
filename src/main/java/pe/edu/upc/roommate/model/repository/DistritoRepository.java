package pe.edu.upc.roommate.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.roommate.model.entity.Distrito;

@Repository
public interface DistritoRepository extends JpaRepository<Distrito, Integer>{

}
