package controller;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AreaDeTextoJanelaComScroll extends JFrame {
	
	public AreaDeTextoJanelaComScroll() {
		super("Área de texto janela com scroll");
		
		JLabel informacao = new JLabel("Digite uma mensagem:");
		JTextArea areaDeTexto = new JTextArea(10, 30);
		//para poder pular linha
		areaDeTexto.setLineWrap(true);
		//para pular linha e a palavra não cortar no meio
		areaDeTexto.setWrapStyleWord(true);
		
		JPanel painel = new JPanel();
		painel.add(informacao);
		painel.add(areaDeTexto);
		
		JScrollPane scroll = new JScrollPane(painel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		add(scroll);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(520, 220);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(true);
		
	}

	public static void main(String[] args) {
		new AreaDeTextoJanelaComScroll();
	}

}
