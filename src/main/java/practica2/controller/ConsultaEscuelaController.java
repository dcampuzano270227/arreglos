package practica2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import practica2.modelo.ResponseArray;
import practica2.service.ConsultaEscuelaService;

@RestController

@RequestMapping("/consulta")
public class ConsultaEscuelaController {
	
	@Autowired
	private ConsultaEscuelaService consultaEscuelaService;

	@GetMapping("/escuela")
	public ResponseArray consultaEscuela() {
		ResponseArray datoFinal = new ResponseArray();
		
		datoFinal.setCodigo(200);
		datoFinal.setDescripcion("ok");
		datoFinal.setInfoEscuela(consultaEscuelaService.consultaEscuela());
		
		return datoFinal;
	}
}
