package es.hescribano.myteam.rest.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import es.hescribano.myteam.rest.model.Competicion;
import es.hescribano.myteam.rest.model.Deporte;
import es.hescribano.myteam.rest.model.Deportista;
import es.hescribano.myteam.rest.model.Equipo;

@RestController
@RequestMapping(value = "/jerarquia")
public class JerarquiaController {

	private static final List<Deporte> DEMO_JERARQUIA = new ArrayList<Deporte>();
	
	static {
		List<Competicion> lst = new ArrayList<Competicion>();
		List<Equipo> equipos = new ArrayList<Equipo>();
		equipos.add(new Equipo("FC Barcelona", 1));
		equipos.add(new Equipo("Atlético Madrid", 2));
		equipos.add(new Equipo("Real Madrid", 3));
		Competicion c = new Competicion("Liga BBVA",1, equipos, null);
		lst.add(c);
		equipos = new ArrayList<Equipo>();
		equipos.add(new Equipo("Alavés", 1));
		equipos.add(new Equipo("Leganés", 2));
		equipos.add(new Equipo("Real Zaragoza", 3));
		lst.add(new Competicion("Liga Adelante",2, equipos,null));
		DEMO_JERARQUIA.add(new Deporte("Fútbol", 1, lst));
		lst = new ArrayList<Competicion>();
		equipos = new ArrayList<Equipo>();
		equipos.add(new Equipo("FC Barcelona", 1));
		equipos.add(new Equipo("Valencia Basket", 2));
		equipos.add(new Equipo("Cai Zaragoza", 3));
		lst.add(new Competicion("ACB",1,equipos, null));
		equipos = new ArrayList<Equipo>();
		equipos.add(new Equipo("Chicago Bulls", 1));
		equipos.add(new Equipo("Los Ángeles Lakers", 2));
		equipos.add(new Equipo("Boston celtics", 3));
		lst.add(new Competicion("NBA",2, equipos, null));
		DEMO_JERARQUIA.add(new Deporte("Baloncesto", 2, lst));

		lst = new ArrayList<Competicion>();
		List<Deportista> deportistas= new ArrayList<Deportista>();
		deportistas.add(new Deportista("Nadal", 1));
		deportistas.add(new Deportista("Ferrer", 2));
		deportistas.add(new Deportista("Djokovic", 3));
		lst.add(new Competicion("ATP",1, null,deportistas));
		equipos = new ArrayList<Equipo>();
		equipos.add(new Equipo("España", 1));
		equipos.add(new Equipo("USA", 2));
		equipos.add(new Equipo("Francia", 3));
		lst.add(new Competicion("Copa Davis",2, equipos,null));
		DEMO_JERARQUIA.add(new Deporte("Tenis", 4, lst));
	}
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody public List<Deporte> getDeportes() {
		return DEMO_JERARQUIA;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void addDeporte(@RequestBody @Valid Deporte dxt) {
		DEMO_JERARQUIA.add(dxt);
	}
}