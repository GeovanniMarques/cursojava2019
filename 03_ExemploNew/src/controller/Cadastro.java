package controller;
import model.Usuario;
public class Cadastro {
	public static void main(String[] args) {
Usuario user=new Usuario();
user.nome="David Guetta";
user.idade=350;
user.endereco="Rua dos amores";
System.out.println(user.nome);
System.out.println(user.endereco);
System.out.println(user.idade);
	}

}
