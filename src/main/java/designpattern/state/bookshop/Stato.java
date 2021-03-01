package designpattern.state.bookshop;

public interface Stato {
	public void gestioneStatoOrdine(Ordine ordine, String stato);
}
