package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AreaDeTextoJanelaComScrollEx extends JFrame {

	public AreaDeTextoJanelaComScrollEx() {
		super("Exercício para exibição de mensagem digitada");
		
		JLabel info = new JLabel("Digite a sua mensagem");
		
		JTextArea areaDeTexto = new JTextArea(10, 30);
		areaDeTexto.setLineWrap(true);
		areaDeTexto.setWrapStyleWord(true);
		
		JButton botao = new JButton("Mostrar mensagem digitada");
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, areaDeTexto.getText());
			}
		});
		
		JScrollPane scroll = new JScrollPane(areaDeTexto, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		JPanel painel = new JPanel();
		painel.add(info);
		painel.add(scroll);
		painel.add(botao);
		
		add(painel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(550, 250);
		setResizable(true);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new AreaDeTextoJanelaComScrollEx();
	}

}
