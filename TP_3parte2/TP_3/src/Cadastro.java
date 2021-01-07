import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class Cadastro extends JFrame {

	private JPanel contentPane;
	private JTextField textIdade;
	private JTextField textSexo;
	private JTextField textNome;
	private JTextField textKp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private List<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	/**
	 * Create the frame.
	 */
	public Cadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {	
		
			if(textNome.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "Erro, campo vazio!");
			}
			if(textSexo.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "Erro, campo vazio!");
			}
			if(textIdade.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "Erro, campo vazio!");
			}
			
			String sexo;
			sexo = textSexo.getText();
			
			if(sexo.charAt(0) != "M".charAt(0) && sexo.charAt(0) != "F".charAt(0))
			{
				JOptionPane.showMessageDialog(null, "Sexo inválido, digite M para masculino ou F para feminino!");
			}
			else
			{
				pessoas.add(new Pessoa(textNome.getText(), textSexo.getText(), Integer.parseInt(textIdade.getText())));
			}		
	
						
			textNome.setText("");
			textSexo.setText("");
			textIdade.setText("");
			}

		
		});
		
		btnOk.setBounds(34, 152, 89, 23);
		contentPane.add(btnOk);
		
		JButton btnLimpar = new JButton("Limpar");
		
		btnLimpar.setBounds(131, 152, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.setBounds(230, 152, 89, 23);
		contentPane.add(btnMostrar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSair.setBounds(329, 152, 89, 23);
		contentPane.add(btnSair);
		
		textIdade = new JTextField();
		textIdade.setBounds(131, 121, 287, 20);
		contentPane.add(textIdade);
		textIdade.setColumns(10);
		
		textSexo = new JTextField();
		textSexo.setBounds(131, 90, 287, 20);
		contentPane.add(textSexo);
		textSexo.setColumns(10);
		
		textNome = new JTextField();
		textNome.setBounds(131, 59, 287, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		textKp = new JTextField();
		textKp.setEnabled(false);
		textKp.setBounds(131, 28, 287, 20);
		contentPane.add(textKp);
		textKp.setColumns(10);
		
		JLabel lblKp = new JLabel("Numero");
		lblKp.setBounds(51, 31, 46, 14);
		contentPane.add(lblKp);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(51, 124, 46, 14);
		contentPane.add(lblIdade);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(51, 93, 46, 14);
		contentPane.add(lblSexo);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(51, 62, 46, 14);
		contentPane.add(lblNome);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(34, 191, 384, 59);
		contentPane.add(textPane);
		

		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int cont = 0;
				String msg = "";
				for (Pessoa pessoa : pessoas) {

					msg += "Nome: " + pessoa.getNome() + ", ";
					msg += "Sexo: " + pessoa.getSexo() + ", ";
					msg += "Idade " + pessoa.getIdade() + "\n";
				}
				for (Pessoa pessoa : pessoas) {
					
					cont++;
			
				}
				textPane.setText(msg);
				textKp.setText(String.valueOf(cont));
				
				
			}
		});
		
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pessoas.clear();
				textPane.setText("");
			}
		});
	}
}
