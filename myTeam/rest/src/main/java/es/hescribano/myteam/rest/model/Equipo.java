package es.hescribano.myteam.rest.model;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
	public Equipo(String nombre, Integer orden, List<Deportista> lstDeportistas) {
		super();
		this.nombre = nombre;
		this.orden = orden;
		this.lstDeportistas = lstDeportistas;
	}
	public Equipo(String nombre, Integer orden) {
		super();
		this.nombre = nombre;
		this.orden = orden;
	}
	private Competicion competicion;
	private String nombre;
	private Integer orden;
	private List<Deportista> lstDeportistas =  new ArrayList<Deportista>();
	public Competicion getCompeticion() {
		return competicion;
	}
	public void setCompeticion(Competicion competicion) {
		this.competicion = competicion;
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
	public List<Deportista> getLstDeportistas() {
		return lstDeportistas;
	}
	public void setLstDeportistas(List<Deportista> lstDeportistas) {
		this.lstDeportistas = lstDeportistas;
	}
}
