
public class Endereco {
	private String tipo;
	private String logradouro;
	private int numero;
	private String complemento;
	private String cep;

	public Endereco(String tipo, String logradouro, int numero, String complemento, String cep) {
		super();
		this.tipo = tipo;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.cep = cep;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String exibir() {
		return tipo + ":" + logradouro + " Num:" + numero + 
				"\nComplemento:" + complemento + " - CEP:" + cep;
	}
} // Endereço
