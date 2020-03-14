package controller;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class AreaDeTexto extends JFrame {
	
	public AreaDeTexto() {
		super("Área de texto");
		
		JTextArea areaDeTexto = new JTextArea(10,30);
		JLabel informacao = new JLabel("Digite uma mensagem");
		
		JPanel painel = new JPanel();
		painel.add(informacao);
		painel.add(areaDeTexto);
		
		add(painel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new AreaDeTexto();
	}

}
