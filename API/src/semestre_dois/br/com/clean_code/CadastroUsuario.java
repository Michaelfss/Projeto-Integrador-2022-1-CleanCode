package semestre_dois.br.com.clean_code;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.ComponentOrientation;

public class CadastroUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField razaoSocial;
	private JTextField cnpj;
	private JTextField endereco;
	private JTextField numero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroUsuario frame = new CadastroUsuario();
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
	public CadastroUsuario() {
		setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		setTitle("Cadastro de Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 701, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Raz\u00E3o Social");
		lblNewLabel.setBounds(10, 11, 75, 14);
		contentPane.add(lblNewLabel);
		
		razaoSocial = new JTextField();
		razaoSocial.setBounds(93, 8, 307, 20);
		contentPane.add(razaoSocial);
		razaoSocial.setColumns(10);
		
		JButton btnProximoPrimeriaTela = new JButton("Next >>");
		btnProximoPrimeriaTela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnProximoPrimeriaTela.setBounds(564, 405, 89, 23);
		contentPane.add(btnProximoPrimeriaTela);
		
		JLabel lblNewLabel_1 = new JLabel("CNPJ");
		lblNewLabel_1.setBounds(10, 42, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		cnpj = new JTextField();
		cnpj.setBounds(93, 39, 152, 20);
		contentPane.add(cnpj);
		cnpj.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Endere\u00E7o");
		lblNewLabel_2.setBounds(10, 73, 56, 14);
		contentPane.add(lblNewLabel_2);
		
		endereco = new JTextField();
		endereco.setBounds(93, 70, 331, 20);
		contentPane.add(endereco);
		endereco.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("N\u00FAmero");
		lblNewLabel_3.setBounds(10, 103, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		numero = new JTextField();
		numero.setBounds(93, 100, 86, 20);
		contentPane.add(numero);
		numero.setColumns(10);
	}
}
