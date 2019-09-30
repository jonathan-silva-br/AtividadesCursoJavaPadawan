import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;

public class TelaNavega {

	private JFrame frame;
	private JTextField tfNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaNavega window = new TelaNavega();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaNavega() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tfNome = new JTextField();
		tfNome.setBounds(37, 85, 163, 28);
		frame.getContentPane().add(tfNome);
		tfNome.setColumns(10);
		
		JLabel lblLNome = new JLabel("Nome");
		lblLNome.setBounds(37, 45, 45, 14);
		frame.getContentPane().add(lblLNome);
	}
}
