import java.util.Objects;

class Osoba{
    private String imie;
    private String nazwisko;
    private String PESEL;

    public Osoba(String imie, String nazwisko, String PESEL){
        this.imie = imie;
        this.nazwisko = nazwisko;
        if(PESEL==null || PESEL.isEmpty()||PESEL.length()!=11){
            throw new IllegalArgumentException("PESEL nie jest poprawny");
        }
        this.PESEL = PESEL;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setPESEL(String PESEL) {
        if(PESEL==null || PESEL.isEmpty()||PESEL.length()!=11){
            throw new IllegalArgumentException("PESEL nie jest poprawny");
        }
        this.PESEL = PESEL;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getPESEL() {
        return PESEL;
    }

    @Override
    public String toString() {
        return "imie: "+imie+" nazwisko: "+nazwisko+" PESEL: "+PESEL;
    }

    public char znakPESEL(int index){
        return this.PESEL.charAt(index);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, PESEL);
    }
}

public class TestOsoba {
    public static void main(String[] args) {
        Osoba o1 = new Osoba("Adam", "Zalewski", "12345678900");
        Osoba o2 = new Osoba("Jan", "Nowak", "00987654321");
        System.out.println(o1.getImie());
        System.out.println(o1.getNazwisko());
        o1.setPESEL("123");
        System.out.println(o1.getPESEL());
        System.out.println();
        System.out.println(o2.getImie());
        System.out.println(o2.getNazwisko());
        System.out.println(o2.getPESEL());
        System.out.println();
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());
        System.out.println();
        System.out.println(o1.getClass());
    }
}
