package Modelo;

//Representa el mundo del problema: las clases y métodos que describen el problema 
//Pueden reemplazar el nombre de la clase "Mundo" por el que necesiten.

public class Mundo {

	
	private Credito c1;
	private Archivo a1;
	
	public Mundo() {
	

			
		
	}

	public String newCredit(double vCredito,double intereses,int time)
	{
		String rta="";
		c1= new Credito(vCredito, time, intereses);
		a1= new Archivo();
		
		rta=c1.imprimirCredito();
		a1.escribirArchivo(rta);
		
		return rta;
		
	}
	
	
	
}
