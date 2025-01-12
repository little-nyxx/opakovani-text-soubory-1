import java.time.LocalDate;

public class Zakaznik {
    private String jmeno;
    private LocalDate datumNarozeni;
    private String mesto;
    private int pocetProdeju;

    public Zakaznik(LocalDate datumNarozeni, String jmeno, String mesto, int pocetProdeju) {
        this.datumNarozeni = datumNarozeni;
        this.jmeno = jmeno;
        this.mesto = mesto;
        this.pocetProdeju = pocetProdeju;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public LocalDate getDatumNarozeni() {
        return datumNarozeni;
    }

    public void setDatumNarozeni(LocalDate datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    public int getPocetProdeju() {
        return pocetProdeju;
    }

    public void setPocetProdeju(int pocetProdeju) {
        this.pocetProdeju = pocetProdeju;
    }

    public void zvysPocetProdeju(int pocet) {
        if(pocet < 0) {
            throw new PocetProdejuExeption("Počet prodejů je v záporu!");
        } else {
            int pocetProdeju = +pocet;
        }
    }
}
