package br.com.Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class Consultacliente extends JFrame {

	private JPanel contentPane;
	private JTextField textConsultar;
	private JTable tableConsulta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consultacliente frame = new Consultacliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Consultacliente() {
		setTitle("Consultar Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnConsulta = new JButton("Consultar");
		btnConsulta.setBounds(335, 11, 89, 23);
		contentPane.add(btnConsulta);
		
		textConsultar = new JTextField();
		textConsultar.setBounds(20, 12, 305, 20);
		contentPane.add(textConsultar);
		textConsultar.setColumns(10);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(335, 55, 89, 23);
		contentPane.add(btnModificar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(335, 100, 89, 23);
		contentPane.add(btnExcluir);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(20, 54, 305, 196);
		contentPane.add(textArea);
		
		tableConsulta = new JTable();
		tableConsulta.setBounds(319, 246, -295, -191);
		
		contentPane.add(tableConsulta);
	}
}
