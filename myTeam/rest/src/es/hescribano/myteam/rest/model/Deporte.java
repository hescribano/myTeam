package es.hescribano.myteam.rest.model;
/* <!--
Desarrollado por Hugo Escribano como parte del TFG en la Universidad Internacional de la Rioja
Licencia GNU General Public License v3.0
-->*/
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

	private List<Competicion> getLstCompeticiones() {
		return lstCompeticiones;
	}

	private void setLstCompeticiones(List<Competicion> lstCompeticiones) {
		this.lstCompeticiones = lstCompeticiones;
	}
}