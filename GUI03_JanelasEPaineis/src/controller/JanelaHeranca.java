package controller;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

//faz com que todos os métodos de JFrame seja chamado sem chamar um objeto
public class JanelaHeranca extends JFrame {

	//metodo construtor, mesmo nome da classe e não retorna nada, nem mesmo void, metodo que é chamado depois que usamos o new
	public JanelaHeranca() {
		//chama o construtor da superclasse, que, nesse caso, é JFrame
		super("Título da janela herança");
		setSize(500, 300);
		
		//para a janela não ser redimencionada em tamanho
		setResizable(false);
		
		//para escolher o que acontece com o programa quando fechamos a janela
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//definir ícone que fica no canto da janela
		ImageIcon icone = new ImageIcon("img/sound-waves.png");
		setIconImage(icone.getImage());
		
		//para janela aparecer na tela
		setVisible(true);
	}
	
	public static void main(String[] args) {
		//instanciar um método para utilizar tudo que foi construído em public JanelaHerança
		new JanelaHeranca();
		
	}

}
