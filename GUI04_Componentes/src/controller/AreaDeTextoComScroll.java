package controller;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AreaDeTextoComScroll extends JFrame {
	
	public AreaDeTextoComScroll() {
		super("Área de texto com scroll");
		
		JLabel informacao = new JLabel("Digite a sua mensagem:");
		JTextArea areaDeTexto = new JTextArea(10, 30);
		
		//barra de rolamento da tela
		//JScrollPane scroll = new JScrollPane(view, vsbPolicy(vertical), hsbPolicy(horizontal));
		JScrollPane scroll = new JScrollPane(areaDeTexto, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		//JPanel painel = new JPanel(new GridLayout(2,1));
		JPanel painel = new JPanel();
		painel.add(informacao);
		painel.add(scroll);
		
		add(painel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		pack();
		setResizable(false);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new AreaDeTextoComScroll();
	}

}
