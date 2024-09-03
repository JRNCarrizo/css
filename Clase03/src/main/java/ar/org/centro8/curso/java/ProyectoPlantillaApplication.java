package ar.org.centro8.curso.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class ProyectoPlantillaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPlantillaApplication.class, args);
	}

}
