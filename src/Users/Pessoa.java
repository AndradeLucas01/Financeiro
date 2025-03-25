package Users;

public abstract class Pessoa {
	private String nome;
	private String email;
	private String senha;
	private String cpf;

	public void exibirDetalhes() {
		System.out.println("Nome " + getNome());
		System.out.println("Email "+ getEmail());
		System.out.println("Senha " + getSenha());
		System.out.println("Cpf " + getCpf());
	}

	public Pessoa(String nome, String email, String senha, String cpf) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.cpf = cpf;
	}
	
	public boolean validarSenha(String senhaInserida) {
		return senhaInserida != null && senhaInserida.equals(senha);
	}

	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		if (nome == null || nome.trim().isEmpty()) {
			throw new IllegalArgumentException("Nome não pode ser nulo ou vazio");
		}
		this.nome = nome;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		if (email == null || !email.contains("@")) {
			throw new IllegalArgumentException("Email inválido");
		}
		this.email = email;
	}

	public String getSenha() {
		return this.senha;
	}
	public void setSenha(String senha) {
		if (senha == null || senha.length() < 6) {
			throw new IllegalArgumentException("Senha deve ter pelo menos 6 caracteres");
		}
		this.senha = senha;
	}

	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		if (cpf == null || cpf.length() != 11) {
			throw new IllegalArgumentException("CPF deve ter 11 dígitos");
		}
		this.cpf = cpf;
	}
}
