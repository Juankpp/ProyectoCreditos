package Vista;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Interfaz {

	public Interfaz() {
		// TODO Auto-generated constructor stub

	}

	/*
	 * metodo de prueba que pide un dato por JOptionPane y retorna el String
	 * correspondiente Reemplazar por lo que se necesiten
	 */

	public String pedirDato(String mensaje) {
		String x = "";
		x = mensaje;
		return (JOptionPane.showInputDialog(x));
	}

	/*
	 * metodo de prueba que imprime un dato procesado por un método declarado en
	 * Reemplazar por lo que se necesiten
	 */

	public void escribirDato(String dato, String mensaje) {
		String x = "";
		x = mensaje;
		JOptionPane.showMessageDialog(null, new JTextArea(dato), x, JOptionPane.INFORMATION_MESSAGE);

	}

}
