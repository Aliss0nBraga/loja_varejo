package loja_varejo;

public class Endereco {
	public String rua;
	public String numero; 
	public String bairro; 
	public String cidade;
	public String estado;
	public String cep;

	public Endereco(String rua, String numero, String bairro, String cidade, String estado, String cep) {
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}
	
	//Getters 
	public String getRua() {
		return this.rua;
	}
	public String getNumero() {
		return this.numero;
	}
	public String getBairro() {
		return this.bairro;
	}
	public String getCidade() {
		return this.cidade;
	}
	public String getEstado() {
		return this.estado;
	}
	public String getCep() {
		return this.cep;
	}
	// Setters 
	public void setRua(String rua) {
		this.rua = rua;
	}
	public void setNumero(String numero) {
		this.numero = numero; 
	}
	public void setBairro(String bairro) {
		 this.bairro = bairro;
	}
	public void setCidade(String cidade) {
		 this.cidade = cidade;
	}
	public void setEstado(String estado) {
		 this.estado = estado;
	}
	public void setCEP(String cep) {
		 this.cep = cep;
	}
	
	@Override
	public String toString() {
	return String.format("Logradouro: %s n° %s. Bairro: %s - %s/%s",this.rua,this.numero,this.bairro,this.cidade,this.estado);
	}

	public String getEndereco() {
		// TODO Auto-generated method stub
		return this.getEndereco();
	}

	public String getCliente1() {
		// TODO Auto-generated method stub
		return this.getCliente1();
	}	
} 
