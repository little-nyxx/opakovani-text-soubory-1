import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws  EvidenceExeption{
        EvidenceZakazniku evidenceZakazniku = new EvidenceZakazniku();
        evidenceZakazniku.pridejZakaznika(new Zakaznik(LocalDate.of(2008, 1, 13), "Sally", "Hluk", 69));
        evidenceZakazniku.pridejZakaznika(new Zakaznik(LocalDate.of(2007, 12, 29), "Andy", "Uherské Hradiště", 7));
        //evidenceZakazniku.evidence.removeLast();

        //for (Zakaznik zakaznik : evidenceZakazniku.evidence){
        //    System.out.println(zakaznik.getJmeno());
        //}
        evidenceZakazniku.prectiSoubor("pridavani.txt", ":");
        evidenceZakazniku.zapisZakazniky("zapis.txt", ":");
        //evidenceZakazniku.prectiSoubor("pridavani.txt", ":");
        evidenceZakazniku.evidence.removeLast();
        System.out.println("Jména všech zákazníků, kromě posledního");
        for (Zakaznik zakaznik : evidenceZakazniku.evidence){
           System.out.println(zakaznik.getJmeno());
        }
        System.out.println("Průměrný počet prodejů v Uherském Hradišti");
        System.out.println(evidenceZakazniku.prumerProdejuUH());
        evidenceZakazniku.zaznamLimit();
        System.out.println("Zákazníci s počtem prodejů nad 20");
        for (Zakaznik zakaznik : evidenceZakazniku.vyber){
            System.out.println(zakaznik.getJmeno() + " " +zakaznik.getPocetProdeju());
        }

    }
}