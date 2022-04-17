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
import javax.swing.JList;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		setBounds(100, 100, 691, 481);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnConsulta = new JButton("Consultar");
		btnConsulta.setBounds(353, 11, 106, 23);
		contentPane.add(btnConsulta);
		
		textConsultar = new JTextField();
		textConsultar.setBounds(20, 12, 210, 20);
		contentPane.add(textConsultar);
		textConsultar.setColumns(10);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(469, 11, 89, 23);
		contentPane.add(btnModificar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(568, 11, 89, 23);
		contentPane.add(btnExcluir);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		
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
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[]  {
				"Raz\u00E3o Social", "      CNPJ", "Endere\u00E7o", "N\u00FAmero", "CEP"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(200);
		table.getColumnModel().getColumn(1).setPreferredWidth(200);
		table.getColumnModel().getColumn(2).setPreferredWidth(200);
		table.getColumnModel().getColumn(4).setPreferredWidth(90);
		table.setBounds(20, 52, 637, 390);
		contentPane.add(table);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(658, 52, 17, 390);
		contentPane.add(scrollBar);
		
		JButton btnInicio = new JButton("Inicio");
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setLayout(null);Inicio frame = new Inicio(); frame. setVisible(true); dispose();
			}
		});
		btnInicio.setBounds(254, 11, 89, 23);
		contentPane.add(btnInicio);

		
		
		
	
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
	        	 dados[i][4] = cliente.getCEP();}
	         }
}