package br.com.Telas;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.API.dao.ClienteCadastroDAO;
import br.com.API.dao.LoginDAO;
import segundo_semestre.br.com.clean_code.back.ClienteCadastro;
import segundo_semestre.br.com.clean_code.back.Login;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class cadastrar extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cadastrar frame = new cadastrar();
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
	public cadastrar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 380, 343);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(143, 90, 86, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtSenha = new JTextField();
		txtSenha.setBounds(143, 140, 86, 20);
		contentPane.add(txtSenha);
		txtSenha.setColumns(10);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtUsuario.getText().equals("")||txtSenha.getText().equals("") ) {
					
					JOptionPane.showMessageDialog(null," Usuario/Senha em branco !!!");
					
				} else {
				
				
				contentPane.setLayout(null);login frame = new login(); frame. setVisible(true); dispose();
				
					LoginDAO loginDAO = new LoginDAO();
				
				Login c2 = new Login(txtUsuario.getText(),txtSenha.getText());	
				
				txtUsuario.setText("");
				txtSenha.setText("");
				

		        try {
					loginDAO.save(c2);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		        
				 
				 
			}	
			}
	});
		
		btnNewButton.setBounds(143, 173, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setBounds(164, 68, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(" Senha");
		lblNewLabel_2.setBounds(164, 121, 46, 17);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 51, 102));
		panel_1.setBounds(0, 0, 364, 46);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel = new JLabel(" Novo Usuario");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setForeground(Color.WHITE);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(0, 51, 102));
		panel_1_1.setBounds(0, 258, 364, 46);
		contentPane.add(panel_1_1);
	}
}
