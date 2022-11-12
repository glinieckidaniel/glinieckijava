package lampadina;

/**
 *
 * @author daniel.gliniecki
 */
public class lampadina {

    private String marca;
    private String colore;
    private int numeroAccensioni;
    private int numeroVolte;
    private boolean stato;

    public lampadina(String marca, String colore, int numeroAccensioni,
                                            int numeroVolte, boolean stato) {

    this.marca = marca;
    this.colore  = colore;
    this.numeroAccensioni  = numeroAccensioni;
    this.numeroVolte  = numeroVolte;
    this.stato  = stato;

}

    public String getMarca() {   // restituisce un tipo di dato dello steso tipo
        return marca;
    }

    public void setMarca(String marca) { // assegna un valore all'attributo
        this.marca = marca;
    }

    
}
