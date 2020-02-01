package controller;
import model.Professor;
import model.Aluno;
public class Teste {

	public static void main(String[] args) {

		//Usuario usu = new Usuario();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		Professor prof = new Professor("Joaquim", "joaquim123", 0, "Joaquim da Silva", "Doutor", 1123);
						
		prof.mostrar();	
		//Teste com dados aleatórios - retorno false
		System.out.println(prof.validarLogin("teste", "teste"));
		//Teste com dados do próprio objeto - retorno true
		System.out.println(prof.validarLogin(prof.getLogin(), prof.getSenha()));
		
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		Aluno aluno = new Aluno("Pedro", "pedro123", 1, "Pedro Alves", "primeiro", "tarde", 11223);
		
		aluno.mostrar();
	}

}
