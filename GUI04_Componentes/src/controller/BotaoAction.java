package controller;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;

public class BotaoAction implements ActionListener {

	@Override
	public void actionPerformed(java.awt.event.ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Você clicou no botão 1 - Action");
	}

}
