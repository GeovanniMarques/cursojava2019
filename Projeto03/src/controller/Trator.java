package controller;

import util.Teclado;

public class Trator {

	public static void main(String[] args) {

		String avaliacao_cavalos = null;
		
		// Leitura de inteiro (cavalos)
		int cavalos;
		cavalos = Teclado.lerInt("Digite a quatidade de cavalos:");

		// Leitura de inteiro (ano)
		int ano;
		ano = Teclado.lerInt("Digite o ano do Trator:");

		// Leitura de inteiro (quilometragem)
		int quilometragem;
		quilometragem = Teclado.lerInt("Digite a quilometragem do trator:");
		
		if (cavalos >= 100) {
	   		 avaliacao_cavalos = "FORTE";
	   	 	 }else 
	 			if (cavalos <= 99) {
					avaliacao_cavalos = "FRACA";
	 			}
		
		System.out.println("                                       ");
		System.out.println("               INFORMAÇÕES SOBRE O TRATOR");
		System.out.println("                                       ");
		System.out.println("Cavalos informados:" + cavalos + "cv");
		System.out.println("Ano informado:" + ano);
		System.out.println("Quilometragem informada:" + quilometragem + "km");
		System.out.println("Avaliação de cavalos:" + avaliacao_cavalos);

	}

}
