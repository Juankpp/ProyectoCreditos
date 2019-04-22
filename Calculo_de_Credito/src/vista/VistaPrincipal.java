package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controlador.Controlador;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaPrincipal extends JFrame {

	public JPanel contentPane;
	public JTextField txtInversion;
	public JTextField txtperiodo;
	public JTextField txtInteres;
	public JButton btnAceptar;
	public JButton btnCancelar;
	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 * @param controlador 
	 */
	public VistaPrincipal(Controlador c) {
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
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(c);
		btnAceptar.setBounds(63, 227, 89, 23);
		contentPane.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(248, 227, 89, 23);
		btnCancelar.addActionListener(c);
		contentPane.add(btnCancelar);
		
		JLabel lblBienvenidosAMi = new JLabel("\u00A1Bienvenidos a mi programa!");
		lblBienvenidosAMi.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblBienvenidosAMi.setBackground(SystemColor.control);
		lblBienvenidosAMi.setBounds(112, 11, 200, 14);
		contentPane.add(lblBienvenidosAMi);
		
	}
	

}
