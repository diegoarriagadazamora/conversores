package conversorMonedas;

import javax.swing.JOptionPane;
/**
 *
 * @author Diego Arriagada Zamora
 */

public class function {

	ConvertirMonedas monedas = new ConvertirMonedas();
	ConvertirMonedasACLP clp = new ConvertirMonedasACLP();
	
    public void ConvertirMonedas(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije la moneda a la que deseas convertir tu dinero ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De CLP a Dólar", "De CLP a Euro", "De CLP a Libras","De CLP a Yen","De CLP a Won Coreano","De Dólar a CLP", "De Euro a CLP", "De Libras a CLP","De Yen a CLP","De Won Coreano a CLP"}, 
    			"Seleccion")).toString();
        switch(opcion) {
        case "De CLP a Dólar" -> monedas.ConvertirCLPADolares(Minput);
        case "De CLP a Euro" -> monedas.ConvertirCLPAEuros(Minput);
        case "De CLP a Libras" -> monedas.ConvertirCLPALibras(Minput);
        case "De CLP a Yen" -> monedas.ConvertirCLPAYen(Minput);
        case "De CLP a Won Coreano" -> monedas.ConvertirCLPAWon(Minput);
        case "De Dólar a CLP" -> clp.ConvertirDolaresACLP(Minput);
        case "De Euro a CLP" -> clp.ConvertirEurosACLP(Minput);
        case "De Libras a CLP" -> clp.ConvertirLibrasACLP(Minput);
        case "De Yen a CLP" -> clp.ConvertirYenACLP(Minput);
        case "De Won Coreano a CLP" -> clp.ConvertirWonACLP(Minput);
        }      
    }
        
}
