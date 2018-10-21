package negocio;

public class Blindado extends Carro {		
	
	

	public Blindado() {
		super();
		super.setSeguro(super.getSeguro()*2);
		
	}

	public Blindado(String nome, String placa, String marca, String modelo, int ano, float valorCarro, float seguro,
			String[] adicionais) {
		super(nome, placa, marca, modelo, ano, valorCarro, seguro, adicionais);
		super.setSeguro(super.getSeguro()*2);
		
	}

	@Override
	public void imprimirTipo() {		
		super.adicionarCabecalho("Carro Blindado");
		
	}
	
	
	
	
}
