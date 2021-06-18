package pe.edu.upc.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entity.Propiedad;

@Repository
public interface PropiedadRepository extends JpaRepository<Propiedad, Integer>
{

}
