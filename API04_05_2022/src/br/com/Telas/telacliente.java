package br.com.Telas;


import java.awt.BorderLayout;
import javax.swing.text.MaskFormatter;

import br.com.API.dao.ClienteCadastroDAO;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import segundo_semestre.br.com.clean_code.back.ClienteCadastro;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JProgressBar;
import javax.swing.JFormattedTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;
import java.awt.Color;

public class  telacliente extends JFrame {

	private JPanel contentPane;
	private JTextField RazaoSocial;
	private JTextField Endereco;
	private JTextField Numero;
	private JTextField CEP;
	private JTextField CNPJ;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telacliente frame = new telacliente();
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
	public telacliente() {
		setTitle("Cadastro de Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 831, 491);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnavancar = new JButton("Avan\u00E7ar");
		btnavancar.setBounds(201, 356, 89, 23);
		
		
		btnavancar.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
			contentPane.setLayout(null);Upload frame = new Upload(); frame. setVisible(true);; dispose();
			
			
	
				
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnavancar);
		
		JCheckBox chckbxNao = new JCheckBox("N\u00E3o");
		chckbxNao.setBounds(103, 356, 62, 23);
		contentPane.add(chckbxNao);
		
		JCheckBox chckbxSim = new JCheckBox("Sim");
		chckbxSim.setBounds(22, 356, 61, 23);
		contentPane.add(chckbxSim);
		
		RazaoSocial = new JTextField();
		RazaoSocial.setBounds(123, 54, 287, 20);
		contentPane.add(RazaoSocial);
		RazaoSocial.setColumns(10);
		
		JLabel lblRazaoSocial = new JLabel("Raz\u00E3o Social");
		lblRazaoSocial.setBounds(22, 57, 91, 14);
		contentPane.add(lblRazaoSocial);
		
		
		Endereco = new JTextField();
		Endereco.setBounds(123, 119, 287, 20);
		Endereco.setColumns(10);
		contentPane.add(Endereco);
		
		Numero = new JTextField();
		Numero.setBounds(91, 150, 62, 20);
		Numero.setColumns(10);
		contentPane.add(Numero);
		
		JLabel lblCNPJ = new JLabel("CNPJ");
		lblCNPJ.setBounds(22, 91, 46, 14);
		contentPane.add(lblCNPJ);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o");
		lblEndereco.setBounds(22, 126, 61, 14);
		contentPane.add(lblEndereco);
		
		JLabel lblNumero = new JLabel("N\u00FAmero");
		lblNumero.setBounds(22, 153, 46, 14);
		contentPane.add(lblNumero);
		
		JLabel lblChecklist = new JLabel("Check List");
		lblChecklist.setFont(new Font("Arial Black", Font.PLAIN, 10));
		lblChecklist.setBounds(43, 317, 70, 14);
		contentPane.add(lblChecklist);
		
		CEP = new JTextField();
		CEP.setBounds(204, 150, 86, 20);
		contentPane.add(CEP);
		CEP.setColumns(10);
		
		JLabel lblCEP = new JLabel("CEP");
		lblCEP.setBounds(176, 153, 46, 14);
		contentPane.add(lblCEP);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(483, 356, 105, 23);
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ClienteCadastroDAO clientecadastroDao = new ClienteCadastroDAO();
				ClienteCadastro c1 = new ClienteCadastro(RazaoSocial.getText(), CNPJ.getText(), Endereco.getText(), Numero.getText(),CEP.getText());
				
				 RazaoSocial.setText("");
				 CNPJ.setText("");
				 Endereco.setText("");
				 Numero.setText("");
				 CEP.setText("");
		
		        try {
					clientecadastroDao.save(c1);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		        
			} 
			
			
			
		});
		contentPane.add(btnCadastrar);
		
		CNPJ = new JTextField();
		CNPJ.setBounds(101, 88, 197, 20);
		CNPJ.addKeyListener(new KeyAdapter() {
		
			
		});
		CNPJ.setToolTipText("");
		contentPane.add(CNPJ);
		CNPJ.setColumns(10);
		
		JButton btnLLimpar = new JButton("Limpar");
		btnLLimpar.setBounds(391, 356, 89, 23);
		contentPane.add(btnLLimpar);
		
		JButton btnNewButton = new JButton("Inicio");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setLayout(null);Inicio frame = new Inicio(); frame. setVisible(true);; dispose();
			}
		});
		btnNewButton.setBounds(292, 356, 89, 23);
		contentPane.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 51, 102));
		panel_1.setBounds(0, 406, 815, 46);
		contentPane.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(0, 51, 102));
		panel_1_1.setBounds(0, 0, 815, 46);
		contentPane.add(panel_1_1);
	}
}
