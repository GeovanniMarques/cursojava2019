package controller;

import java.util.Scanner;

public class ExemploScanner {

	public static void main(String[] args) {

	
	String nome;
	
	System.out.println("Digite seu nome:");
	Scanner sc_01 = new Scanner (System.in);
	nome = sc_01.next();
	
	System.out.println("Nome digitado:" + nome);
	
	double salario;
	
	System.out.println("Digite o salário que deseja: ");
	Scanner sc_02 = new Scanner (System.in);
	salario = sc_02.nextDouble();
	
	System.out.println("Salário digitado: R$" + salario);
	
	sc_01.close();
	sc_02.close();
		
	}
	
}
