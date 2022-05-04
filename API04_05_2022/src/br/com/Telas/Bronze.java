package br.com.Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JSpinner;
import javax.swing.JSeparator;

public class Bronze extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bronze frame = new Bronze();
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
	public Bronze() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 729, 376);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Origem do dado");
		lblNewLabel.setBounds(35, 43, 106, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Formato");
		lblNewLabel_1.setBounds(35, 107, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Sistemas");
		lblNewLabel_2.setBounds(449, 43, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Volume de dados");
		lblNewLabel_3.setBounds(30, 221, 92, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Frequencia de dados");
		lblNewLabel_4.setBounds(10, 263, 122, 14);
		contentPane.add(lblNewLabel_4);
		
		textField_1 = new JTextField();
		textField_1.setBounds(132, 218, 136, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(132, 260, 136, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(449, 68, 204, 120);
		contentPane.add(textArea);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("API");
		chckbxNewCheckBox.setBounds(30, 64, 87, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxSftp = new JCheckBox("SFTP");
		chckbxSftp.setBounds(132, 64, 97, 23);
		contentPane.add(chckbxSftp);
		
		JCheckBox chckbxJson = new JCheckBox("JSON");
		chckbxJson.setBounds(30, 121, 97, 23);
		contentPane.add(chckbxJson);
		
		JCheckBox chckbxNewCheckBox_2_1 = new JCheckBox("Upload");
		chckbxNewCheckBox_2_1.setBounds(213, 64, 97, 23);
		contentPane.add(chckbxNewCheckBox_2_1);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("PDF");
		chckbxNewCheckBox_1.setBounds(134, 121, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("CSV");
		chckbxNewCheckBox_2.setBounds(30, 143, 97, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Plnilhas");
		chckbxNewCheckBox_3.setBounds(134, 143, 97, 23);
		contentPane.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Tabelas");
		chckbxNewCheckBox_4.setBounds(247, 121, 97, 23);
		contentPane.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Audio");
		chckbxNewCheckBox_5.setBounds(247, 143, 97, 23);
		contentPane.add(chckbxNewCheckBox_5);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("Texto");
		chckbxNewCheckBox_6.setBounds(30, 169, 102, 23);
		contentPane.add(chckbxNewCheckBox_6);
		
		JButton btnNewButton = new JButton("Mais +");
		btnNewButton.setBounds(379, 291, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Pr\u00E9-visualiza\u00E7\u00E3o");
		btnNewButton_1.setBounds(478, 291, 124, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Proximo");
		btnNewButton_2.setBounds(614, 291, 89, 23);
		contentPane.add(btnNewButton_2);
	}
}
