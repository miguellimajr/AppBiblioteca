package negocio;

public class Passeio extends Carro{

	@Override
	public void imprimirTipo() {
		super.adicionarCabecalho("Carro de Passeio");
		
	}

	public Passeio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Passeio(String nome, String placa, String marca, String modelo, int ano, float valorCarro, float seguro,
			String[] adicionais) {
		super(nome, placa, marca, modelo, ano, valorCarro, seguro, adicionais);
		// TODO Auto-generated constructor stub
	}

	
	
}
