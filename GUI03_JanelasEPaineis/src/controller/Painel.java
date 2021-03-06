package controller;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Painel extends JFrame{
	
	public Painel() {
		super("T�tulo de painel");
		ImageIcon icone_01 = new ImageIcon("img/pizza.png");
		ImageIcon icone_02 = new ImageIcon("img/smart-watch.png");
		ImageIcon icone_03 = new ImageIcon("img/turbine.png");
		
		JLabel labelTexto = new JLabel("Texto e imagem do pa�nel");
		JLabel label_01 = new JLabel(icone_01);
		JLabel label_02 = new JLabel(icone_02);
		JLabel label_03 = new JLabel(icone_03);
		
		JPanel painel = new JPanel();
		//adicionar os �cones ao painel
		painel.add(labelTexto);
		painel.add(label_01);
		painel.add(label_02);
		painel.add(label_03);
		
		add(painel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//pack()tira todo o espa�o v�zio da janela, por isso n�o precisa usar setSize para tamanho de janela
		pack();
		setVisible(true);
		
		//para janela abrir no centro da tela
		setLocationRelativeTo(null);
		
		//definir �cone que fica no canto da janela
		ImageIcon iconeJanela = new ImageIcon("img/sound-waves.png");
		setIconImage(iconeJanela.getImage());
		
	}

	public static void main(String[] args) {
		new Painel();
		
	}

}
