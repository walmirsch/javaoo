
public class TesteCliente {
public static void main(String[] args) {
	//Endereco e1 = new Endereco("Rua","25 de Julho", 1738,"Apto 1 Bloco C", "29645-000");
	//e1.setTipo("Rua");
	//e1.setLogradouro("Ananias Gomes dos Santos");
	//e1.setNumero(401);
	//e1.setComplemento("Apto 21 Bloco C");
	//e1.setCep("12.345-678");

	// System.out.println(e1.exibir());
	
Cliente c1 = new Cliente(98765, "Walmir Schultz", "walmir@gmail.com",
        new Endereco("Av","7 de Setembro",50,"Casa 1", "29645-000"));
	////c1.setCodigo(95842);
	//c1.setNome("Professor Isidro");
	//c1.setEmail("isidro@isidro.com");
	//c1.setEndCorrespondencia(e1);
	
	System.out.println(c1.exibir());
	System.out.println("Nome do cliente:"+c1.getNome());
	System.out.println("Endereço completo:\n"+c1.getEndCorrespondencia().exibir());
	System.out.println("CEP do cliente :"+c1.getEndCorrespondencia().getCep());
//	System.out.println(c1);
//	System.out.println(e1);
	} // main
} // TestaCli
