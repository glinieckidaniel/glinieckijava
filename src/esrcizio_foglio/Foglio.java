/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esrcizio_foglio;

/**
 *
 * @author daniel.gliniecki
 */
public class Foglio {

    private double altezza;
    private double base;
    private String colore;

    public Foglio(double altezza, double base, String colore) {
        this.altezza = altezza;
        this.base = base;
        this.colore = colore;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double a) {
        altezza = a;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double b) {
        base = b;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String c) {
        colore = c;
    }

    public double calcArea() {
        double area = 0;
        area = base*altezza;
        return area;
    }

    public double calcDiagonale() {
        double diagonale = 0;
        diagonale = Math.sqrt((base * base) + (altezza * altezza));
        return diagonale;
    }

    public void impostaAltezza(double area) {
        altezza = 0;
        altezza = area / base;
    }

    public void impostaBase(double area) {
        base = 0;
        base = area/altezza;
    }

    public void impostaColore(String c) {
        colore = c;
    }

    public String stamap() {
        String s = "";
        s = "altezza" + altezza + "base : " + base + "colore : " + colore;
        return s;
    }

}
