package designpattern.state.bookshop.antipattern;

public interface Stato {
	/*

		Nuovo: 			ordine ricevuto
		In Prenotazione:libro ancora non pubblicato in commercio
		In Corso: 		reperimento del libro in corso
		Difettoso: 		libro recuperato ma con difetto. Verrà recuperata una nuova copia
		Esaurito: 		libro non più disponibile, ordine da cancellare
		Pronto: 		libro recuperare da spedire a cliente
		Cancellato: 	ordine cancellato
		In Partenza: 	spedizione in corso.
		Spedito: 		ordine spedito al cliente

	 */
	public static final String NUOVO = "NUOVO";
    public static final String IN_PRENOTAZIONE = "IN_PRENOTAZIONE";
    public static final String IN_CORSO = "IN_CORSO";
    public static final String DIFETTOSO = "DIFETTOSO";
    public static final String PRONTO = "PRONTO";
    public static final String ESAURITO = "ESAURITO";
    public static final String CANCELLATO = "CANCELLATO";
    public static final String IN_PARTENZA = "IN_PARTENZA";
    public static final String SPEDITO = "SPEDITO";
}
