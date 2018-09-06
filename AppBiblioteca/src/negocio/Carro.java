package negocio;

public class Carro {
	
	private String nome; 
	private String placa;
	private String marca;
	private String modelo;
	private int ano;
	private float valorCarro;
	//implementa��o futura: valor do empr�stimo ser� baseado no valor do carro, idade do motorista e seguro
	private float seguro;
	
	
	
	
	public Carro(String nome, String placa, String marca, String modelo, int ano, float valorCarro,
			 float seguro) {
		this.nome = nome;
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.valorCarro = valorCarro;		
		this.seguro = seguro;
	}

	public void exibe() {
		
		System.out.printf("Carro: %s \n"
				+"Placa: %s \n"
				+"Marca: %s \n"
				+"Modelo: %s \n"
				+"Ano: %d \n"
				+"Valor do Carro: %.2f \n\n",				
				nome, placa, marca, modelo,ano, valorCarro);
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public float getValorCarro() {
		return valorCarro;
	}

	public void setValorCarro(float valorCarro) {
		this.valorCarro = valorCarro;
	}

	
	public float getSeguro() {
		return seguro;
	}

	public void setSeguro(float seguro) {
		this.seguro = seguro;
	}
	

}
