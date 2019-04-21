package Modelo;

import java.text.DecimalFormat;
import java.util.Locale;

public class Credito {
	
	private int periodo;
	private double interes;
	private double inversion;
	private double tasaEf;
	private double valorAnual;
	private double valorCuota;
	private double intereses;
	private double armotizacion;	
	private double saldoActual;
	private DecimalFormat a;
	
	
	
	public Credito(int periodo, double interes, double inversion) {
		this.periodo=periodo;
		this.interes=(interes*0.01);
		this.inversion=inversion;
		Locale.setDefault(Locale.US);
	 
	}
	
	public void crearFormatoDouble() {		 		
		        int num=(int)inversion;
				String numCeros=String.valueOf(num);					
				String formato = "";
				for (int i = 0; i < numCeros.length(); i++) {					
					if((i%3)==0&&i!=0) {						
						formato="0"+","+formato;
					}
					else
					formato="0"+formato;					
				}
				formato="#"+formato+".00";					
				a = new DecimalFormat(formato); 	
	}
	
	public String crearFormatoTitulosTabla(String palabra) {
		System.out.println(palabra);
		int num=(int)inversion;
		String numCeros=String.valueOf(num)+" $";		
		int numEspacios=numCeros.length()-palabra.length();
		String tab = "";
		String newPalabra="";
		if(numEspacios%2==0) {			
				while(numEspacios>0) {
					tab=tab+" ";
					numEspacios--;
				}			
			newPalabra=tab+palabra+tab;
		}
		else {
				while(numEspacios>0) {
					tab=tab+" ";
					numEspacios--;
				} 
			newPalabra=tab+palabra+tab+tab;			
		}
		
		System.out.println(newPalabra);
		return newPalabra;
	}
	
	
	
	public double calcularTasaEfectiva() {
		//-----------------------------------(1/12)---------
		crearFormatoDouble();
		
		double x = (Math.pow((1+interes), 0.08333333))-1;
			
		tasaEf=x;		
	    x=x*100;	
	    DecimalFormat b = new DecimalFormat("0.00"); 	
	    double StasaEf=tasaEf*100;	   
	   
	    return StasaEf;
	}
   
	public double calcularValorAnual() {
		crearFormatoDouble();		
		valorAnual=1+tasaEf;
		valorAnual=Math.pow(valorAnual, (periodo*-1));
		valorAnual=1-valorAnual;		
		valorAnual=valorAnual/tasaEf;		
		return valorAnual;
	}
	
	public double calcularValorCuota() {
		crearFormatoDouble();
		valorCuota=inversion/valorAnual;		
		return valorCuota;
	}
	
	public double calcularIntereses() {
		crearFormatoDouble();
		intereses=tasaEf*inversion;
		
		return intereses;
	}
	
	public double calcularArmotizacion() {
		crearFormatoDouble();
		armotizacion=valorCuota-intereses;
		
		return armotizacion;
	}
	
	public String hacerTabla() {
		crearFormatoDouble();
		DecimalFormat b = new DecimalFormat("#0.00");
		String tab="        ";
		String tabla="Cuota constante en pesos"+"\n"+"Cuota"+tab+tab+"--"+crearFormatoTitulosTabla("Saldo pesos")+"--"+tab+tab+"--"+crearFormatoTitulosTabla("Cuota pesos")+"--"+tab+tab
				+"--"+crearFormatoTitulosTabla("Intereses")+"--"+tab+tab+"--"+crearFormatoTitulosTabla("Armotizacion")+"--"+"\n";
		saldoActual=inversion;
		intereses=tasaEf*inversion;
		armotizacion=valorCuota-intereses;
		tabla=tabla+"   00"+tab+tab+a.format(inversion)+" $"+"\n";
		for (int i = 0; i < periodo; i++) {						 
			 if((saldoActual-armotizacion)>=0) {
				 if((i+1)<10) {
					 tabla=tabla+("   0"+(i+1));
				 }
				 else
					 tabla=tabla+("   "+(i+1));
				 tabla=tabla+tab+tab+a.format(saldoActual-armotizacion)+" $"+tab+tab+a.format(valorCuota)+" $"+tab+tab+a.format(tasaEf*saldoActual)+" %"+tab+tab+
							a.format(valorCuota-intereses)+" $"+tab+tab+"\n";
					saldoActual=saldoActual-armotizacion;
					intereses=tasaEf*saldoActual;
					armotizacion=valorCuota-intereses;
			 }
			 
			 else {
				 tabla=tabla+(i+1)+tab+tab+"   "+a.format(0)+"     "+"$"+tab+tab+a.format(valorCuota)+" "+"$"+tab+tab+a.format(tasaEf*saldoActual)+" "+"%"+tab+tab+
							a.format(valorCuota-intereses)+" "+"$"+tab+tab+"\n";
			 }
			 
		}
		
		tabla=tabla+"\n"+"Periodo : "+this.periodo+"\n"+"Interes : "+this.interes*100+"%"+"\n"+"Inversion : "+a.format(this.inversion)+" $"+"\n"+
		"Tasa Efectiva : "+b.format(calcularTasaEfectiva())+"%"+"\n"+"Valor Cuota : "+a.format(calcularValorCuota())+" $"+"\n"+"Valor Anual : "+b.format(calcularValorAnual())+" $";
		
		return tabla;
	}
	
	
}
