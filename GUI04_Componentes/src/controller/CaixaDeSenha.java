package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class CaixaDeSenha extends JFrame{
	
	public CaixaDeSenha() {
		super("Caixa de senha");
	
		JPasswordField caixaDeSenha = new JPasswordField(20);
		
		//para informação mostrada na janela
		JLabel informacao = new JLabel("Digite a sua senha");
		
		JButton botao = new JButton("Login");
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//para mostrar a senha inserida
				//JOptionPane.showMessageDialog(null, new String(caixaDeSenha.getPassword()));
				
				//para verificar se a senha está correta
				String senha = new String(caixaDeSenha.getPassword());
				if(senha.equals("1234")) {
					JOptionPane.showMessageDialog(null, "Login efetuado com sucesso");
				}else {
					JOptionPane.showMessageDialog(null, "Senha incorreta");
				}
				
			}
		});
		
		JPanel painel = new JPanel();
		painel.add(informacao);
		painel.add(caixaDeSenha);
		painel.add(botao);
		
		add(painel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);
		setLocationRelativeTo(null);
		
	}

	public static void main(String[] args) {
			new CaixaDeSenha();
	}

}
