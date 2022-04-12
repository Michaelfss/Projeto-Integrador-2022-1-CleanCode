package br.com.Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField textUsuario;
	private JTextField textSenha;

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
		
		textUsuario = new JTextField();
		textUsuario.setBounds(146, 80, 154, 20);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);
		
		textSenha = new JTextField();
		textSenha.setColumns(10);
		textSenha.setBounds(146, 111, 154, 20);
		contentPane.add(textSenha);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setBounds(234, 204, 89, 23);
		contentPane.add(btnNewButton);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(56, 169, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_1.setBounds(174, 168, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_2.setBounds(285, 169, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JButton btn = new JButton("Cadastrar");
		btn.setBounds(122, 204, 89, 23);
		contentPane.add(btn);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setBounds(90, 83, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Senha");
		lblNewLabel_2.setBounds(90, 114, 46, 14);
		contentPane.add(lblNewLabel_2);
	}
}
