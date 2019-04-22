package vista;

import javax.swing.JOptionPane;

public class Interfaz {
	
	
	
	public Interfaz() {
		
	}
	
	public void escribirDato(double n,double interes,String monto, double tefec, double anual, double cuota) {
		JOptionPane.showMessageDialog(null, "para pagar "+"$"+monto+ " con "+n+" cuotas:"+"\n"+"La tasa de interés es del "+interes+"%"+"\n"+
	     "La tasa efectiva es de "+tefec+"%"+"\n"+
	     "La anualidad es de "+anual+"\n"+"La mensualidad es de "+"$"+cuota,"Cálculo de Crédito",JOptionPane.INFORMATION_MESSAGE);
		
	}

}
