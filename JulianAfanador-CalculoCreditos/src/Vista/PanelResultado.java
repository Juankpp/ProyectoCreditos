package Vista;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import Modelo.Calculo;
import Modelo.Mundo;

public class PanelResultado extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	
	private JTable txtMonto;
	private DefaultTableModel modelo ;
	private String[] tituloColumnas;
	public PanelResultado() {
		setLayout(new BorderLayout());
		TitledBorder border = BorderFactory.createTitledBorder("Resultados");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		tituloColumnas = new String[]{
				"Cuota","Saldo pesos","Cuota pesos","Intereses","Amortizacion"
		};
		modelo = new DefaultTableModel();
		modelo.setColumnIdentifiers(tituloColumnas);
		txtMonto = new JTable(modelo);
		JScrollPane panel = new JScrollPane(txtMonto);
		 panel.setVerticalScrollBarPolicy(
		            JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		txtMonto.setForeground(Color.BLACK);
		txtMonto.setBackground(Color.WHITE);
		
		add(panel);
	}


	public JTable getTxtMonto() {
		return txtMonto;
	}

	public void setTxtMonto(JTable txtMonto) {
		this.txtMonto = txtMonto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public DefaultTableModel getModelo() {
		return modelo;
	}


	public void setModelo(DefaultTableModel modelo) {
		this.modelo = modelo;
	}
	
}