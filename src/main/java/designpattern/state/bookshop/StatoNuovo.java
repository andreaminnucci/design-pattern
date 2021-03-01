package designpattern.state.bookshop;

public class StatoNuovo implements Stato {
 
    @Override
    public void gestioneStatoOrdine(Ordine ordine, String stato) {
        if (stato.equals("in_prenotazione"))
           ordine.setStatoOrdine(new StatoInPrenotazione());
        else if (stato.equals("in_corso"))
           ordine.setStatoOrdine(new StatoInCorso());
    }
 
}
