package vista;
/**
 * @author Alejandro Garcia olarte
 *
 */
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controlador.Controlador;

public class Ventana extends JFrame{
	 
	private PanelDatos panelDatos;
	private PanelTabla panelTabla;
	private PanelBotones panelBotones;

	
	private Controlador controlador;
	
	public static final String SALIR = "falirrr";
	
	public Ventana(Controlador pControlador) {
		controlador = pControlador;
		
		setTitle("Tabla de Amortisacion");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(860,400);
		setLayout(null);
		
		panelDatos = new PanelDatos(this);
		panelTabla = new PanelTabla(this);
		panelBotones = new PanelBotones(this);
		panelBotones.getBtnSalir().addActionListener(controlador);
		int x = 10;
		int y = 10;

		add(panelDatos);
		panelDatos.setBounds(x,y,300, 250);

		add(panelTabla);
		panelTabla.setBounds(x*31,y,525, 325);

		add(panelBotones);
		panelBotones.setBounds(x,y*30,160, 100);

		
	}

	public PanelDatos getPanelDatos() {
		return panelDatos;
	}

	public void setPanelDatos(PanelDatos panelDatos) {
		this.panelDatos = panelDatos;
	}

	public PanelTabla getPanelTabla() {
		return panelTabla;
	}

	public void setPanelTabla(PanelTabla panelTabla) {
		this.panelTabla = panelTabla;
	}

	public PanelBotones getPanelBotones() {
		return panelBotones;
	}

	public void setPanelBotones(PanelBotones panelBotones) {
		this.panelBotones = panelBotones;
	}
	

}
