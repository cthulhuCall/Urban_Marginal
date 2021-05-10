package vue;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ChoixJoueur extends JFrame {

	private JPanel contentPane;
	
	private void lblArrowLeftClic() {
		System.out.println("Précédent");
	}
	
	private void lblArrowRightClic() {
		System.out.println("Suivant");
	}

	/**
	 * Create the frame.
	 */
	public ChoixJoueur() {
		this.getContentPane().setPreferredSize(new Dimension(400, 275));
		this.pack();
		setTitle("Choice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 417, 316);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblfondchoix = new JLabel("");
		String chemin = "fonds/fondchoix.jpg";
		String resource = getClass().getClassLoader().getResource(chemin).getPath();
		lblfondchoix.setIcon(new ImageIcon(resource));
		lblfondchoix.setBounds(0, 0, 400, 275);
		contentPane.add(lblfondchoix);
		
		JLabel lblArrowLeft = new JLabel();
		lblArrowLeft.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblArrowLeftClic();
			}
		});
		lblArrowLeft.setBounds(59, 144, 36, 48);
		contentPane.add(lblArrowLeft);		
		
		JLabel lblArrowRight = new JLabel("");
		lblArrowRight.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblArrowRightClic();
			}
		});
		lblArrowRight.setBounds(300, 144, 30, 48);
		contentPane.add(lblArrowRight);
		
		JLabel lblGo = new JLabel("");
		lblGo.addMouseListener(new MouseAdapter() {
			private Arene frmArene;
			@Override
			public void mouseClicked(MouseEvent e) {
				this.frmArene = new Arene();
				this.frmArene.setVisible(true);
				dispose();
			}
		});
		lblGo.setBounds(310, 189, 67, 75);
		contentPane.add(lblGo);
	}

}
