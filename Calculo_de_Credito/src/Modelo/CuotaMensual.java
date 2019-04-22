package Modelo;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class CuotaMensual {
	private double saldoPesos [];
	private double  interesCuota [] ;
	double a,b,d;
	private ArrayList <Credito> table =new ArrayList<Credito> ();
	private double amortizacion[];
	private Credito credito = new Credito();
	
	public CuotaMensual() 
	{

	}
	public void TEfectividad() {
		double a= 1+ credito.getInteres();
		double b=0.0833333333; 
		double d= Math.pow(a, b);
		credito.setTef(d-1);
	}
	public void calcularInteres(double tasa) {
		credito.setInteres(tasa);
	}
	public void Anualidad() {
		TEfectividad();
		credito.setAnualidad((1-Math.pow((1+credito.getTef()),(-credito.getPeriodo())))/credito.getTef());
	}
	public void interesCuota() {

		saldoPesos= new double [credito.getPeriodo()+1];
		interesCuota=new double[credito.getPeriodo()+1];
		amortizacion=new double [credito.getPeriodo()+1];
		b=credito.getPeriodo();
		a=credito.getInteres();
		d=credito.getInversion();
		for (int i = 1; i <= credito.getPeriodo(); i++) 
		{
			credito=new Credito();
			credito.setPeriodo((int)b);
			credito.setInteres(a);
			credito.setInversion(d);
			saldoPesos[0]=credito.getInversion();
			Anualidad();
			credito.setCuota(credito.getInversion()/credito.getAnualidad());
			credito.setCuota(credito.getInversion()/credito.getAnualidad());
			credito.setInteresCuota(saldoPesos[i-1]*credito.getTef());
			interesCuota[i]=saldoPesos[i-1]*credito.getTef();
			credito.setAmortizacion(credito.getCuota()-interesCuota[i]);
			amortizacion[i]=credito.getCuota()-interesCuota[i];
			credito.setSaldoPesos(saldoPesos[i-1]-amortizacion[i]);
			saldoPesos[i]=saldoPesos[i-1] - amortizacion[i];
			if(credito.getSaldoPesos()<1) {credito.setSaldoPesos(0);}
			table.add(credito);
		}
	}
	public void Inversion(int inversion) {
		credito.setInversion(inversion);
	}

	public void mostrar() {

		calcularInteres(credito.getInteres());
		interesCuota();
		System.out.println("0"+""+ " / "+ saldoPesos[0]+" / "+ credito.getCuota()+" / "+interesCuota[0]+" / "+ amortizacion[0]);
		for(int i =0;i<table.size();i++)
		{
			System.out.println((i+1)+":"+ " / "+ table.get(i).getSaldoPesos()+" / "+ credito.getCuota()+" / "+table.get(i).getInteresCuota()+" / "+ table.get(i).getAmortizacion());
		}
		
		
		
	}
	public ArrayList<Credito> getTabla() {
		return table;
	}
	public ArrayList<Credito> setTable(ArrayList<Credito> a) {
		return this.table = a;
	}
	public Credito getCredito() {
		return credito;
	}
	public void setCredito(Credito credito) {
		this.credito = credito;
	}

}
