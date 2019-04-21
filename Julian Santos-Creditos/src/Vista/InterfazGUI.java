package Vista;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import Controlador.Controlador;

public class InterfazGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	 PanelEntrada panelEntrada;
	public PanelEntrada getPanelEntrada() {
		return panelEntrada;
	}

	public void setPanelEntrada(PanelEntrada panelEntrada) {
		this.panelEntrada = panelEntrada;
	}

	public PanelResultados getPanelResultados() {
		return panelResultados;
	}

	public void setPanelResultados(PanelResultados panelResultados) {
		this.panelResultados = panelResultados;
	}

	PanelResultados panelResultados;
	
	public InterfazGUI(Controlador control) {
		
		setSize(500,900);
		setResizable(false);
		setTitle("Cálculo de Créditos de Cuota Fija");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		panelEntrada = new PanelEntrada();
		add(panelEntrada,BorderLayout.NORTH);
		
		panelResultados = new PanelResultados();
		add(panelResultados,BorderLayout.WEST);
		
		panelEntrada.getButCalcular().addActionListener(control);		
	}

	
}
