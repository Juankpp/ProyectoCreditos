package modelo;
/**
 * @author Alejandro Garcia olarte
 *
 */
import java.text.DecimalFormat;

public class Mundo {
	
	public final static int COLUMNAS = 5;
	
	private Credito credito;
	private Tabla tabla;
	private String[]filas;
	DecimalFormat dineros = new DecimalFormat("\u00A5###,###.#");
	DecimalFormat doubles = new DecimalFormat("###,###.###");

	
	public Mundo() {
		
		iniciarTabla();
		
	}
	public void iniciarTabla() {
		credito = new Credito();
		tabla = new Tabla();
		filas = new String[COLUMNAS];



		
	}
	public void iniciarFila0() {
		filas[0] ="0";
		filas[1] =dineros.format(credito.getInvercion());
		filas[2] ="0";
		filas[3] ="0";
		filas[4] ="0";		

		
	}
	
	public String[] calFilas() {
		double Vinteres=tabla.getIntereses();
		double amortiz =tabla.getAmortizacion();
		double periodo =tabla.getPeriodo();
		double tazaEf = credito.getTazaEfectiva();
		double saldoCre= tabla.getSaldo();
		double vCuota=credito.getValorCuota();
		
		if (periodo == 0) {
			 saldoCre= credito.getInvercion();

		}
		//String[]ifilas =new String[5];
			//while(tabla.getSaldo()>=0) {		
				Vinteres =  +saldoCre*tazaEf;
				tabla.setIntereses(Vinteres);
				amortiz = vCuota-Vinteres;
				tabla.setAmortizacion(amortiz);
				saldoCre=  saldoCre-amortiz;
				tabla.setSaldo(saldoCre);
				periodo++;
				tabla.setPeriodo(periodo);
				
				this.filas[0] =doubles.format(periodo);
				this.filas[1] =dineros.format(saldoCre);
				this.filas[2] =dineros.format(vCuota);
				this.filas[3] =dineros.format(Vinteres);
				this.filas[4] =dineros.format(amortiz);
				//System.out.println ("periodo "+periodo+ " "+ "saldoCre "+saldoCre+ " " +"Cuota "+ vCuota+ " " +"intereses "+ Vinteres+ " " + "amortizacion "+amortiz );
				
				//}
			return filas;
			/* Vinteres =  +saldoCre*tazaEf;
			tabla.setIntereses(Vinteres);
			amortiz = vCuota-Vinteres;
			tabla.setAmortizacion(amortiz);
			saldoCre=  saldoCre-amortiz;
			tabla.setSaldo(saldoCre);
			periodo--;
			tabla.setPeriodo(periodo);*/
	}

	public double calTazaEf(double interes) {
		
		double va= 0.0;
		double inteN = (interes/100);
		double unaoladoce =(double )1/12;
		va = (double) Math.pow((1+(inteN)),(unaoladoce))-1;
		credito.setTazaEfectiva(va);//falta el *100
		
		return va*100;
	}
	
	public double calValorAnual(double tazaEf , int periodo) {
		
		double va= 0.0;
		double taEf= tazaEf/100;
		va = (double) (1-(Math.pow((1+taEf),-(periodo))))/(taEf);
		credito.setValorAnualidad(va);


		return va;
	}
	public int calValorCuota(double invercion , double Vanual) {
		
		int va= 0;
		va = (int) (invercion/Vanual);
		credito.setValorCuota(va);
		return va;
	}

	public Credito getCredito() {
		return credito;
	}

	public void setCredito(Credito credito) {
		this.credito = credito;
	}



	public Tabla getTabla() {
		return tabla;
	}



	public void setTabla(Tabla tabla) {
		this.tabla = tabla;
	}



	public String[] getFilas() {
		return filas;
	}



	public void setFilas(String[] filas) {
		this.filas = filas;
	}






	
	

}
