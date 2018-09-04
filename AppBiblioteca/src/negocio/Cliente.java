package negocio;

public class Cliente {
	
	int numeroRegistro;
	String nome;
	String telefone;
	String endereco;
	
	
	
	
	public Cliente(int numeroRegistro,String nome,String telefone, String endereco) {
		this.numeroRegistro = numeroRegistro;
		this.nome = nome;
		this.telefone= telefone;
		this.endereco = endereco;
				
	}
	
	
public void exibe() {
	
	System.out.printf("Nome do Cliente: %s \n"
			+ "Número de Registro: %d \n"
			+"Telefone: %s \n"
			+"Endereço: %s \n", 
			nome, numeroRegistro, telefone, endereco);
			
	
}

}
