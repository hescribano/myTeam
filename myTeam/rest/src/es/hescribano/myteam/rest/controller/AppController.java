package es.hescribano.myteam.rest.controller;
/* <!--
Desarrollado por Hugo Escribano como parte del TFG en la Universidad Internacional de la Rioja
Licencia GNU General Public License v3.0
-->*/
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
    String home() {
        return "index";
    }
	
}