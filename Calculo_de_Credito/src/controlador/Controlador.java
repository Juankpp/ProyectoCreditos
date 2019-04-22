package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Closeable;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import Modelo.CuotaMensual;
import vista.GUI2;
import vista.Vista;
import vista.VistaPrincipal;


public class Controlador  implements ActionListener{
	private CuotaMensual bd;
	public VistaPrincipal vp;
	private Vista v1;
	private GUI2 v2;
	
	public Controlador() 
	{
	vp=new VistaPrincipal(this);
	bd=new CuotaMensual();
	vp.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	if (e.getSource() == vp.btnAceptar) {
	bd.getCredito().setInteres(Double.parseDouble(vp.txtInteres.getText()));
	bd.getCredito().setPeriodo(Integer.parseInt(vp.txtperiodo.getText()));
	bd.getCredito().setInversion(Double.parseDouble(vp.txtInversion.getText()));
	bd.mostrar();
	v2=new GUI2();
	v2.getModelo().addColumn("cuota");
	v2.getModelo().addColumn("saldo pesos");
	v2.getModelo().addColumn("cuota pesos");
	v2.getModelo().addColumn("intereses");
	v2.getModelo().addColumn("amortizacion");
	
	Object [] fila= new Object[v2.getModelo().getColumnCount()];
	for(int i=0;i<bd.getTabla().size();i++) {
		fila[0] = i;
		fila[1]= bd.getTabla().get(i).getSaldoPesos();
		fila[2]=bd.getTabla().get(i).getCuota();
		fila[3]=bd.getTabla().get(i).getInteresCuota();
		fila[4]=bd.getTabla().get(i).getAmortizacion();
		v2.getModelo().addRow(fila);
	}
	v2.getTable().setModel(v2.getModelo());
	v2.getTable().resize(800, 800);
	v2.setVisible(true);

	}
	if (e.getSource()==vp.btnCancelar){
	System.exit(0);
	}
	}
	
}
