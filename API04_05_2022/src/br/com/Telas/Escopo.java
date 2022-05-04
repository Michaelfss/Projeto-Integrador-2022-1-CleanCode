package br.com.Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;

public class Escopo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Escopo frame = new Escopo();
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
	public Escopo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 870, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cleinte");
		lblNewLabel.setBounds(28, 24, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblCnpj = new JLabel("CNPJ");
		lblCnpj.setBounds(28, 62, 46, 14);
		contentPane.add(lblCnpj);
		
		textField = new JTextField();
		textField.setBounds(100, 21, 143, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(100, 59, 143, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Produto/Operations");
		lblNewLabel_1.setBounds(28, 164, 97, 14);
		contentPane.add(lblNewLabel_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Nxt.Operations");
		chckbxNewCheckBox.setBounds(28, 185, 143, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Nxt. Matching e Risk");
		chckbxNewCheckBox_1.setBounds(28, 211, 143, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JLabel lblNewLabel_2 = new JLabel("Dados Minimos");
		lblNewLabel_2.setBounds(192, 164, 105, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(182, 186, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Obejetivo do Negocio");
		lblNewLabel_3.setBounds(690, 24, 119, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Entregaveis Minimos");
		lblNewLabel_4.setBounds(341, 24, 137, 14);
		contentPane.add(lblNewLabel_4);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(319, 49, 159, 96);
		contentPane.add(textPane);
		
		JLabel lblNewLabel_5 = new JLabel("Entregaveis Possiveis");
		lblNewLabel_5.setBounds(526, 24, 118, 14);
		contentPane.add(lblNewLabel_5);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(506, 49, 159, 96);
		contentPane.add(textPane_1);
		
		JLabel lblNewLabel_6 = new JLabel("Funcionalidade");
		lblNewLabel_6.setBounds(369, 184, 119, 14);
		contentPane.add(lblNewLabel_6);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Paineis de Solu\u00E7oes");
		chckbxNewCheckBox_2.setBounds(341, 205, 151, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		JLabel lblNewLabel_7 = new JLabel("Setor");
		lblNewLabel_7.setBounds(28, 97, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		textField_4 = new JTextField();
		textField_4.setBounds(100, 94, 143, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Gerador de Relatorios");
		chckbxNewCheckBox_4.setBounds(341, 231, 186, 23);
		contentPane.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Buscar(NLP)");
		chckbxNewCheckBox_5.setBounds(341, 258, 97, 23);
		contentPane.add(chckbxNewCheckBox_5);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("Data Lake Generator");
		chckbxNewCheckBox_6.setBounds(341, 283, 151, 23);
		contentPane.add(chckbxNewCheckBox_6);
		
		JLabel lblNewLabel_8 = new JLabel("CORE");
		lblNewLabel_8.setBounds(610, 171, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("Web App");
		chckbxNewCheckBox_7.setBounds(571, 211, 97, 23);
		contentPane.add(chckbxNewCheckBox_7);
		
		JCheckBox chckbxNewCheckBox_8 = new JCheckBox("API gateway");
		chckbxNewCheckBox_8.setBounds(571, 237, 97, 23);
		contentPane.add(chckbxNewCheckBox_8);
		
		JCheckBox chckbxNewCheckBox_9 = new JCheckBox("Filas");
		chckbxNewCheckBox_9.setBounds(571, 258, 97, 23);
		contentPane.add(chckbxNewCheckBox_9);
		
		JCheckBox chckbxNewCheckBox_10 = new JCheckBox("step function");
		chckbxNewCheckBox_10.setBounds(571, 283, 97, 23);
		contentPane.add(chckbxNewCheckBox_10);
		
		JCheckBox chckbxNewCheckBox_11 = new JCheckBox("lambda");
		chckbxNewCheckBox_11.setBounds(571, 309, 97, 23);
		contentPane.add(chckbxNewCheckBox_11);
		
		JCheckBox chckbxNewCheckBox_12 = new JCheckBox("Fargete");
		chckbxNewCheckBox_12.setBounds(670, 211, 97, 23);
		contentPane.add(chckbxNewCheckBox_12);
		
		JCheckBox chckbxNewCheckBox_13 = new JCheckBox("Conteiners");
		chckbxNewCheckBox_13.setBounds(670, 237, 97, 23);
		contentPane.add(chckbxNewCheckBox_13);
		
		JCheckBox chckbxNewCheckBox_14 = new JCheckBox("S3");
		chckbxNewCheckBox_14.setBounds(670, 258, 97, 23);
		contentPane.add(chckbxNewCheckBox_14);
		
		JCheckBox chckbxNewCheckBox_15 = new JCheckBox("mongodb");
		chckbxNewCheckBox_15.setBounds(670, 283, 97, 23);
		contentPane.add(chckbxNewCheckBox_15);
		
		JCheckBox chckbxNewCheckBox_16 = new JCheckBox("Parquet");
		chckbxNewCheckBox_16.setBounds(670, 309, 97, 23);
		contentPane.add(chckbxNewCheckBox_16);
		
		JCheckBox chckbxNewCheckBox_17 = new JCheckBox("Quicksight");
		chckbxNewCheckBox_17.setBounds(571, 335, 97, 23);
		contentPane.add(chckbxNewCheckBox_17);
		
		JCheckBox chckbxNewCheckBox_17_1 = new JCheckBox("Cloudwatch");
		chckbxNewCheckBox_17_1.setBounds(670, 335, 97, 23);
		contentPane.add(chckbxNewCheckBox_17_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(690, 49, 143, 96);
		contentPane.add(textPane_2);
		
		JLabel lblNewLabel_9 = new JLabel("Produto/Demand");
		lblNewLabel_9.setBounds(28, 262, 119, 14);
		contentPane.add(lblNewLabel_9);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(177, 212, 86, 20);
		contentPane.add(textField_3);
		
		JCheckBox chckbxNewCheckBox_18 = new JCheckBox("Vox");
		chckbxNewCheckBox_18.setBounds(28, 294, 97, 23);
		contentPane.add(chckbxNewCheckBox_18);
		
		JCheckBox chckbxNewCheckBox_19 = new JCheckBox("Marketing & Planning");
		chckbxNewCheckBox_19.setBounds(28, 320, 143, 23);
		contentPane.add(chckbxNewCheckBox_19);
		
		JCheckBox chckbxNewCheckBox_20 = new JCheckBox("Sales & Distribution");
		chckbxNewCheckBox_20.setBounds(28, 346, 151, 23);
		contentPane.add(chckbxNewCheckBox_20);
		
		JCheckBox chckbxNewCheckBox_21 = new JCheckBox("Pricing");
		chckbxNewCheckBox_21.setBounds(28, 372, 97, 23);
		contentPane.add(chckbxNewCheckBox_21);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(182, 295, 86, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(182, 347, 86, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(182, 321, 86, 20);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(182, 373, 86, 20);
		contentPane.add(textField_8);
	}
}
