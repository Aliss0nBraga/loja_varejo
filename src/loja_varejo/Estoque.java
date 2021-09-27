package loja_varejo;

public class Estoque {
	public String produto;
	public String serial;
	public String nome;
	public String local; 
	
	public Estoque(String nome, String local, String produto, String serial) {
		this.nome = nome;
		this.local = local;
		this.produto = produto;
		this.serial = serial;
	}
	//Getters 
	public String getNome() { 
		return this.nome; 
	}
	public String getLocal() {
		return this.local;
	}
	public String getProduto() {
		return this.serial;
	}
	public String getSerial() { 
		return this.serial;
	}
	//Setters 
	public void setNome(String nome) { 
		this.nome = nome;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	@Override
	public String toString() {
		return String.format("Logradouro : %s  n°  %s - %s / %s", this.produto, this.serial, this.nome, this.local);
	}
}
