package br.com.Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Upload extends JFrame {

	private JPanel contentPane;
	private JTextField textUploud;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Upload frame = new Upload();
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
	public Upload() {
		setTitle("Upload");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnreturn = new JButton("Retornar");
		btnreturn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				contentPane.setLayout(null);telacliente frame = new telacliente(); frame. setVisible(true); dispose();
				
				
			}
									
			
		});
		btnreturn.setBounds(23, 227, 89, 23);
		contentPane.add(btnreturn);
		
		JButton btnNewButton = new JButton("Proximo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setLayout(null);Consultacliente frame = new Consultacliente (); frame. setVisible(true); dispose();
			}
		});
		btnNewButton.setBounds(324, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblupload = new JLabel("Upload");
		lblupload.setBounds(26, 26, 46, 14);
		contentPane.add(lblupload);
		
		textUploud = new JTextField();
		textUploud.setBounds(68, 23, 189, 20);
		contentPane.add(textUploud);
		textUploud.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Enviar");
		btnNewButton_1.setBounds(290, 22, 71, 23);
		contentPane.add(btnNewButton_1);
	}

}
