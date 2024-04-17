package Vinnsla;

public class Reiknivel {
    private int tala = 0;
    private int utkoma = 0;
    private int talaX=0;
    private int talaY=0;
    private boolean summa = false;

    private final Reikna[] virkjar = {
            Integer::sum,
            (x, y) -> x - y,
            (x, y) -> x * y,
            (x, y) -> y ==0? 0: x / y
    };
    private Reikna virki = virkjar[0];

    public int setTala(int tala) {
        this.tala = this.tala * 10 + tala;
        return this.tala;
    }

    public void hreinsa() {
        tala = 0;
        utkoma = 0;
        virki = virkjar[0];
        talaX=0;
        talaY=0;
        summa = false;
    }
    public void setVirki(int tala) {
        if (!summa) {
            talaX = this.tala;
        }
        this.tala = 0;
        virki = virkjar[tala];
    }

    public int reikna() {
        return virki.reikna(talaX, talaY);
    }
    public String jafntOg(){
        summa = true;
        talaY = this.tala;
        utkoma  = reikna();
        talaX = utkoma;
        return String.valueOf(utkoma);
    }

    private String[] x = {"+","-","*","/"};
}
