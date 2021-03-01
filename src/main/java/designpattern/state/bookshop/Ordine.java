package designpattern.state.bookshop;

public class Ordine {
	 
    private Stato statoOrdine;
 
    public Ordine(){
        this.statoOrdine = new StatoNuovo();
    }
 
    public Stato getStatoOrdine() {
        return statoOrdine;
    }
 
    public void setStatoOrdine(Stato statoOrdine){
        this.statoOrdine = statoOrdine;
    }
 
}
