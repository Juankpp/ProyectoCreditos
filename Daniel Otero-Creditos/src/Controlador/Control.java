package Controlador;
import java.text.*;

import javax.swing.JOptionPane;

import Modelo.Credito;
public class Control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controlador p = new Controlador();
		
		
		/**String sPeriodo = JOptionPane.showInputDialog("Ingrese el periodo: ");
		double periodo = Double.parseDouble(sPeriodo);
		String sInteres = JOptionPane.showInputDialog("Ingrese el interes: ");
		double interes = Double.parseDouble(sInteres)/100.0;
		String sInversion = JOptionPane.showInputDialog("ingrese la inversión: ");
		int iInversion = Integer.parseInt(sInversion);
		System.out.println(iInversion);
		double inversion = iInversion *1.0;
		System.out.println((long)inversion);
		*/
		//double inversion = Double.parseDouble(sInversion);
		
		//System.out.println(periodo +" "+ interes+" "+inversion );
		
		
		
		//Credito cre = new Credito(periodo,interes,inversion);
		//System.out.println(cre.efectiva());
		//System.out.println(cre.anualidad());
		//cre.valor();
		//cre.IniciarMatriz();
		
		//efectiva();
		//double p = 1.0/12.0;
		//double interes = 23.43/100.0;
		//System.out.println(interes);
		//double sol = efectiva(interes);
		//double sol2 = anualidad(sol,48.0);
		//double inver = 28070000.0;
		//valor(inver,sol2);
	}
	
	public static double efectiva(double pInteres) {
		
		double p1 = 1+pInteres;
		double p2 = 1.0/12.0;
		double operacion  = Math.pow(p1, p2);
		double sol = operacion-1;
		System.out.println(operacion-1);
		
		return sol;
		
		
		
	}
	public static double anualidad(double sol,double pPeriodo) {
		double p1 = 1 + sol;
		double p2 = pPeriodo*-1;
		double operacion = Math.pow(p1, p2);
		double s1 = 1- operacion;
		double s2 = s1/sol;
		System.out.println(s2);
		return s2;
	}
	public static void valor(double s1 , double s2) {
		double operacion = s1/s2;
		DecimalFormat df = new DecimalFormat("#");
		System.out.println("$"+ df.format(operacion));
		//System.out.println(operacion);
		
		
	}
}

