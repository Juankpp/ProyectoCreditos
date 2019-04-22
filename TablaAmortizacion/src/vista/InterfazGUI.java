package vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import controlador.Controlador;

public class InterfazGUI extends JFrame {
	private PanelEntrada panelEntrada;
	private PanelResultado panelResultados;
	private static final long serialVersionUID= 1L;
	public InterfazGUI(Controlador control)
	{
	setSize(900,700);
	setResizable(false);
	setTitle("Credito");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
	setLayout(new BorderLayout());
	
	panelEntrada= new PanelEntrada();
	add(panelEntrada,BorderLayout.NORTH);
	panelResultados=new PanelResultado();
	add(panelResultados,BorderLayout.CENTER);
	panelEntrada.getButConvertir().addActionListener(control);
	
	}
	public PanelEntrada getPanelEntrada() {
		return panelEntrada;
	}
	public void setPanelEntrada(PanelEntrada panelEntrada) {
		this.panelEntrada = panelEntrada;
	}
	public PanelResultado getPanelResultados() {
		return panelResultados;
	}
	public void setPanelResultados(PanelResultado panelResultados) {
		this.panelResultados = panelResultados;
	}
	
}
