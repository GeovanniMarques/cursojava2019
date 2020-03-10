package controller;

import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Abas extends JFrame {
	
	JTabbedPane abas = new JTabbedPane();
	
	JLabel label_01 = new JLabel("Label do painel 1");
	JPanel painel_01 = new JPanel();
	
	JLabel label_02 = new JLabel("Label do painel 2");
	JPanel painel_02 = new JPanel();
	
	JLabel label_03 = new JLabel("Label do painel 3");
	JPanel painel_03 = new JPanel();
	
	ImageIcon icone_01 = new ImageIcon("img/sound-waves.png");
	ImageIcon icone_02 = new ImageIcon("img/smart-watch.png");
	ImageIcon icone_03 = new ImageIcon("img/turbine.png");
	
	public Abas() {
		super("Exemplo de abas");
		
		painel_01.add(label_01);
		painel_02.add(label_02);
		painel_03.add(label_03);
			
		abas.addTab("O brabo", icone_01, painel_01, "Primeiro painel");
		abas.addTab("Brota", icone_02, painel_02, "Segundo painel");
		abas.addTab("O pai tá on", icone_03, painel_03, "Terceiro painel");
		
		Container container = getContentPane();
		container.add(abas);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 300);
		setVisible(true);
		
	}
		
	public static void main(String[] args) {
		
		new Abas();
		
	}

}
