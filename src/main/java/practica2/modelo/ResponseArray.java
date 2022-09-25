package practica2.modelo;

import java.util.List;

import lombok.Data;

@Data
public class ResponseArray {
	private int codigo;
	private String descripcion;
	private List<ResponseLista> infoEscuela;
}
