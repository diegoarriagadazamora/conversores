package conversorMonedas;

import javax.swing.JOptionPane;
/**
 *
 * @author Diego Arriagada Zamora
 */

public class ConvertirMonedasACLP {
	public void ConvertirDolaresACLP(double valor) {
		double monedaDolar = valor * 860.46;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Pesos Chilenos");
	}
	
	public void ConvertirEurosACLP(double valor) {
		double monedaEuro = valor * 942.94;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Pesos Chilenos");
	}
	
	public void ConvertirLibrasACLP(double valor) {
		double monedaLibra = valor * 1096.43;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Pesos Chilenos");
	}
	
	public void ConvertirYenACLP(double valor) {
		double monedaYen = valor * 6.01;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Pesos Chilenos");
	}
	
	public void ConvertirWonACLP(double valor) {
		double monedaWon = valor * 0.65;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Pesos Colombianos");
	}
}
