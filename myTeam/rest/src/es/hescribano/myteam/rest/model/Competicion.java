package es.hescribano.myteam.rest.model;
/* <!--
Desarrollado por Hugo Escribano como parte del TFG en la Universidad Internacional de la Rioja
Licencia GNU General Public License v3.0
-->*/
public class Competicion {
	public Competicion(String nombre, Integer orden) {
		this.nombre = nombre;
		this.orden = orden;
	}
	private Deporte deporte;
	private String nombre;
	private Integer orden;
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

}
