package IndovinaNumero;

public class IndovinaNumero {

    private int numPensato;

    public IndovinaNumero(int numPensato) {
        this.numPensato = numPensato;
    }

    public int getNumPensato() {
        return numPensato;
    }

    public void setNumPensato(int n) {
        numPensato = n;
    }
    
    public String pensa() {
        int num = 0;
        String testo = " ";
        
        num = numPensato + 4;
        num *= 2;
        num += 10;
        num -= 8;
        num /= 2;
        num -= numPensato;
        
        testo ="il numero pensato è " + numPensato + " e il risultato è " + num;
        return testo;
    }

    public String stampa() {
        String s = "numPensato: " + numPensato;
        return s;
        
        /* 
        si può fare : 
        String s;
        s = "numPensato :" + numPensato;
        return s;
        */
    }
}
