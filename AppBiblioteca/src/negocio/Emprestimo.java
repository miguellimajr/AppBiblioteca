package negocio;

public class Emprestimo {
	
	Carro carro;
	Cliente cliente;
	float desconto;
	
	
	public float calculaAluguel() {
		return (carro.getValorCarro() + carro.getSeguro())/100;			
		
	}
	
	
	public boolean liberaAluguel() {
		if (cliente.getRendaMensal() >= (carro.getValorCarro()*0.1)) {
			return true;
		}
		
		return false;
	}
	
	
	
	public void exibe() {
		
	}



	public float getDesconto() {
		return desconto;
	}



	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}



	public Carro getCarro() {
		return carro;
	}



	public void setCarro(Carro carro) {
		this.carro = carro;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
