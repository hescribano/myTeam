package es.hescribano.myteam.rest;
/* <!--
Desarrollado por Hugo Escribano como parte del TFG en la Universidad Internacional de la Rioja
Licencia GNU General Public License v3.0
-->*/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
