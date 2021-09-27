package loja_varejo;

public class Produtos {
	public String nome;
	public int valor;
	public String qualidade;
	public String serial; 

	public Produtos(String nome, String Valor, String serial, int valor) {
		this.nome = nome;
		this.valor = valor;
		this.serial = serial;
	}
	
	public Produtos(int valor3) {
		// TODO Auto-generated constructor stub
	}

	//Getters 
	public String getNome() {
		return this.nome;
	}
	public int getValor() {
		return this.valor;
	}
	public String getQualidade() { 
		return this.qualidade;
	}
	public String getSerial() {
		return this.serial;
	}
	//Setters 
	public void setValor(String string, int valor) {
		this.valor = valor;
	}

	public void setNome(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setSerial(String string) {
		// TODO Auto-generated method stub
		
	}
}