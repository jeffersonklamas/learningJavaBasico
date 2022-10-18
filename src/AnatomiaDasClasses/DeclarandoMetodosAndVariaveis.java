package AnatomiaDasClasses;

//Exemplo de Classe com dois métodos embutidos e seus respectivos corpos.

public class DeclarandoMetodosAndVariaveis {

	// Método principal

	public static void main(String[] args) {
		// Declarar uma variável em java segue sempre a seguinte estrutura:
		// Tipo NomeBemDefinido = Atribuição (opcional em alguns casos);
		// Exemplo:
		// int idade = 53;
		// double altura = 1.79;
		// Dog lulu; // Nesta não possui atribuição, ainda não está definida.

		String firstName = "Jefferson";
		String lastName = "Klamas Marzani";

		// Atribuindo a variável abaixo a chamada que é o método com seus respectivos
		// parametros como retorno.
		String fullName = nomeCompleto(firstName, lastName);
		System.out.println(fullName);
	}

	public static String nomeCompleto(String firstName, String lastName) {
		return "Resultado do método nomeCompleto => " + firstName.concat(" ").concat(lastName);
	}

}