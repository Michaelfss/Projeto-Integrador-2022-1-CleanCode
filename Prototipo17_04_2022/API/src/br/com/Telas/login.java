package br.com.Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.API.dao.LoginDAO;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField Usuario;
	private JPasswordField Senha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblNewLabel.setBounds(196, 40, 55, 29);
		contentPane.add(lblNewLabel);
		
		Usuario = new JTextField();
		Usuario.setBounds(146, 80, 154, 20);
		contentPane.add(Usuario);
		Usuario.setColumns(10);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			contentPane.setLayout(null);Inicio frame = new Inicio(); frame. setVisible(true); dispose();
			
						
			}
		});
		btnEntrar.setBounds(218, 164, 89, 23);
		contentPane.add(btnEntrar);
		
		JButton btn = new JButton("Cadastrar");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setLayout(null);cadastrar frame = new cadastrar(); frame. setVisible(true); dispose();
			}
		});
		btn.setBounds(119, 164, 89, 23);
		contentPane.add(btn);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setBounds(90, 83, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Senha");
		lblNewLabel_2.setBounds(90, 114, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		Senha = new JPasswordField();
		Senha.setBounds(146, 111, 154, 20);
		contentPane.add(Senha);
	}

}
