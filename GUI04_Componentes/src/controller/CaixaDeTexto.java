package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CaixaDeTexto extends JFrame {
	
	public CaixaDeTexto() {
		super("Caixa de texto");
		
	JTextField caixaDeTexto = new JTextField(20);
	//para mostrar algo dentro da caixa de texto
	caixaDeTexto.setText("Digite aqui");
	//para aparecer uma informação quando coloca o mouse em cima da caixa de texto
	caixaDeTexto.setToolTipText("Caixa de texto, digite algo");
	//para 
	caixaDeTexto.addKeyListener(new KeyListener() {
		
		//quando for digitado algo
		@Override
		public void keyTyped(KeyEvent e) {
			System.out.println("ketTyped");
		}
		
		//quando soltar o botão
		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println("ketReleased");
			caixaDeTexto.setText(caixaDeTexto.getText().toUpperCase());
		}
		
		//quando você pressiona o botão
		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println("ketPressed");
		}
	});
	
	JButton botao = new JButton("Clique aqui");
	//para funcionalidade do botão - ActionListener é uma interface
	botao.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, caixaDeTexto.getText());
		}
	});
	
	JPanel painelCaixaDeTexto = new JPanel();
	painelCaixaDeTexto.add(caixaDeTexto);
	painelCaixaDeTexto.add(botao);
	
	add(painelCaixaDeTexto);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(400, 100);
	setVisible(true);
	setLocationRelativeTo(null);
	//pack();
	
	}

	public static void main(String[] args) {
		new CaixaDeTexto();
	}

}
