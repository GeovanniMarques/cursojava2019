package model;

public class Professor extends Usuario implements IUsuario {
	
	private int matriculaProfessor;
	private String nome;
	private String especialidade;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
		
	public int getMatriculaProfessor() {
		return matriculaProfessor;
	}

	public void setMatriculaProfessor(int matriculaProfessor) {
		this.matriculaProfessor = matriculaProfessor;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public Professor() {
	super();
    }		
	
	public Professor(String login, String senha, int tipo) {
		super(login, senha, tipo);
	}
	
	
		public Professor(String login, String senha, int tipo, String nome, String especialidade, int matriculaProfessor){
			super(login, senha, tipo);
			this.matriculaProfessor = matriculaProfessor;
			this.nome = nome;
			this.especialidade = especialidade;
		}
		
	@Override	
	public boolean validarLogin(String login, String senha){
		if(getLogin().equals(login)&&getSenha().equals(senha)){
			return true;
		}
		
		return false;
	}
		
		
	@Override
	public void mostrar() {
		System.out.println("Informações do aluno: ");
		System.out.println("Login: " + super.getLogin());
		System.out.println("Senha: *****");
		
		System.out.println("Matricula: " + matriculaProfessor);
		System.out.println("Nome: " + nome);
		System.out.print("Especialidade: " + especialidade);

}
	}
