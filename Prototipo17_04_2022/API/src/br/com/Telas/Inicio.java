package br.com.Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuBar;
import javax.swing.event.MenuListener;
import javax.swing.event.MenuEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Component;
import javax.swing.Box;

public class Inicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenu mnNewMenu = new JMenu("Menu");
		mnNewMenu.addMouseMotionListener(new MouseMotionAdapter() {
			
		});
		
	
		mnNewMenu.addMouseListener(new MouseAdapter() {
	
		
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		mnNewMenu.setBounds(0, 0, 115, 26);
		contentPane.add(mnNewMenu);
		
		JButton btnNewButton = new JButton("Cadastrar Novo");
		btnNewButton.setBounds(23, 70, 125, 23);
		contentPane.add(btnNewButton);
		
		JButton btnConsulta = new JButton("Consultas");
		btnConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setLayout(null);Consultacliente frame = new Consultacliente(); frame. setVisible(true); dispose();
			}
		});
		btnConsulta.setBounds(23, 37, 125, 23);
		contentPane.add(btnConsulta);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setLayout(null); telacliente frame = new telacliente(); frame. setVisible(true); dispose();
			}
		});
	}
}
