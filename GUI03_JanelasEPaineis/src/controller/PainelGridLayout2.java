package controller;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelGridLayout2 extends JFrame{
	
	public PainelGridLayout2() {
		super("T�tulo de painel");
		ImageIcon icone_01 = new ImageIcon("img/giphy.gif");
		ImageIcon icone_02 = new ImageIcon("img/smart-watch.png");
		ImageIcon icone_03 = new ImageIcon("img/turbine.png");
		
		JLabel labelTexto = new JLabel("O que o Matheus �?");
		JLabel label_01 = new JLabel(icone_01);
		JLabel label_02 = new JLabel(icone_02);
		JLabel label_03 = new JLabel(icone_03);
		
		/*
		JPanel painel = new JPanel();
		
		painel.setLayout(new GridLayout(2,2));
		
		//adicionar os �cones ao painel
		painel.add(labelTexto);
		painel.add(label_01);
		painel.add(label_02);
		painel.add(label_03);
		*/
		
		//criando um painel dentro do outro
		JPanel painelTexto = new JPanel();
		painelTexto.add(labelTexto);
		
		JPanel painelIcones = new JPanel();
		painelIcones.add(label_01);
		/*painelIcones.add(label_02);
		painelIcones.add(label_03);*/
		
		JPanel painelPrincipal = new JPanel();
		painelPrincipal.setLayout(new GridLayout(2, 1));
		painelPrincipal.add(painelTexto);
		painelPrincipal.add(painelIcones);
		
		add(painelPrincipal);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//pack() tira todo o espa�o v�zio da janela, por isso n�o precisa usar setSize para tamanho de janela
		pack();
		setVisible(true);
		
		//para janela abrir no centro da tela
		setLocationRelativeTo(null);
		
		//definir �cone que fica no canto da janela
		ImageIcon iconeJanela = new ImageIcon("img/sound-waves.png");
		setIconImage(iconeJanela.getImage());
		
	}

	public static void main(String[] args) {
		new PainelGridLayout2();
		
	}

}
