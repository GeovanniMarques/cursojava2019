package controller;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Mensagens {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Mensagem 1");
		
		JOptionPane.showMessageDialog(null, "Mensagem 2", "Titulo da mensagem 2", JOptionPane.ERROR_MESSAGE);
		
		//PLAIN_MESSAGE é para colocar o meu próprio ícone
		ImageIcon icone01 = new ImageIcon("img/pizza.png");
		JOptionPane.showMessageDialog(null, "Mensagem 3", "Titulo da mensagem 3", JOptionPane.PLAIN_MESSAGE, icone01);
		
		ImageIcon icone02 = new ImageIcon("img/smart-watch.png");
		JOptionPane.showMessageDialog(null, "Hora do lanche, rapaziadaaaa!", "Titulo da mensagem 4", JOptionPane.PLAIN_MESSAGE, icone02);
		
		ImageIcon icone03 = new ImageIcon("img/sound-waves.png");
		JOptionPane.showMessageDialog(null, "BROTAAAAAAAAAAA", "Partiu, porraaaaaaa", JOptionPane.PLAIN_MESSAGE, icone03);
	}

}
