import java.util.Objects;

public class TestOsoba {
    public static void main(String[] args) {
        Osoba os1 = new Osoba("Adam", "Zalewski", "12",32);
        os1.setImie("Karol");
        System.out.println(os1.getImie());
        System.out.println(os1.getNazwisko());
        System.out.println(os1.getPESEL());
        System.out.println(os1.getWiek());
        System.out.println(os1);
        System.out.println(os1.hashCode());
        System.out.println();

        Osoba os2 = new Osoba("Karol", "Zalewski", "12345678900", 31);
        System.out.println(os2.getImie());
        System.out.println(os2.getNazwisko());
        System.out.println(os2.getPESEL());
        System.out.println(os2.getWiek());
        System.out.println(os2);
        System.out.println(os2.hashCode());
        System.out.println(os2.getClass());
    }
}

class Osoba{

    private String imie;
    private String nazwisko;
    private String PESEL;
    private int wiek;

    public Osoba(String imie, String nazwisko, String PESEL, int wiek) {

        this.imie = imie;
        this.nazwisko = nazwisko;
        if(PESEL=="" || PESEL==null || PESEL.length()!=11){
            throw new IllegalArgumentException("PESEL must be either null or empty");
        }
        this.PESEL = PESEL;
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        if(imie==null || imie.isEmpty()){
            throw new IllegalArgumentException("imie cannot be empty");
        }
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getPESEL() {
        return PESEL;
    }

    public void setPESEL(String PESEL) {
        if(PESEL==null || PESEL.isEmpty() || PESEL.length()!=11){
            throw new IllegalArgumentException("PESEL cannot be empty");
        }
        this.PESEL = PESEL;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "imie: "+imie+" nazwisko: "+nazwisko+" PESEL: "+PESEL+" wiek: "+wiek;
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, PESEL, wiek);
    }

}
