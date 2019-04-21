package Controlador;

import Modelo.Credito;
import Modelo.Mundo;
import Vista.Interfaz;

public class Controlador {
	private Mundo m;
	private Interfaz i;
	
	public Controlador() {
		
		m= new Mundo();
		i = new Interfaz();
		m.getC().setPeriodo(Integer.parseInt(i.escribirPeriodo()));;
		m.getC().setInteres(Double.parseDouble((i.escribirInteres())));
		m.getC().setInversion(Integer.parseInt(i.escribirInversion()));
		i.mostrarResultado("Tasa Efectiva: "+m.getC().calcularTasaEfectivo()*100+" %"+"\n"+"Valor Anualidad: "+m.getC().calcularValorAnualidad()+"\n"
		+"Valor Cuota: $"+m.getC().calcularCuota());
		m.getC().tablasCuotas();
	}

}
