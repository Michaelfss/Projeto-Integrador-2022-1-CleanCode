package br.com.Telas;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import segundo_semestre.br.com.clean_code.back.ClienteCadastro;
import javax.swing.table.DefaultTableModel;

import br.com.API.dao.ClienteCadastroDAO;

import javax.swing.JList;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Consultacliente extends JFrame {

	private JPanel contentPane;
	private JTextField textConsultar;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consultacliente frame = new Consultacliente();
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
	public Consultacliente() {
		setTitle("Consultar Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 684, 434);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnConsulta = new JButton("Consultar");
		btnConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				ClienteCadastroDAO clientecadastroDao = new ClienteCadastroDAO();
			
				
				
				
				
				
			
				
				
			}
		});
		btnConsulta.setBounds(240, 49, 106, 23);
		contentPane.add(btnConsulta);
		
		textConsultar = new JTextField();
		textConsultar.setBounds(20, 50, 210, 20);
		contentPane.add(textConsultar);
		textConsultar.setColumns(10);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(455, 49, 89, 23);
		contentPane.add(btnModificar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(554, 49, 89, 23);
		contentPane.add(btnExcluir);
		
		JButton btnInicio = new JButton("Inicio");
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setLayout(null);Inicio frame = new Inicio(); frame. setVisible(true); dispose();
			}
		});
		btnInicio.setBounds(356, 49, 89, 23);
		contentPane.add(btnInicio);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 51, 102));
		panel_1.setBounds(0, 372, 668, 23);
		contentPane.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(0, 51, 102));
		panel_1_1.setBounds(0, 0, 668, 36);
		contentPane.add(panel_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 118, 623, 223);
		contentPane.add(scrollPane);
		table.setToolTipText("fff");
		scrollPane.setViewportView(table);
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Raz\u00E3o Social", "      CNPJ", "Endere\u00E7o", "N\u00FAmero", "CEP"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(200);
		table.getColumnModel().getColumn(1).setPreferredWidth(200);
		table.getColumnModel().getColumn(2).setPreferredWidth(200);
		table.getColumnModel().getColumn(4).setPreferredWidth(90);
		
		

	
	}

		     
	        //variaveis para uso da JTable 
	
	         private final JTable table = new JTable();
	         private final String colunas[]={"Razão Social","CNPJ","Endereço","Numero","CEP"};
	         
	         {
	        	 List<ClienteCadastro> clientes = new ArrayList<ClienteCadastro>();
		 
		         Integer i = 0;
		         
		         String dados[][] = new String[clientes.size()][5];
		         
	         for(ClienteCadastro cliente: clientes) {
	        	 dados[i][0] = cliente.getRazaoSocial();
	        	 dados[i][1] = cliente.getCnjp();
	        	 dados[i][2] = cliente.getEndereco();
	        	 dados[i][3] = cliente.getNumero();
	        	 dados[i][4] = cliente.getCEP();
	        	 
	         
	         
	         
	         }
	         }
}