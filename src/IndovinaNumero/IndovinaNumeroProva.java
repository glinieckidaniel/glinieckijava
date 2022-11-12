package IndovinaNumero;

public class IndovinaNumeroProva {

    public static void main(String[] args) {
        int n = 11;
        IndovinaNumero n1 = new IndovinaNumero(n);
        
        String testoDaStampare;
        
        testoDaStampare = n1.stampa();
        
        System.out.println(n1.pensa());
        
        System.out.println(testoDaStampare);
    }

}
