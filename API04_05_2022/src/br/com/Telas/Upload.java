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
import java.awt.Color;

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
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Enviar");
		btnNewButton_1.setBounds(158, 57, 71, 23);
		contentPane.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 51, 102));
		panel_1.setBounds(0, 0, 434, 46);
		contentPane.add(panel_1);
		
		textUploud = new JTextField();
		textUploud.setBounds(10, 58, 137, 20);
		contentPane.add(textUploud);
		textUploud.setColumns(10);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(0, 51, 102));
		panel_1_1.setBounds(0, 215, 434, 46);
		contentPane.add(panel_1_1);
		
		JButton btnreturn = new JButton("Retornar");
		panel_1_1.add(btnreturn);
		btnreturn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				contentPane.setLayout(null);telacliente frame = new telacliente(); frame. setVisible(true); dispose();
				
				
			}
									
			
		});
		
		JButton btnNewButton = new JButton("Proximo");
		panel_1_1.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setLayout(null);Consultacliente frame = new Consultacliente (); frame. setVisible(true); dispose();
			}
		});
	}

}
