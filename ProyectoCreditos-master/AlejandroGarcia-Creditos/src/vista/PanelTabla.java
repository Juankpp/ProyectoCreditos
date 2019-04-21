package vista;
/**
 * @author Alejandro Garcia olarte
 *
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class PanelTabla extends JPanel{
	private JTable tabla;
	private Ventana vista;
	private DefaultTableModel dtm;
	private String [][]datos;
	private String []cabe = {"cuota", "saldo", "cuota","intereses","amortizacion"};
	
	public PanelTabla(Ventana pVista) {
		vista=pVista;
		setLayout(null);
		setBorder(new TitledBorder("Cuota en pesos"));
		this.dtm= new DefaultTableModel(datos,cabe);
		tabla = new JTable(dtm);
		JScrollPane tab = new JScrollPane(tabla);
		add(tab);
		tab.setBounds(10,20,500,300);
		
	
	}

	public JTable getTabla() {
		return tabla;
	}

	public void setTabla(JTable tabla) {
		this.tabla = tabla;
	}

	public DefaultTableModel getDtm() {
		return dtm;
	}

	public void setDtm(DefaultTableModel dtm) {
		this.dtm = dtm;
	}

	public String[][] getDatos() {
		return datos;
	}

	public void setDatos(String[][] datos) {
		this.datos = datos;
	}

	public String[] getCabe() {
		return cabe;
	}

	public void setCabe(String[] cabe) {
		this.cabe = cabe;
	}

	
}
