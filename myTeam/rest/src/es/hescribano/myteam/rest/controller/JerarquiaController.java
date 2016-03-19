package es.hescribano.myteam.rest.controller;
/* <!--
Desarrollado por Hugo Escribano como parte del TFG en la Universidad Internacional de la Rioja
Licencia GNU General Public License v3.0
-->*/
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import es.hescribano.myteam.rest.model.Competicion;
import es.hescribano.myteam.rest.model.Deporte;

@RestController
@RequestMapping(value = "/jerarquia")
public class JerarquiaController {

	private static final List<Deporte> DEMO_JERARQUIA = new ArrayList<Deporte>();
	
	static {
		List<Competicion> lst = new ArrayList<Competicion>();
		lst.add(new Competicion("Liga BBVA",1));
		lst.add(new Competicion("Liga Adelante",2));
		lst.add(new Competicion("Premier",3));
		DEMO_JERARQUIA.add(new Deporte("Fútbol", 1, lst));
		lst = new ArrayList<Competicion>();
		lst.add(new Competicion("ACB",1));
		lst.add(new Competicion("LEB Oro",2));
		lst.add(new Competicion("NBA",3));
		DEMO_JERARQUIA.add(new Deporte("Baloncesto", 2, lst));
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Deporte> getFilms() {
		return DEMO_JERARQUIA;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void addFilm(@RequestBody @Valid Deporte dxt) {
		DEMO_JERARQUIA.add(dxt);
	}
}