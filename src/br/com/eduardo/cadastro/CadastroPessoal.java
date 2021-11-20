package br.com.eduardo.cadastro;


public class CadastroPessoal extends Cadastro {
	
	private String nomeUsuario;
	private String cpfUsuario;
	
	public CadastroPessoal( String nome, String cpf) {
		
		this.nomeUsuario = nome;
		this.cpfUsuario = cpf;
	}
	

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	
	public void setCpfUsuario(String cpfUsuario) {
		this.cpfUsuario = cpfUsuario;
	}
	
	public String getCpfUsuario() {
		return cpfUsuario;
	}


	
	


	@Override
	protected String cadastro() {
	
		return getCpfUsuario();//chave que identifica o usuário.
	}



	
	


	

}
