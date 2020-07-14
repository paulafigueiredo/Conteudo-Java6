package Exercicio1;

public class DadosCliente {

	public static void main(String[] args) {
		
		Cliente dados = new Cliente();
		dados.nome = "Paula";
		dados.sobrenome = "Figueiredo";
		dados.idade = 31;
		dados.endereco = "Rua Francisco Miguel souto vieira";
		dados.numEndereco= 32;
		dados.casaEndereco = 2;
		dados.telefone = "(22)97404-0518";
		dados.email = "paula_figueiredo@ymail.com";
		
		
		System.out.println("Dados Cliente ");
		System.out.println("Nome: " + dados.nome + " " + dados.sobrenome);
		System.out.println("Idade: " + dados.idade + " anos");
		System.out.println("Endereço: " + dados.endereco + " " + dados.numEndereco + " casa " + dados.casaEndereco);
		System.out.println("Telefone: " + dados.telefone);
		System.out.println("Email: " +dados.email);
	}

}
