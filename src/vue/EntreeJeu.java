package vue;

import vue.ChoixJoueur;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controleur.Controle;

import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EntreeJeu extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	/**
	 * Create the frame.
	 */
	public EntreeJeu() {
		setTitle("Urban Marginal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 313, 173);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStartServer = new JLabel("Start a server :");
		lblStartServer.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStartServer.setBounds(20, 11, 99, 14);
		contentPane.add(lblStartServer);
		
		JLabel lblConnectServer = new JLabel("Connect an existing server :");
		lblConnectServer.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblConnectServer.setBounds(20, 41, 179, 14);
		contentPane.add(lblConnectServer);
		
		JLabel lblIpServer = new JLabel("IP server :");
		lblIpServer.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIpServer.setBounds(20, 75, 68, 14);
		contentPane.add(lblIpServer);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			private Arene frmArene;
			public void actionPerformed(ActionEvent e) {
				this.frmArene = new Arene();
				this.frmArene.setVisible(true);
				dispose();
			}
		});
		btnStart.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnStart.setBounds(201, 7, 89, 23);
		contentPane.add(btnStart);
		
		JButton btnConnect = new JButton("Connect");
		btnConnect.addActionListener(new ActionListener() {
			private ChoixJoueur frmChoixJoueur;
			public void actionPerformed(ActionEvent e) {
				this.frmChoixJoueur = new ChoixJoueur();
				this.frmChoixJoueur.setVisible(true);
				dispose();
			}
		});
		btnConnect.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnConnect.setBounds(201, 71, 89, 23);
		contentPane.add(btnConnect);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnExit.setBounds(201, 106, 89, 23);
		contentPane.add(btnExit);
		
		textField = new JTextField();
		textField.setText("127.0.0.1");
		textField.setBounds(98, 73, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
