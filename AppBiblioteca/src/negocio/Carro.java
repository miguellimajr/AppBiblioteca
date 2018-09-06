package negocio;

public class Carro {
	
	String nome; 
	int isbn;
	String autor;
	String editora;
	float valorLivro;
	float valorEmprestimo;
	
	public void exibe() {
		
		System.out.printf("Livro: %s \n"
				+ "ISBN: %d \n"
				+"Autor: %s \n"
				+"Editora: %s \n"
				+"Valor do Livro: %.2f \n"
				+"Valor de Empréstimo %.2f",
				nome, isbn, autor, editora, valorLivro, valorEmprestimo);
		
	}
	

}
