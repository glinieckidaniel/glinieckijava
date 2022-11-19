/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esrcizio_foglio;

/**
 *
 * @author daniel.gliniecki
 */
public class FoglioProva {
    public static void main(String[] args) {
    
        Foglio f = new Foglio(25, 2, "rosso");
        
        double area = f.calcArea();
        System.out.println(area);
        
        double diagonale = f.calcDiagonale();
        System.out.println(diagonale);
    
        f.impostaAltezza(30);
        System.out.println(f.getAltezza());
        
        f.impostaBase(30);
        System.out.println(f.getBase());
    
        f.impostaColore("verde");
        System.out.println(f.getColore());
    }
    
    
    
    
    
    
    
    
}


