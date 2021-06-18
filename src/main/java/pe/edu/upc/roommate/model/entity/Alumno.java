package pe.edu.upc.roommate.model.entity;

import java.util.ArrayList;
import java.util.List;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "alumnos",
indexes = {@Index(columnList = "alumno_name,alumno_last_name", name="alumnos_index_last_first_name")},
uniqueConstraints = {@UniqueConstraint(columnNames = {"alumno_dni","alumno_mail"})})
			
public class Alumno { 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "alumno_id")
	private Integer id;
	
	@Column(name = "alumno_name", length = 25)
	private String name;
	
	@Column(name = "alumno_last_name", length = 20)
	private String last_name;
	
	@Column(name = "alumno_dni",columnDefinition = "NUMERIC(8)")
	private Integer dni;
	
	@Column(name = "alumno_mail", length = 40)
	private String mail;
	
	@Column(name = "alumno_psword", length = 12)
	private String psword;
	
	@Column(name = "alumno_born")
	@Temporal(TemporalType.DATE)
	private Date born;
	
	@Column(name = "alumno_descripcion", length = 200)
	private String descripcion;
	
	@Column(name = "alumno_ciclo", columnDefinition = "NUMERIC(2)")
	private Integer ciclo;
	
	@Column(name = "alumno_cell",columnDefinition = "NUMERIC(9)")
	private Integer cell;
	
	@ManyToOne
	@JoinColumn(name = "universidad_id", nullable = false)	
	private Universidad universidad; 
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "alumno_intereses", 
			joinColumns = { @JoinColumn(referencedColumnName = "alumno_id", name = "alumno_id") },
			inverseJoinColumns = {@JoinColumn(referencedColumnName = "interes_id", name = "interes_id")})
	private List<Interes> intereses;
	
	@OneToMany(mappedBy = "alumno", fetch = FetchType.LAZY)
	private List<Alquiler> alquileres;
	
	public Alumno() {
		alquileres = new ArrayList<Alquiler>();
		intereses = new ArrayList<Interes>();
	}
	
	
	

	public String getLast_name() {
		return last_name;
	}




	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}




	public Integer getCell() {
		return cell;
	}




	public void setCell(Integer cell) {
		this.cell = cell;
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

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPsword() {
		return psword;
	}

	public void setPsword(String psword) {
		this.psword = psword;
	}

	public Date getBorn() {
		return born;
	}

	public void setBorn(Date born) {
		this.born = born;
	}

	public Universidad getUniversidad() {
		return universidad;
	}

	public void setUniversidad(Universidad universidad) {
		this.universidad = universidad;
	}

	public List<Interes> getIntereses() {
		return intereses;
	}

	public void setIntereses(List<Interes> intereses) {
		this.intereses = intereses;
	}

	public List<Alquiler> getAlquileres() {
		return alquileres;
	}

	public void setAlquileres(List<Alquiler> alquileres) {
		this.alquileres = alquileres;
	}
	
}
