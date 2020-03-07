package controller;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Janela {

	public static void main(String[] args) {

		JFrame janela = new JFrame();
		
		janela.setTitle("T�tulo da janela");
		janela.setSize(500, 300);
		
		//para a janela n�o ser redimencionada em tamanho
		janela.setResizable(false);
		
		//para escolher o que acontece com o programa quando fechamos a janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//definir �cone que fica no canto da janela
		ImageIcon icone = new ImageIcon("img/sound-waves.png");
		janela.setIconImage(icone.getImage());
		
		//para janela aparecer na tela
		janela.setVisible(true);
		
		//onde a janela ir� abrir
		//janela.setLocation(50, 47);
		
		//para janela abrir no centro da tela
		janela.setLocationRelativeTo(null);
		
		
		
		
	}

}
