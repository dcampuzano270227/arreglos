package practica2.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import practica2.modelo.ResponseArray;
import practica2.modelo.ResponseLista;
import practica2.service.ConsultaEscuelaService;

@Service
public class ConsultaEscuelaImpl implements ConsultaEscuelaService {

	@Override
	public List<ResponseLista> consultaEscuela() {
		
		//Instanciar variable de clase ResponseLista
		ResponseLista infoPrimaria = new ResponseLista();
		ResponseLista infoSecundaria = new ResponseLista();
		ResponseLista infoPrepa = new ResponseLista();
		ResponseLista infoUniversidad = new ResponseLista();
		
		//Generamos una variable de tipo lista con info ResponseLista
		List<ResponseLista> listaEscuelas = new ArrayList<>();
		
		//Asignamos valores de la lista para primaria
		infoPrimaria.setEscuela("Benito Juarez");
		infoPrimaria.setAño(2000);
		listaEscuelas.add(infoPrimaria);
		
		//Asignamos valores para Secundaria
		infoSecundaria.setEscuela("Vasconcelos");
		infoSecundaria.setAño(2008);
		listaEscuelas.add(infoSecundaria);
		
		//asignamos valores para prepa
		infoPrepa.setEscuela("cecytem");
		infoPrepa.setAño(2012);
		listaEscuelas.add(infoPrepa);
		
		//asgingamos valores para universiadad
		infoUniversidad.setEscuela("ustem");
		infoUniversidad.setAño(2017);
		listaEscuelas.add(infoUniversidad);
		
		//retornamos valores de la lista
		return listaEscuelas;
	}

}
