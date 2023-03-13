
public class Pessoa {
protected String nome;
protected String email;
protected String telefone;

public Pessoa(String nome, String email, String telefone) {
	this.nome = nome;
	this.email = email;
	this.telefone = telefone;
}
@Override
public String toString() {
	return this.nome + "-" + this.email + "-" + this.telefone;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getTelefone() {
	return telefone;
}
public void setTelefone(String telefone) {
	this.telefone = telefone;
}

} // Pessoa
 