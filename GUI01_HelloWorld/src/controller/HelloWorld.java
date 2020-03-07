package controller;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorld {

	public static void main(String[] args) {

		JFrame tela = new JFrame("Programação Desktop");
		JLabel texto = new JLabel("Alô, mundo!");
		
		tela.setLayout(null);
		tela.getContentPane().add(texto);
		
		//(x, y, width, height)
		//(x, y - matriz na ponta esquerda)(largura, altura)
		texto.setBounds(30, 20, 210, 20);
		
		tela.setSize(400, 100);
		tela.setVisible(true);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
