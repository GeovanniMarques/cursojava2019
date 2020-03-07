package controller;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

//faz com que todos os m�todos de JFrame seja chamado sem chamar um objeto
public class JanelaHeranca extends JFrame {

	//metodo construtor, mesmo nome da classe e n�o retorna nada, nem mesmo void, metodo que � chamado depois que usamos o new
	public JanelaHeranca() {
		//chama o construtor da superclasse, que, nesse caso, � JFrame
		super("T�tulo da janela heran�a");
		setSize(500, 300);
		
		//para a janela n�o ser redimencionada em tamanho
		setResizable(false);
		
		//para escolher o que acontece com o programa quando fechamos a janela
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//definir �cone que fica no canto da janela
		ImageIcon icone = new ImageIcon("img/sound-waves.png");
		setIconImage(icone.getImage());
		
		//para janela aparecer na tela
		setVisible(true);
	}
	
	public static void main(String[] args) {
		//instanciar um m�todo para utilizar tudo que foi constru�do em public JanelaHeran�a
		new JanelaHeranca();
		
	}

}
