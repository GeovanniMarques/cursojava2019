package controller;
import java.util.Scanner;
public class Operadores {

	public static void main(String[] args) {
	
		String nome;
		Scanner info_01 = new Scanner (System.in);
		System.out.println("Digite seu nome:");
		
		int mf;
		
		System.out.println("Digite a m�dia do 1� bimestre: ");
		Scanner m1 = new Scanner (System.in);

		System.out.println("Digite a m�dia do 2� bimestre: ");
		Scanner m2 = new Scanner (System.in);
		
		System.out.println("Digite a m�dia do 3� bimestre: ");
		Scanner m3 = new Scanner (System.in);
		
		System.out.println("Digite a m�dia do 4� bimestre: ");
		Scanner m4 = new Scanner (System.in);
		
		mf = m1 + m2 + m3 + m4 / 4;
		
		if (mf >= 5) {
			System.out.println("Boa, arrombado! Passou!");
		}
		
		else {
			System.out.println("Achou que ia passar, ot�rio? Achou errado hahahaha");
		}
	}

}
