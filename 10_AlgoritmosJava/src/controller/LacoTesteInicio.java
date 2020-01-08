package controller;

import util.Teclado;

public class LacoTesteInicio {

	public static void main(String[] args) {
		
		int r, x, i;
		i = 1;
		while (i <= 3) {
			x = Teclado.lerInt("Digite um número: ");
			r = (x * 3) + i;
			System.out.println(r);
			i = i + 1;
		}

	}

}
