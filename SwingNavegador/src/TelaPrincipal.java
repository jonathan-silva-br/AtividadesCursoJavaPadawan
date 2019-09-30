import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JPasswordField;
import javax.swing.JList;
import javax.swing.AbstractListModel;

public class TelaPrincipal {

	private ArrayList nomes;
	private int posicao;
	private JFrame frame;
	private JTextField txtNome;
	private JButton btPrimeiro;
	private JButton btAnterior;
	private JButton btProximo;
	private JButton btUltimo;
	private JButton btnAdicionar;
	private JButton btnDeletar;
	private JLabel lblPosio;
	private JLabel lblNewLabel_1;
	private JLabel lbPosicao;
	private JLabel lbTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal window = new TelaPrincipal();
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
	public TelaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		nomes = new ArrayList();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 470, 230);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtNome = new JTextField();
		txtNome.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				btnAdicionar.setEnabled(txtNome.getText().length() > 0);
			}
		});
		txtNome.setBounds(10, 43, 426, 20);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNome.setBounds(10, 18, 82, 14);
		frame.getContentPane().add(lblNome);
		
		btnAdicionar = new JButton("+");
		btnAdicionar.setEnabled(false);
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nomes.add(txtNome.getText());
				posicao = 0;
				txtNome.setText(nomes.get(posicao).toString());
				atualizaBotoes();
				
				
			}
		});
		btnAdicionar.setBounds(300, 74, 63, 64);
		frame.getContentPane().add(btnAdicionar);
		
		btnDeletar = new JButton("-");
		btnDeletar.setEnabled(false);
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				nomes.remove(posicao);
				if (nomes.size() > 0) {
					posicao = 0;
					txtNome.setText((String)nomes.get(posicao));
					atualizaBotoes();
				}
							
				
			}
		});
		btnDeletar.setBounds(373, 74, 63, 64);
		frame.getContentPane().add(btnDeletar);
		
		btPrimeiro = new JButton("| <");
		btPrimeiro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				posicao = 0;
				txtNome.setText((String)nomes.get(posicao));
				atualizaBotoes();
			}
		});
		btPrimeiro.setEnabled(false);
		btPrimeiro.setBounds(10, 74, 63, 64);
		frame.getContentPane().add(btPrimeiro);
		
		btAnterior = new JButton("<");
		btAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				posicao -= 1;
				txtNome.setText((String)nomes.get(posicao));
				atualizaBotoes();
			}
		});
		btAnterior.setEnabled(false);
		btAnterior.setBounds(83, 74, 63, 64);
		frame.getContentPane().add(btAnterior);
		
		btProximo = new JButton(">");
		btProximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				posicao ++;
				txtNome.setText((String)nomes.get(posicao));
				atualizaBotoes();
			}
		});
		btProximo.setEnabled(false);
		btProximo.setBounds(156, 74, 63, 64);
		frame.getContentPane().add(btProximo);
		
		btUltimo = new JButton("> |");
		btUltimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				posicao = nomes.size()-1;
				txtNome.setText((String)nomes.get(posicao));
				atualizaBotoes();
			}
		});
		btUltimo.setEnabled(false);
		btUltimo.setBounds(229, 74, 63, 64);
		frame.getContentPane().add(btUltimo);
		
		lblPosio = new JLabel("Posi\u00E7\u00E3o");
		lblPosio.setBounds(36, 158, 56, 20);
		frame.getContentPane().add(lblPosio);
		
		lblNewLabel_1 = new JLabel("Total");
		lblNewLabel_1.setBounds(278, 161, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		lbPosicao = new JLabel("0");
		lbPosicao.setBounds(84, 161, 46, 14);
		frame.getContentPane().add(lbPosicao);
		
		lbTotal = new JLabel("0");
		lbTotal.setBounds(316, 161, 46, 14);
		frame.getContentPane().add(lbTotal);
	}
	private void atualizaBotoes() {
		
		btPrimeiro.setEnabled((nomes.size()>1) && (posicao > 0));
		btUltimo.setEnabled((nomes.size() > 1) && (posicao < nomes.size()-1));
		btAnterior.setEnabled((nomes.size()>1) && (posicao > 0));
		btProximo.setEnabled((nomes.size() > 1) && (posicao < nomes.size()-1));
		btnDeletar.setEnabled(nomes.size() > 0);
		
		lbPosicao.setText(String.valueOf(posicao));
		lbTotal.setText(String.valueOf(nomes.size()));
	
		
	}
}
