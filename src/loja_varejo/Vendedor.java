package loja_varejo;

public class Vendedor {
	private String nomeVendedor;
	private String cpf;
	private String rua;
	private String numeroCasa;
	private String bairro;
	private String cidade;

	// Getters

	public String getnomeVendedor() {
		return this.nomeVendedor;
	}

	public String getcpf() {
		return this.cpf;
	}

	public String getRua() {
		return this.rua;

	}
	
	public String getnumeroCasa() {
		return this.numeroCasa;
	}
	
	public String getbairro () {
		return this.bairro;
	}
	
	public String getCidade() {
		return this.cidade;
	}
	
	public void setnumeroCasa(String numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

	public void setbairro(String bairro) {
		this.bairro = bairro;
	}

	public void setcidade(String cidade) {
		this.cidade = cidade;
	}

	public void setrua(String rua) {
		this.rua = rua;
	}

	public void setnomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}

	public void setcpf(String cpf) {
		this.cpf = cpf;
	}
	public Vendedor (String nome, String bairro) {
		this.nomeVendedor = nome;
		this.bairro = bairro;
	}
	@Override
	public String toString() {
		return String.format("Logradouro :  %s  n°  %s - %s / %s", this.rua, this.numeroCasa, this.bairro, this.cidade,
				this.cidade);
	}
}
