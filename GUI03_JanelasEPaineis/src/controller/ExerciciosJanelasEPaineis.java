package controller;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class ExerciciosJanelasEPaineis extends JFrame {
	
	JTabbedPane exercicios = new JTabbedPane();
	
	ImageIcon hb20 = new ImageIcon("img/hb20.jpg");
	ImageIcon onix = new ImageIcon("img/onix.jpg");
	ImageIcon uno = new ImageIcon("img/uno.jpg");
	
	ImageIcon icone_painel_01 = new ImageIcon("img/car.png");
	ImageIcon icone_painel_02 = new ImageIcon("img/car (1).png");
	ImageIcon icone_painel_03 = new ImageIcon("img/vehicle.png");
	
	JPanel painel_texto_01 = new JPanel();
	JLabel label_icone_01 = new JLabel(icone_painel_01);
	JLabel label01_01 = new JLabel("Fabricante: Hyundai");
	JLabel label01_02 = new JLabel("Modelo: HB20");
	JLabel label01_03 = new JLabel("Ano: 2019");
	JLabel label01_04 = new JLabel("Motor: 5 L");
	JLabel label01_05 = new JLabel("Preço: R$42.000,00");
	
	JPanel painel_img_01 = new JPanel();
	JLabel label_foto_hb20 = new JLabel(hb20);
			
	JPanel painel_texto_02 = new JPanel();
	JLabel label_icone_02 = new JLabel(icone_painel_02);
	JLabel label02_01 = new JLabel("Fabricante: Chevrolet");
	JLabel label02_02 = new JLabel("Modelo: Onix");
	JLabel label02_03 = new JLabel("Ano: 2018");
	JLabel label02_04 = new JLabel("Motor: 5 L");
	JLabel label02_05 = new JLabel("Preço: R$36.990,00");
	
	JPanel painel_img_02 = new JPanel();
	JLabel label_foto_onix = new JLabel(onix);
	
	JPanel painel_texto_03 = new JPanel();
	JLabel label_icone_03 = new JLabel(icone_painel_03);
	JLabel label03_01 = new JLabel("Fabricante: Fiat");
	JLabel label03_02 = new JLabel("Modelo: Uno");
	JLabel label03_03 = new JLabel("Ano: 2016");
	JLabel label03_04 = new JLabel("Motor: 7 L");
	JLabel label03_05 = new JLabel("Preço: R$30.000,00");
	
	JPanel painel_img_03 = new JPanel();
	JLabel label_foto_uno = new JLabel(uno);
	
	JPanel painel_principal_01 = new JPanel();
	painel_principal_01.setLayout(new GridLayout(1, 2));
	
	JPanel painel_principal_02 = new JPanel();
	JPanel painel_principal_03 = new JPanel();
	
	public ExerciciosJanelasEPaineis() {
		super("Identificação de carros");
		
		painel_texto_01.add(label01_01);
		painel_texto_01.add(label01_02);
		painel_texto_01.add(label01_03);
		painel_texto_01.add(label01_04);
		painel_texto_01.add(label01_05);	
		
		painel_img_01.add(label_foto_hb20);
		
		painel_texto_02.add(label02_01);
		painel_texto_02.add(label02_02);
		painel_texto_02.add(label01_03);
		painel_texto_02.add(label02_04);
		painel_texto_02.add(label02_05);
		
		painel_img_02.add(label_foto_onix);
		
		painel_texto_03.add(label03_01);
		painel_texto_03.add(label03_02);
		painel_texto_03.add(label03_03);
		painel_texto_03.add(label03_04);
		painel_texto_03.add(label03_05);
		
		painel_img_03.add(label_foto_uno);
		
		painel_principal_01.add(painel_texto_01);
		painel_principal_01.add(painel_img_01);
		
		painel_principal_02.add(painel_texto_02);
		painel_principal_02.add(painel_img_02);
		
		painel_principal_03.add(painel_texto_03);
		painel_principal_03.add(painel_img_03);		
		
		exercicios.addTab("Carro 1", icone_painel_01, painel_principal_01, "Carro 1");
		exercicios.addTab("Carro 2", icone_painel_02, painel_principal_02, "Carro 2");
		exercicios.addTab("Carro 3", icone_painel_03, painel_principal_03, "Carro 3");
		
		Container container = getContentPane();
		container.add(exercicios);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new ExerciciosJanelasEPaineis();

	}

}
