package modelo;

import java.text.NumberFormat;
import java.util.Locale;

public class Tabla {
	public String[][] tabla;


	public Tabla(double periodo)
	{
		tabla= new String[(int) periodo+1][5];
		
	}
	public void columna1(double periodo, double cuota,  double saldo, double intereses, double tasaEfectiva )
	{
		Locale co = new Locale("co","colombia");
		NumberFormat nf= NumberFormat.getInstance(co);
		nf.format(periodo);
		int numCuota=0;
		double inte=0;
		double amo=0;
		double sal=saldo;
		tabla[0][1]=nf.format(saldo);
		tabla[0][0]="0";
		tabla[0][2]="0";
		tabla[0][3]="0";
		tabla[0][4]="0";
		

		for (int i = 1; i < periodo+1; i++) {
			inte= sal*tasaEfectiva; 
			amo=cuota-inte;
			sal=sal-amo;
				tabla[i][0]=""+i;
				tabla[i][2]=nf.format(cuota);
				tabla[i][3]=nf.format(inte);
				tabla[i][4]=nf.format(amo);
				tabla[i][1]=nf.format(sal);
				

			
		}
	}
	public String[][] getTabla() {
		return tabla;
	}
	public void setTabla(String[][] tabla) {
		this.tabla = tabla;
	}
	
	
}
