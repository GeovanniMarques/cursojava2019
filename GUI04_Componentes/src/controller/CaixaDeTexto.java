package controller;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CaixaDeTexto extends JFrame {
	
	public CaixaDeTexto() {
		super("Caixa de texto");
		
	JTextField caixaDeTexto = new JTextField(20);	
	
	JPanel painelCaixaDeTexto = new JPanel();
	painelCaixaDeTexto.add(caixaDeTexto);
	
	add(painelCaixaDeTexto);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(400, 100);
	setVisible(true);
	setLocationRelativeTo(null);
	//pack();
	
	}

	public static void main(String[] args) {
		new CaixaDeTexto();
	}

}
