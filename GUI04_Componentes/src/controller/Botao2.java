package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Botao2 extends JFrame {

		//construtor
		public Botao2() {
		   super("Bot�o");
			
		//criando o bot�o
		JButton botao = new JButton("Bot�o 1");
		//para aparecer informa��es quando o mouse est� em cima do bot�o
		botao.setToolTipText("Clique no bot�o");
		//para o bot�o realizar alguma funcionalidade
		BotaoAction ba = new BotaoAction();
		botao.addActionListener(ba);
		
		JPanel painel = new JPanel();
		painel.add(botao);
		
		add(painel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);
		setVisible(true);
		setLocationRelativeTo(null);
		
		}

		public static void main(String[] args) {	
			new Botao2();			
		
	}

}
