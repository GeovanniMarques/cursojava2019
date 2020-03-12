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
		   super("Botão");
			
		//criando o botão
		JButton botao = new JButton("Botão 1");
		//para aparecer informações quando o mouse está em cima do botão
		botao.setToolTipText("Clique no botão");
		//para o botão realizar alguma funcionalidade
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Você clicou no botão 1");
				
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
