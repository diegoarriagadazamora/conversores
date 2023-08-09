package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
    

	
	public void ConvertirCLPADolares(double valor) {
		double monedaDolar = valor / 0.0012;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Dolares");
	}
	
	public void ConvertirCLPAEuros(double valor) {
		double monedaEuro = valor / 0.0011;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Euros");
	}
	
	public void ConvertirCLPALibras(double valor) {
		double monedaLibra = valor / 0.00091;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Libras Esterlinas");
	}
	
	public void ConvertirCLPAYen(double valor) {
		double monedaYen = valor / 0.17;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Yuanes");
	}
	
	public void ConvertirCLPAWon(double valor) {
		double monedaWon = valor / 1.53;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Wons");
	}
}
