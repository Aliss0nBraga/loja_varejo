package loja_varejo;

public class Transportadora {
	public String nomeCompleto;
	public String cep;
	public String telefone;
	public Endereco endereco;
	
	public Transportadora(String nome, String cep, String telefone, Endereco endereco) {
		this.nomeCompleto = nome;
		this.cep = cep;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	
	//Getters 
	public String getNomeCompleto() {
		return this.nomeCompleto;
	}
	public String getCep() {
		return this.cep;
	}
	public String getTelefone() {
		return this.telefone;
	}
	public Endereco getEndereco() {
		return this.endereco;
	}
	//Setters 
	public void setCep(String cep) {
		this.cep = cep;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}