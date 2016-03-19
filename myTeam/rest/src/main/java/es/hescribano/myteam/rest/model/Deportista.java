package es.hescribano.myteam.rest.model;

import org.hibernate.validator.constraints.NotEmpty;

public class Deportista {

	public Deportista(String nombre, Integer orden) {
		super();
		this.nombre = nombre;
		this.orden = orden;
	}
	private Competicion competicion;
	private Equipo equipo;
	@NotEmpty
	private String nombre;
	private Integer orden;
	public Competicion getCompeticion() {
		return competicion;
	}
	public void setCompeticion(Competicion competicion) {
		this.competicion = competicion;
	}
	public Equipo getEquipo() {
		return equipo;
	}
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getOrden() {
		return orden;
	}
	public void setOrden(Integer orden) {
		this.orden = orden;
	}
}
