package es.hescribano.myteam.rest.model;

import java.util.ArrayList;
import java.util.List;

public class Competicion {
	public Competicion(String nombre, Integer orden, List<Equipo> lstEquipos, List<Deportista> lstDeportistas) {
		this.nombre = nombre;
		this.orden = orden;
		this.lstEquipos = lstEquipos;
		this.lstDeportistas = lstDeportistas;
	}
	private Deporte deporte;
	private String nombre;
	private Integer orden;
	private List<Equipo> lstEquipos = new ArrayList<Equipo>();
	private List<Deportista> lstDeportistas = new ArrayList<Deportista>();
	public Deporte getDeporte() {
		return deporte;
	}
	public void setDeporte(Deporte deporte) {
		this.deporte = deporte;
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
	public List<Equipo> getLstEquipos() {
		return lstEquipos;
	}
	public void setLstEquipos(List<Equipo> lstEquipos) {
		this.lstEquipos = lstEquipos;
	}
	public List<Deportista> getLstDeportistas() {
		return lstDeportistas;
	}
	public void setLstDeportistas(List<Deportista> lstDeportistas) {
		this.lstDeportistas = lstDeportistas;
	}

}
