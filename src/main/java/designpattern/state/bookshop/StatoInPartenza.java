package designpattern.state.bookshop;

public class StatoInPartenza implements Stato {
	 
    @Override
    public void gestioneStatoOrdine(Ordine ordine, String stato) {
        if (stato.equals("spedito"))
            ordine.setStatoOrdine(new StatoSpedito());
    }
 
}
