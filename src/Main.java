import java.time.LocalDate;

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
        for (Zakaznik zakaznik : evidenceZakazniku.evidence){
           System.out.println(zakaznik.getJmeno());
        }

    }
}