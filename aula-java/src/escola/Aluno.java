package escola;

public class Aluno {
	String nome = "Joãozinho";
	Integer idade; // = 15;
	String sexo; // = "M";
	String telefone; // = "2191234-5678";
	
	public Aluno() {}

	public Aluno(String nome, Integer idade, String sexo, String telefone) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.telefone = telefone;
	}

	public Aluno(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public Aluno (String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", telefone=" + telefone + "]";
	}
	
	
	
	
	
	
	

}
