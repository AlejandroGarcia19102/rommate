package pe.edu.upc.roommate.model.entity;

import java.util.List;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_interior")
public class TipoInterior {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tipo_interior_id")
	private Integer id;
	
	@Column(name = "tipo_interior_name", length = 25)
	private String name;
	
	@OneToMany(mappedBy = "tipointerior", fetch = FetchType.LAZY)
	private List<Propiedad> propiedades;
	
	public TipoInterior() {
		propiedades = new ArrayList<Propiedad>();
				}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Propiedad> getPropiedades() {
		return propiedades;
	}

	public void setPropiedades(List<Propiedad> propiedades) {
		this.propiedades = propiedades;
	}

	
	
}
