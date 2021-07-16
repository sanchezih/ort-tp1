package p1.tp5.ej11.clases;

import edu.ort.tp1.u5.tda.nodos.ListaOrdenadaNodos;

public class ListaElectoresAlfabetica extends ListaOrdenadaNodos<String, Elector> {

	@Override
	public int compare(Elector dato1, Elector dato2) {
		return dato1.getNombreCompleto().compareTo(dato2.getNombreCompleto());
	}

	@Override
	public int compareByKey(String clave, Elector elemento) {
		return clave.compareTo(elemento.getNombreCompleto());
	}

}
