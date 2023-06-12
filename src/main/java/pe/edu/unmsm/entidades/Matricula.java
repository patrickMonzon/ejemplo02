package pe.edu.unmsm.entidades;

public class Matricula {
	private Alumno alumno;
	private Integer matricula;
	private String curso;
	private Integer creditos;
	private Double costoCredito;
	
	public Matricula() {}

	public Matricula(Alumno alumno, Integer matricula, String curso, Integer creditos, Double costoCredito) {
		super();
		this.alumno = alumno;
		this.matricula = matricula;
		this.curso = curso;
		this.creditos = creditos;
		this.costoCredito = costoCredito;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Integer getCreditos() {
		return creditos;
	}

	public void setCreditos(Integer creditos) {
		this.creditos = creditos;
	}

	public Double getCostoCredito() {
		return costoCredito;
	}

	public void setCostoCredito(Double costoCredito) {
		this.costoCredito = costoCredito;
	}	
	
	public Double getImporte() {
		return this.costoCredito * this.creditos.doubleValue();
	}
	
}
