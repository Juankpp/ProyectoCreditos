package modelo;

import java.text.DecimalFormat;

public class Credito {
	
	private double inversion;
	private double interes; 
	private int periodo;
	private double tasaEfectiva;
	private double valorAnualidad;
	private double cuota;
	private double amortizacion=0;
	private DecimalFormat df = new DecimalFormat("#.00");
	private String tabla = "";//"[Cuota]               [Saldo Pesos]     [Cuota]                [Intereses]           [Amortizacion]" ;
	
	public Credito (double pInversion, int pPeriodo, double pInteres) {
		
		this.inversion=pInversion;
		this.periodo = pPeriodo;
		this.interes = pInteres/100;
		tabla+= "CALCULO DE CREDITOS DE CUOTA FIJA\n\nPeriodo(n):		"+periodo+"\nInteres:		"+pInteres+"%\nInversion:		"+df.format(inversion)+"\n";

				
	}
	
	public void calcularTasaEfectiva () {
		
		//tasaEfectiva = Math.pow(interes+1, 0.083333)-1; //el 0.08333 es el resultado de 1/12
		//tasaEfectiva = (double)Math.round((Math.pow(interes+1, 0.083333)-1) *1000d)/1000d;
		tasaEfectiva = Math.pow(interes+1, 0.083333)-1;
		
		//System.out.println("Tasa efectiva: "+tasaEfectiva);
		tabla+="Tasa efectiva:		"+df.format(tasaEfectiva*100)+"%\n";
		//return tasaEfectiva ;//tasaEfectiva; se le debe mostrar al usuario pero en porcentaje, se multiplica por 100 ej= si es 0.02>> 2,0% con stringFormat
	}
	
	public void calcularValorAnualidad() {
		
		valorAnualidad=(1-(Math.pow(1+tasaEfectiva, -periodo)))/tasaEfectiva;
		//valorAnualidad=(double)Math.round( ((1-(Math.pow(1+tasaEfectiva, -periodo)))/tasaEfectiva) *1000d)/1000d;
		//System.out.println("Valor anualidad: "+valorAnualidad);
		tabla+="Valor Anualidad:	"+valorAnualidad+"\n";
	//	return valorAnualidad;
	}
	
	public void calcularCuota () {
		cuota+=inversion/valorAnualidad;
		//cuota+=(double)Math.round((inversion/valorAnualidad)*100d)/100d;
		//System.out.println("Cuota: "+cuota);
		tabla+="Valor Cuota:		"+df.format(cuota)+"\n\n";
		//return cuota;
	}
	
	public String mostrarTabla () {
		double saldo = inversion;
		double intereses = 0;
				
		tabla+="[Cuota]               [Saldo Pesos]     [Cuota]                [Intereses]           [Amortizacion]" ;
		for (int i = 0; i < periodo+1; i++) {
			
			tabla+= "\n["+i+"]"+"	"+df.format(saldo)+"	"+df.format(cuota)+"	"+df.format(intereses)+"	"+df.format(amortizacion);
			amortizacion = cuota - intereses;
			intereses=(saldo*tasaEfectiva);
			if(amortizacion>saldo) {
				//System.out.println("la amortizacion "+amortizacion+"es mayor al saldo "+saldo );
				amortizacion=saldo;
				saldo-=amortizacion;
				
			}else {
			saldo-=amortizacion;
			}
			//System.out.println(intereses);
		}
	//	System.out.println("Se imprimio la tabla\n");
	//	System.out.println(tabla);
		return tabla;
	}

}
