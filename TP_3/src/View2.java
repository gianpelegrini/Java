import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class View2 extends JFrame {

	private JPanel contentPane;
	private JTextField textResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View2 frame = new View2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	double valor1, valor2;
	String simb;

	/**
	 * Create the frame.
	 */
	public View2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textResultado = new JTextField();
		textResultado.setBounds(33, 11, 368, 20);
		contentPane.add(textResultado);
		textResultado.setColumns(10);
		
		
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				valor1 = Double.parseDouble(textResultado.getText());
				textResultado.setText("");
				simb = "sub";
			}
		});
		btnSub.setBounds(312, 94, 89, 23);
		contentPane.add(btnSub);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textResultado.setText(textResultado.getText()+"0");
			}
		});
		btn0.setBounds(33, 124, 89, 23);
		contentPane.add(btn0);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textResultado.setText(textResultado.getText()+"1");
				
			}
		});
		btn1.setBounds(33, 38, 89, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textResultado.setText(textResultado.getText()+"2");
			}
		});
		btn2.setBounds(125, 38, 89, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textResultado.setText(textResultado.getText()+"3");
			}
		});
		btn3.setBounds(219, 38, 89, 23);
		contentPane.add(btn3);
		
		JButton btnDivi = new JButton("/");
		btnDivi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				valor1 = Double.parseDouble(textResultado.getText());
				textResultado.setText("");
				simb = "div";
			}
		});
		btnDivi.setBounds(313, 38, 89, 23);
		contentPane.add(btnDivi);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textResultado.setText(textResultado.getText()+"4");
			}
		});
		btn4.setBounds(33, 66, 89, 23);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textResultado.setText(textResultado.getText()+"5");
			}
		});
		btn5.setBounds(125, 66, 89, 23);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textResultado.setText(textResultado.getText()+"6");
			}
		});
		btn6.setBounds(219, 66, 89, 23);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textResultado.setText(textResultado.getText()+"7");
			}
		});
		btn7.setBounds(33, 94, 89, 23);
		contentPane.add(btn7);
		
		JButton btnMulti = new JButton("*");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				valor1 = Double.parseDouble(textResultado.getText());
				textResultado.setText("");
				simb = "multi";
				
			}
		});
		btnMulti.setBounds(313, 66, 89, 23);
		contentPane.add(btnMulti);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textResultado.setText(textResultado.getText()+"8");
			}
		});
		btn8.setBounds(125, 94, 89, 23);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textResultado.setText(textResultado.getText()+"9");
			}
		});
		btn9.setBounds(219, 94, 89, 23);
		contentPane.add(btn9);
		
		JButton btnVir = new JButton(",");
		btnVir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textResultado.setText(textResultado.getText()+".");
				valor1 = Double.parseDouble(textResultado.getText());
			}
		});
		btnVir.setBounds(125, 124, 89, 23);
		contentPane.add(btnVir);
		
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				valor2 = Double.parseDouble(textResultado.getText());
				
				if(simb=="soma")
				{
					textResultado.setText(String.valueOf(valor1+valor2));
				}
				if(simb=="sub")
				{
					textResultado.setText(String.valueOf(valor1-valor2));
				}
				if(simb=="div")
				{
					textResultado.setText(String.valueOf(valor1/valor2));
				}
				if(simb=="mult")
				{
					textResultado.setText(String.valueOf(valor1*valor2));
				}
	
			}
		});
		btnIgual.setBounds(219, 124, 89, 23);
		contentPane.add(btnIgual);
		
		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				valor1 = Double.parseDouble(textResultado.getText());
				textResultado.setText("");
				simb = "soma";
			}
		});
		btnSoma.setBounds(312, 124, 89, 23);
		contentPane.add(btnSoma);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				valor1=0;
				valor2=0;
				textResultado.setText("");
			}
		});
		btnClear.setBounds(33, 153, 89, 23);
		contentPane.add(btnClear);
	}
}
