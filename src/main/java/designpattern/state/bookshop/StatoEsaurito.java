package designpattern.state.bookshop;

public class StatoEsaurito implements Stato {
	 
    @Override
    public void gestioneStatoOrdine(Ordine ordine, String stato) {
        if (stato.equals("cancellato"))
            ordine.setStatoOrdine(new StatoCancellato());
    }
 
}
