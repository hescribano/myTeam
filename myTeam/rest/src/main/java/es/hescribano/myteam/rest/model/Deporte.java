package es.hescribano.myteam.rest.model;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class Deporte {

	@NotEmpty
	private String nombre;
	
	@NotNull
	private Integer orden;
	
	private List<Competicion> lstCompeticiones;
	public Deporte(String nombre, Integer orden,List<Competicion> lstCompeticiones ) {
		this.nombre = nombre;
		this.orden = orden;
		this.lstCompeticiones = lstCompeticiones;
	}

	public String getNombre() {
		return nombre;
	}

	public Integer getOrden() {
		return orden;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setOrden(Integer orden) {
		this.orden = orden;
	}

	public List<Competicion> getLstCompeticiones() {
		return lstCompeticiones;
	}

	public void setLstCompeticiones(List<Competicion> lstCompeticiones) {
		this.lstCompeticiones = lstCompeticiones;
	}
}