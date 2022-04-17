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
		setBounds(100, 100, 544, 301);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnavancar = new JButton("Avan\u00E7ar");
		
		
		btnavancar.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
			contentPane.setLayout(null);Upload frame = new Upload(); frame. setVisible(true);; dispose();
			
			
	
				
			}
		});
		btnavancar.setBounds(435, 208, 89, 23);
		contentPane.add(btnavancar);
		
		JCheckBox chckbxNao = new JCheckBox("N\u00E3o");
		chckbxNao.setBounds(62, 208, 45, 23);
		contentPane.add(chckbxNao);
		
		JCheckBox chckbxSim = new JCheckBox("Sim");
		chckbxSim.setBounds(22, 208, 45, 23);
		contentPane.add(chckbxSim);
		
		RazaoSocial = new JTextField();
		RazaoSocial.setBounds(107, 26, 287, 20);
		contentPane.add(RazaoSocial);
		RazaoSocial.setColumns(10);
		
		JLabel lblRazaoSocial = new JLabel("Raz\u00E3o Social");
		lblRazaoSocial.setBounds(22, 29, 70, 14);
		contentPane.add(lblRazaoSocial);
		
		
		Endereco = new JTextField();
		Endereco.setColumns(10);
		Endereco.setBounds(107, 88, 287, 20);
		contentPane.add(Endereco);
		
		Numero = new JTextField();
		Numero.setColumns(10);
		Numero.setBounds(107, 123, 62, 20);
		contentPane.add(Numero);
		
		JLabel lblCNPJ = new JLabel("CNPJ");
		lblCNPJ.setBounds(22, 60, 46, 14);
		contentPane.add(lblCNPJ);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o");
		lblEndereco.setBounds(22, 91, 46, 14);
		contentPane.add(lblEndereco);
		
		JLabel lblNumero = new JLabel("N\u00FAmero");
		lblNumero.setBounds(22, 126, 46, 14);
		contentPane.add(lblNumero);
		
		JLabel lblChecklist = new JLabel("Check List");
		lblChecklist.setBounds(37, 187, 70, 14);
		contentPane.add(lblChecklist);
		
		CEP = new JTextField();
		CEP.setBounds(218, 123, 86, 20);
		contentPane.add(CEP);
		CEP.setColumns(10);
		
		JLabel lblCEP = new JLabel("CEP");
		lblCEP.setBounds(188, 126, 46, 14);
		contentPane.add(lblCEP);
		
		JButton btnCadastrar = new JButton("Cadastrar");
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
		btnCadastrar.setBounds(245, 208, 89, 23);
		contentPane.add(btnCadastrar);
		
		CNPJ = new JTextField();
		CNPJ.addKeyListener(new KeyAdapter() {
		
			
		});
		CNPJ.setToolTipText("");
		CNPJ.setBounds(107, 57, 197, 20);
		contentPane.add(CNPJ);
		CNPJ.setColumns(10);
		
		JButton btnLLimpar = new JButton("Limpar");
		btnLLimpar.setBounds(344, 208, 89, 23);
		contentPane.add(btnLLimpar);
	}
}
