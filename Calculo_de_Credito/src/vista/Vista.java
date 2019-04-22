package vista;

import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Vista extends JFrame {
	private JPanel contentPane;
	private JTextField txtInversion;
	private JTextField txtperiodo;
	private JTextField txtInteres;
	private JButton btnAceptar;
	private JButton btnCancelar;
	public Vista () {
		setTitle("Calculo Credito Fijo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setForeground(SystemColor.desktop);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtInversion = new JTextField();
		txtInversion.setBounds(159, 61, 96, 20);
		contentPane.add(txtInversion);
		txtInversion.setColumns(10);
		
		txtperiodo = new JTextField();
		txtperiodo.setBounds(159, 114, 96, 20);
		contentPane.add(txtperiodo);
		txtperiodo.setColumns(10);
		
		txtInteres = new JTextField();
		txtInteres.setBounds(159, 178, 96, 20);
		contentPane.add(txtInteres);
		txtInteres.setColumns(10);
		
		JLabel lblInversion = new JLabel(" Ingrese la inversion");
		lblInversion.setBounds(159, 36, 109, 14);
		contentPane.add(lblInversion);
		
		JLabel lblPeriodo = new JLabel("Ingrese el Periodo");
		lblPeriodo.setBounds(159, 89, 109, 14);
		contentPane.add(lblPeriodo);
		
		JLabel lblInteres = new JLabel("Ingrese el Interes");
		lblInteres.setBounds(159, 153, 96, 14);
		contentPane.add(lblInteres);
		
		JButton btnAceptar = new JButton("Aceptar");
		
		btnAceptar.setBounds(63, 227, 89, 23);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(248, 227, 89, 23);
		contentPane.add(btnCancelar);
		
		JLabel lblBienvenidosAMi = new JLabel("\u00A1Bienvenidos a mi programa!");
		lblBienvenidosAMi.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblBienvenidosAMi.setBackground(SystemColor.control);
		lblBienvenidosAMi.setBounds(112, 11, 200, 14);
		contentPane.add(lblBienvenidosAMi);
	}
	public JPanel getContentPane() {
		return contentPane;
	}
	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}
	public JTextField getTxtInversion() {
		return txtInversion;
	}
	public void setTxtInversion(JTextField txtInversion) {
		this.txtInversion = txtInversion;
	}
	public JTextField getTxtperiodo() {
		return txtperiodo;
	}
	public void setTxtperiodo(JTextField txtperiodo) {
		this.txtperiodo = txtperiodo;
	}
	public JTextField getTxtInteres() {
		return txtInteres;
	}
	public void setTxtInteres(JTextField txtInteres) {
		this.txtInteres = txtInteres;
	}
	public JButton getBtnAceptar() {
		return btnAceptar;
	}
	public void setBtnAceptar(JButton btnAceptar) {
		this.btnAceptar = btnAceptar;
	}
	public JButton getBtnCancelar() {
		return btnCancelar;
	}
	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelar = btnCancelar;
	}
	
	
}
