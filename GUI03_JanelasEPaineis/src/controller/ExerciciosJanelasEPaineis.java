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
	
	//imagens dos carros que irão aparecer na janela
	ImageIcon hb20 = new ImageIcon("img/hb20.jpg");
	ImageIcon onix = new ImageIcon("img/onix.jpg");
	ImageIcon uno = new ImageIcon("img/uno.jpg");
	
	//imagens que irão aparecer como ícones das abas
	ImageIcon icone_painel_01 = new ImageIcon("img/car.png");
	ImageIcon icone_painel_02 = new ImageIcon("img/car (1).png");
	ImageIcon icone_painel_03 = new ImageIcon("img/vehicle.png");
	
	//texto que irá aparecer 
	JLabel label01_01 = new JLabel("<html>Fabricante: Hyundai<br/>Modelo: HB20<br/>Ano: 2019<br/>Motor: 5 L<br/>Preço: R$42.000,00</html>");	
	JLabel label02_01 = new JLabel("<html>Fabricante: Cherolet<br/>Modelo: Onix<br/>Ano: 2018<br/>Motor: 5 L<br/>Preço: R$36.990,00</html>");	
	JLabel label03_01 = new JLabel("<html>Fabricante: Fiat<br/>Modelo: Uno<br/>Ano: 2016<br/>Motor: 5 L<br/>Preço: R$30.000,00</html>");
	
	//imagens dos carros que irão aparecer na janela
	JLabel label_foto_hb20 = new JLabel(hb20);
	JLabel label_foto_onix = new JLabel(onix);	
	JLabel label_foto_uno = new JLabel(uno);
		
	//imagens que irão aparecer como ícones das abas
	JLabel label_icone_01 = new JLabel(icone_painel_01);
	JLabel label_icone_02 = new JLabel(icone_painel_02);
	JLabel label_icone_03 = new JLabel(icone_painel_03);
		
	//painel principal, que irá receber paineis de texto e imagem
	JPanel painelPrincipal01 = new JPanel();
	JPanel painelPrincipal02 = new JPanel();
	JPanel painelPrincipal03 = new JPanel();
	
	//painel para textos
	JPanel painel_texto_01 = new JPanel();
	JPanel painel_texto_02 = new JPanel();
	JPanel painel_texto_03 = new JPanel();
	
	//painel para imagens
	JPanel painel_img_01 = new JPanel();
	JPanel painel_img_02 = new JPanel();
	JPanel painel_img_03 = new JPanel();
	
	public ExerciciosJanelasEPaineis() {
		super("Identificação de carros");
		
	//configurações de linhas e colunas do painel
	painelPrincipal01.setLayout(new GridLayout(1, 2));	
	painelPrincipal02.setLayout(new GridLayout(1, 2));
	painelPrincipal03.setLayout(new GridLayout(1, 2));		
		
	//configurações de linhas e colunas do painel
	painel_texto_01.setLayout(new GridLayout(5, 1));
	painel_texto_02.setLayout(new GridLayout(5, 1));	
	painel_texto_03.setLayout(new GridLayout(5, 1));	
	
	//configurações de linhas e colunas do painel
	painel_img_01.setLayout(new GridLayout(5, 1));
	painel_img_02.setLayout(new GridLayout(5, 1));
	painel_img_03.setLayout(new GridLayout(5, 1));
	
	//aba de carro 1
	painel_texto_01.add(label01_01);			
	painel_img_01.add(label_foto_hb20);
	painelPrincipal01.add(painel_texto_01);
	painelPrincipal01.add(painel_img_01);	
	
	//aba de carro 2
	painel_texto_02.add(label02_01);		
	painel_img_02.add(label_foto_onix);
	painelPrincipal02.add(painel_texto_02);
	painelPrincipal02.add(painel_img_02);
	
	//aba de carro3	
	painel_texto_03.add(label03_01);		
	painel_img_03.add(label_foto_uno);		
	painelPrincipal03.add(painel_texto_03);
	painelPrincipal03.add(painel_img_03);		
		
	//definindo itens que irão na aba
	exercicios.addTab("Carro 1", icone_painel_01, painelPrincipal01, "Carro 1");
	exercicios.addTab("Carro 2", icone_painel_02, painelPrincipal02, "Carro 2");
	exercicios.addTab("Carro 3", icone_painel_03, painelPrincipal03, "Carro 3");
		
	Container container = getContentPane();
	container.add(exercicios);
		
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	setSize(500, 500);
	setLocationRelativeTo(null);
		
	}

	public static void main(String[] args) {
		
		new ExerciciosJanelasEPaineis();

	}

}
