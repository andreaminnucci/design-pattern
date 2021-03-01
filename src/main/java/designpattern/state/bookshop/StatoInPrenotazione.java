package designpattern.state.bookshop;

public class StatoInPrenotazione implements Stato {
	 
    @Override
    public void gestioneStatoOrdine(Ordine ordine, String stato) {
        if (stato.equals("in_corso"))
           ordine.setStatoOrdine(new StatoInCorso());
    }
 
}
