package loja_varejo;

public class Vendas {
	private Endereco endereco;
	private String valor;
	private String produto;
	private String serial;

	public Vendas(String valor, String produto, String serial) {
		;
		this.valor = valor;
		this.produto = produto;
		this.serial = serial;
	}
	
	//Getters
	public Endereco getEndereco() {
		return this.endereco;
	}
	public String getValor() {
		return this.valor;
	}
	public String getProduto() {
		return this.produto;
	}
	public String getSerial() {
		return this.serial;
	}
	//Setters
	public void setEndereco (Endereco endereco) {
		this.endereco = endereco;
	}
	public void setValor (String valor) {
		this.valor = valor;
		
	}
	public void setSerial (String serial) {
		this.serial = serial;
	}
	public void setProduto (String produto) {
		this.produto = produto;
	}
	@Override
	public String toString() {
		return String.format("Logradouro :  n°  %s - %s / %s", this.valor, this.produto, this.serial, this.endereco);
	}
	
}
	