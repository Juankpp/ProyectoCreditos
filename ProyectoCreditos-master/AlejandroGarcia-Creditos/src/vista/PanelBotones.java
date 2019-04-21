package vista;
/**
 * @author Alejandro Garcia olarte
 *
 */
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import controlador.Controlador;

public class PanelBotones extends JPanel {
	private JButton btnSalir;
	private Ventana vista;
	private Controlador controlador;

	
	public PanelBotones(Ventana pVista) {
		vista = pVista;
		setLayout(null);
		
		btnSalir = new JButton("acepar");
		
		btnSalir.setActionCommand(vista.SALIR);
		
		add(btnSalir);
		btnSalir.setBounds(10,10,150, 20);

	}


	public JButton getBtnSalir() {
		return btnSalir;
	}


	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}
	
}
