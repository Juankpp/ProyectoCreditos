package vista;

import java.awt.BorderLayout;
import java.awt.ScrollPane;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Tabla extends JFrame{
public Tabla(String[][] ds)
{
	setTitle("Calculo de creditos a cuota fija");
	setBounds(400,400,400,400);
	JTable tablaCredito=new JTable(ds, nombreColumna);
	add(new JScrollPane(tablaCredito),BorderLayout.CENTER);
	
}
private String [] nombreColumna={"Cuota","Saldo Pesos","Cuota Pesos","Interese","Amortizacion"};
}
