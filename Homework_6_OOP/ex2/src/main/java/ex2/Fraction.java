package ex2;

public class Fraction {
    private int zaehler;
    private int nenner;
    // In den Kommentaren ist die alte Version zum testen
    public Fraction(int zaehler , int nenner ){
        this.zaehler = zaehler;
        this.nenner = nenner;
        if (nenner == 0) {
            throw new IllegalArgumentException("Nenner darf nicht null sein");
        }
    }

    /* public void Kehrwert (){
        this.setNenner(this.zaehler);
        this.setZaehler(this.nenner);
    } */
    public void Kehrwert (){
        int zaehler = this.zaehler;
        this.setZaehler(this.nenner);
        this.setNenner(zaehler);
    }

    public void multiplikation(Fraction a){
        this.setNenner(this.nenner * a.getNenner());
        this.setZaehler(this.zaehler * a.getZaehler());
    }

    public void addition(Fraction a){
        if (a.getNenner() != this.getNenner()){
            int neuerZaehler;
            this.setZaehler(this.getZaehler() * a.getNenner());
            neuerZaehler = a.getZaehler() * this.getNenner();
            this.setZaehler(this.getZaehler() + neuerZaehler);
            this.setNenner(this.getNenner() * a.getNenner());
        } else {
            this.setZaehler(this.getZaehler() + a.getZaehler());
        }
    }

    public void kuerzen(){
        int ggt = ggt(Math.abs(zaehler), Math.abs(nenner));
        this.zaehler /= ggt;
        this.nenner /= ggt;
    }

    // Euklidischer Algorithmus
    private int ggt(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    @Override
    public String toString (){
        return this.getZaehler() + "/" + this.getNenner();
    }

    public int getZaehler () {
        return zaehler;
    }
    public void setZaehler (int zaehler) {
        this.zaehler = zaehler;
    }
    public int getNenner () {
        return nenner;
    }
    public void setNenner (int nenner) {
        this.nenner = nenner;
    }
}