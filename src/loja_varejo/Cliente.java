package loja_varejo;

public class Cliente {
	private String nomeCompleto;
	private String cpf;
	private Endereco endereco; 
	private String telefone;
	private String cep;
	
	
	public Cliente(String nome, String cpf, String Cep, Endereco endereco) {
		this.nomeCompleto = nome;
		this.cpf = cpf;
		this.cep = Cep;
		this.endereco = endereco;
	}

	//Getters
	public String getNomeCompleto() {
		return this.nomeCompleto;
	}
	public String getCpf() { 
		return this.cpf;
	}
	public Endereco getEndereco() {
		return this.endereco;
	}
	public String getTelefone() { 
		return this.telefone; 
	}
	public String getCep() {
		return this.cep;
	}
	
	//Setters 
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto; 
	}
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	public void setEndereco(Endereco endereco) { 
		this.endereco = endereco;
	}
	public void setTelefone(String telefone) { 
		this.telefone = telefone;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCliente1() {	
		return this.getCliente1();
	}
	@Override
	public String toString() {
	return String.format("Logradouro: %s n° %s. Bairro: %s - %s/%s",this.nomeCompleto,this.cpf,this.endereco,this.telefone,this.cep);
	}
}