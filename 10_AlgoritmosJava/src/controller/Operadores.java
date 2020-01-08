package controller;
import java.util.Scanner;
public class Operadores {

	public static void main(String[] args) {
	
		String nome;
		Scanner info_01 = new Scanner (System.in);
		System.out.println("Digite seu nome:");
		
		int mf;
		
		System.out.println("Digite a média do 1º bimestre: ");
		Scanner m1 = new Scanner (System.in);

		System.out.println("Digite a média do 2º bimestre: ");
		Scanner m2 = new Scanner (System.in);
		
		System.out.println("Digite a média do 3º bimestre: ");
		Scanner m3 = new Scanner (System.in);
		
		System.out.println("Digite a média do 4º bimestre: ");
		Scanner m4 = new Scanner (System.in);
		
		mf = m1 + m2 + m3 + m4 / 4;
		
		if (mf >= 5) {
			System.out.println("Boa, arrombado! Passou!");
		}
		
		else {
			System.out.println("Achou que ia passar, otário? Achou errado hahahaha");
		}
	}

}
