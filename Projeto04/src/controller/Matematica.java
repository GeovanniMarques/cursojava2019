package controller;

import util.Teclado;

public class Matematica {

	public static void main(String[] args) {

		String avalia_numero = null;
		double b = Math.PI;
		double x;
		int i = 1;
		
		while (i <= 3) {
			
		int numero;
		numero = Teclado.lerInt("Digite um número:");
						
		x = numero + (b);
		
		if (x >= 20) {
	   		 avalia_numero = "MAIOR QUE 20";
	   	 	 }else 
	 			if (x <= 19) {
					avalia_numero = "MENOR QUE 20";
	 			}
		
		System.out.println("                                            ");
		System.out.println("Número digitado: " + numero);
		System.out.println("Avaliação da soma de número: " + avalia_numero);
		System.out.println("Valor da soma: " + x);
		System.out.println("                                              ");
		System.out.println("----------------------\\-----------------------\\-------------------------\\---------------------");
		
		i = i + 1;
		
		}
	}

}
