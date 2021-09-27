package loja_varejo;

public class Fornecedor {
	private String nomeCompleto;
	private Endereco endereco;
	private String cep;
	private String telefone;

	public Fornecedor(String nome, String cep, String telefone) {
		this.nomeCompleto = nome; 
		this.cep = cep;
		this.telefone = telefone;
	}
	
	//Getters 
	public String getNomeCompleto() { 
		return this.nomeCompleto;
	}
	public Endereco getEndereco() {
		return this.endereco;
	}
	public String getCep() {
		return this.cep;
	}
	public String getTelefone() {
		return this.telefone;
	}
	//Setters 
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setNome(String string) {
			
	}

	public void setCEP(String cep) {
		this.cep = cep;
	}
		
	@Override
	public String toString() {
		return String.format("Logradouro : %s  n°  %s - %s / %s", this.nomeCompleto, this.endereco, this.telefone, this.cep); 
	}	
}