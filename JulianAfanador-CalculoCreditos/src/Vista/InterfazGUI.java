package Vista;
import java.awt.BorderLayout;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import Controlador.Controlador;

public class InterfazGUI extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PanelEntrada panelEntrada;
	private PanelResultado panelResultado;
	private PanelResultados panelResultados;
	public InterfazGUI(Controlador control) throws IOException {	
		setSize(800,500);
		setResizable(false);
		setTitle("Calculo de creditos");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		panelEntrada = new PanelEntrada();
		add(panelEntrada,BorderLayout.NORTH);
		panelResultado = new PanelResultado();
		add(panelResultado, BorderLayout.CENTER);
		panelResultados = new PanelResultados();
		add(panelResultados,BorderLayout.SOUTH);
		
		
		
		panelEntrada.getButConvertir().addActionListener(control);
		panelResultados.getButCalculo().addActionListener(control);
	}
	public PanelEntrada getPanelEntrada() {
		return panelEntrada;
	}
	public void setPanelEntrada(PanelEntrada panelEntrada) {
		this.panelEntrada = panelEntrada;
	}
	public PanelResultado getPanelResultado() {
		return panelResultado;
	}
	public void setPanelResultado(PanelResultado panelResultados) {
		this.panelResultado = panelResultados;
	}
	public PanelResultados getPanelResultados() {
		return panelResultados;
	}
	public void setPanelResultados(PanelResultados panelResultados) {
		this.panelResultados = panelResultados;
	}
}