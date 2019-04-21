package Vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel FilaSalida;
	public PanelResultados() {
		TitledBorder border = BorderFactory.createTitledBorder("Detalle Amortización por Periodo");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		FilaSalida = new JLabel("");
		FilaSalida.setFont(new Font("MonoSpaced",1,12));
		add(FilaSalida);
	}
	public JLabel getFilaSalida() {
		return FilaSalida;
	}
	public void setFilaSalida(JLabel filaSalida) {
		FilaSalida = filaSalida;
	}

}