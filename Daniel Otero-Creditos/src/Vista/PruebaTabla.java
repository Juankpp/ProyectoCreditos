

package Vista;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;

public class PruebaTabla extends JPanel {
	
	
	
	public PruebaTabla(String[][] credito) {
		
		
		
		
		
		setLayout(new GridLayout(6,7));
		//setLayout(new FlowLayout());
		TitledBorder border = BorderFactory.createTitledBorder("Tabla de crédito: ");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		//JFrame f;    
	      
	    //f=new JFrame();
		//double data [][] = {{},{},{}};
	    String data[][]={ {"101","Amit","670000","",""},    
	                          {"102","Jai","780000","",""},    
	                          {"101","Sachin","700000","",""},
	                          {"101","Sachin","700000","",""},
	                          {"101","Sachin","700000","",""}};    
	    String column[]={"#Cuota","Saldo","Cuota Pesos","Interes","Amortización"};         
	    JTable jt=new JTable(credito,column);    
	    //jt.setBounds(200,200,800,1000);  
	    jt.setBounds(40,60,1000,2000);   
	    JScrollPane sp=new JScrollPane(jt);
	    //add(jt);
	    add(sp);
	   // f.add(sp); 
	

	}
}

