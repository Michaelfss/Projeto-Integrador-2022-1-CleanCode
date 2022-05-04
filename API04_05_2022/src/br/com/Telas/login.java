package br.com.Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.API.dao.LoginDAO;
import segundo_semestre.br.com.clean_code.back.Login;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;

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
		setBounds(100, 100, 351, 377);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Usuario = new JTextField();
		Usuario.setBounds(98, 82, 145, 20);
		contentPane.add(Usuario);
		Usuario.setColumns(10);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
				LoginDAO loginDAO = new LoginDAO();
				
				// if(Usuario.getText().equals("")||Senha.getPassword().equals("") ) {
			     String S= String.copyValueOf(Senha.getPassword());
			     
				 try {
					if(loginDAO.consultar(Usuario.getText(),S)) {	
						   contentPane.setLayout(null);Inicio frame = new Inicio(); frame. setVisible(true); dispose();
					  
						
						
					} 
					 else {
					
						JOptionPane.showMessageDialog(null," Usuario/Senha Invalidos!!!");
					 }
				} catch (Exception e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
				Usuario.setText("");
				Senha.setText("");
				

		      
		        
				 
				 
				
			}
		});
		btnEntrar.setBounds(129, 152, 89, 23);
		contentPane.add(btnEntrar);
		
		JButton btn = new JButton("Novo Acesso");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setLayout(null);cadastrar frame = new cadastrar(); frame. setVisible(true); dispose();
			}
		});
		btn.setBounds(116, 198, 120, 23);
		contentPane.add(btn);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setBounds(149, 67, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Senha");
		lblNewLabel_2.setBounds(149, 106, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		Senha = new JPasswordField();
		Senha.setBounds(98, 121, 145, 20);
		contentPane.add(Senha);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 51, 102));
		panel.setBounds(0, 0, 335, 46);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setForeground(Color.WHITE);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 16));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 51, 102));
		panel_1.setBounds(0, 292, 335, 46);
		contentPane.add(panel_1);
	}
}
