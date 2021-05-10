package vue;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Arene extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Create the frame.
	 */
	public Arene() {
		this.getContentPane().setPreferredSize(new Dimension(800, 600));
		this.pack();
		setTitle("Arena");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 817, 641);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblfondarene = new JLabel("");
		String chemin = "fonds/fondarene.jpg";
		String resource = getClass().getClassLoader().getResource(chemin).getPath();
		lblfondarene.setIcon(new ImageIcon(resource));
		lblfondarene.setBounds(0, 0, 800, 600);
		contentPane.add(lblfondarene);
	}

}
