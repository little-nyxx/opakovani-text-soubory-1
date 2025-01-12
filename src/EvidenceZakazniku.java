import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvidenceZakazniku {
    public List<Zakaznik> evidence = new ArrayList<>();

    public List<Zakaznik> getEvidence() {
        return new ArrayList<>(evidence);
    }

    public void setEvidence(List<Zakaznik> evidence) {
        this.evidence = evidence;
    }

    public void pridejZakaznika(Zakaznik zakaznik) {
        evidence.add(zakaznik);
    }

    public void odstranZakaznika(Zakaznik zakaznik) {
        evidence.remove(zakaznik);
    }

    public void zapisZakazniky(String nazevSouboru, String oddelovac) throws EvidenceExeption {
        try(PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("resources/" + nazevSouboru)))) {
            for(Zakaznik zakaznik : evidence) {
                writer.println(zakaznik.getJmeno() + oddelovac + zakaznik.getDatumNarozeni() + oddelovac + zakaznik.getMesto() + oddelovac + zakaznik.getPocetProdeju());
            }
        } catch (FileNotFoundException ex) {
            throw new EvidenceExeption("Soubor: " + nazevSouboru + " nebyl nalezen!");
        } catch (IOException ex) {
            throw new EvidenceExeption("Nastala chyba!");
        }
    }

    public void prectiSoubor(String nazevSouboru, String oddelovac) throws EvidenceExeption {
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("resources/" + nazevSouboru)))) {
            while (scanner.hasNextLine()) {
                String radek = scanner.nextLine();
                pridejZakaznika(parseZakaznik(radek, oddelovac));
            }

        } catch (FileNotFoundException ex) {
            throw new EvidenceExeption("Soubor: " + nazevSouboru + " nebyl nalezen!");
        }
    }

    private Zakaznik parseZakaznik(String radek, String oddelovac) {
        String[] polozky = radek.split(oddelovac);
        String jmeno = polozky[0].trim();
        LocalDate datumNarozeni = LocalDate.parse(polozky[1].trim());
        String mesto = polozky[2].trim();
        int pocetProdeju = Integer.parseInt(polozky[3]);
        return new Zakaznik(datumNarozeni, jmeno, mesto, pocetProdeju);

    }

    public List<Zakaznik> zaznamLimit(Zakaznik zakaznik) throws EvidenceExeption {
        if(zakaznik.getPocetProdeju() > 20) {
            return List<Zakaznik>;
        }
    }


}
