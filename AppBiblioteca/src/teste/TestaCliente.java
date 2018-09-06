package teste;

import negocio.Carro;
import negocio.Cliente;
import negocio.Emprestimo;

public class TestaCliente {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente(0, "João Silva", "9876-5432", "Centro", 30, 6000);
		
		Carro carro = new Carro("Gol", "ABC-5050", "Volkswagen", "Motor 1.6", 2016, 50000, 15000);
		
		
		
		Emprestimo e = new Emprestimo();
		e.setCarro(carro);
		e.setCliente(cliente);
		
		e.getCarro().exibe();
		e.getCliente().exibe();
		
		e.liberaAluguel();
		
		System.out.printf("Liberou o alugel? %s\n",e.liberaAluguel() ? "Sim": "Não");
		System.out.printf("Valor da diaria: %.2f\n",e.calculaAluguel());
	
			

		
	}
	
	

}
