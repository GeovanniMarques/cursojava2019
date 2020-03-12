package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Botao extends JFrame {

		//construtor
		public Botao() {
		   super("Bot�o");
			
		//criando o bot�o
		JButton botao = new JButton("Bot�o 1");
		//para aparecer informa��es quando o mouse est� em cima do bot�o
		botao.setToolTipText("Clique no bot�o");
		//para o bot�o realizar alguma funcionalidade
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Voc� clicou no bot�o 1");
				
			}
		});
		
		JPanel painel = new JPanel();
		painel.add(botao);
		
		add(painel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);
		setVisible(true);
		setLocationRelativeTo(null);
		
		}

		public static void main(String[] args) {	
			new Botao();			
		
	}

}
