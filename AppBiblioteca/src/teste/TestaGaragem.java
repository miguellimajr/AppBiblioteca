package teste;

import negocio.Blindado;
import negocio.Garagem;
import negocio.Passeio;
import auxiliar.Constante;

public class TestaGaragem {
	
	public static void main(String[] args) {
		Garagem garagem = new Garagem();
		
		Passeio gol = new Passeio("Gol", "ABC-5050", "Volkswagen", "Motor 1.6", 2015, 50000, 15000, Constante.getAdicionaisBasicos());
		Passeio uno = new Passeio("Uno", "AXY-1053", "Fiat", "Motor 2.0", 2014, 75000, 20000, Constante.getAdicionaisBasicos());
		Passeio gol2 = new Passeio("Gol", "AXT-7050", "Volkswagen", "Motor 1.0", 2017, 40000, 10000, Constante.getAdicionaisBasicos());
		Passeio uno2 = new Passeio("Uno", "AGY-1853", "Fiat", "Motor 1.6", 2018, 70000, 18000, Constante.getAdicionaisBasicos());
		
		Blindado golb = new Blindado("Gol", "ABC-5050", "Volkswagen", "Motor 1.6", 2016, 50000, 15000, Constante.getAdicionaisBasicos());
		Blindado unob = new Blindado("Uno", "AXY-1053", "Fiat", "Motor 2.0", 2018, 75000, 20000, Constante.getAdicionaisBasicos());
		Blindado gol2b = new Blindado("Gol", "AXT-7050", "Volkswagen", "Motor 1.0", 2017, 40000, 10000, Constante.getAdicionaisBasicos());
		Blindado uno2b = new Blindado("Uno", "AGY-1853", "Fiat", "Motor 1.6", 2018, 70000, 18000, Constante.getAdicionaisBasicos());
		
		garagem.EstacionaCarro(gol);
		garagem.EstacionaCarro(uno);
		garagem.EstacionaCarro(gol2);
		garagem.EstacionaCarro(uno2);
		garagem.EstacionaCarro(golb);
		garagem.EstacionaCarro(unob);
		garagem.EstacionaCarro(gol2b);
		garagem.EstacionaCarro(uno2b);
		
		
		
		garagem.ExibeGaragem();
		garagem.CalculaPatrimonio();
		garagem.ReavaliaValor();
		garagem.ExibeGaragem();
		garagem.CalculaPatrimonio();

		






		
		
		
	}

}
