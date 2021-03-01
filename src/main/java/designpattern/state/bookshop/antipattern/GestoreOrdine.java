package designpattern.state.bookshop.antipattern;

public class GestoreOrdine {
	/* Antipattern */
	public static void main(String[] args) {
        new GestoreOrdine().esecuzioneOrdine();
    }
 
    public void esecuzioneOrdine() {
        Ordine ordine = new Ordine();
 
        String statoOrdine = ordine.getStatoOrdine();
        System.out.println("Stato attuale dell'ordine: " + statoOrdine);
 
        gestioneStatoOrdine(ordine, "in_corso");
        statoOrdine = ordine.getStatoOrdine();
        System.out.println("Stato attuale dell'ordine: " + statoOrdine);
 
        gestioneStatoOrdine(ordine, "pronto");
        statoOrdine = ordine.getStatoOrdine();
        System.out.println("Stato attuale dell'ordine: " + statoOrdine);
 
        gestioneStatoOrdine(ordine, "in_partenza");
        statoOrdine = ordine.getStatoOrdine();
        System.out.println("Stato attuale dell'ordine: " + statoOrdine);
 
        gestioneStatoOrdine(ordine, "spedito");
        statoOrdine = ordine.getStatoOrdine();
        System.out.println("Stato attuale dell'ordine: " + statoOrdine);
    }
 
    public void gestioneStatoOrdine(Ordine ordine, String stato) {
        if (stato.equals("in_prenotazione")) {
            ordine.setStatoOrdine(Stato.IN_PRENOTAZIONE );
        } else if (stato.equals("in_corso")) {
            ordine.setStatoOrdine(Stato.IN_CORSO );
        } else if (stato.equals("difettoso")) {
            ordine.setStatoOrdine(Stato.DIFETTOSO );
        } else if (stato.equals("pronto")) {
            ordine.setStatoOrdine(Stato.PRONTO );
        } else if (stato.equals("esaurito")) {
            ordine.setStatoOrdine(Stato.ESAURITO );
        } else if (stato.equals("cancellato")) {
            ordine.setStatoOrdine(Stato.CANCELLATO );
        } else if (stato.equals("in_partenza")) {
            ordine.setStatoOrdine(Stato.IN_PARTENZA );
        } else if (stato.equals("spedito")) {
            ordine.setStatoOrdine(Stato.SPEDITO );
        }
    }
}
