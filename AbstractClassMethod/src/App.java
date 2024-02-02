import Child.Dokter;
import Child.Petani;
import Parent.Person;

public class App {
    public static void main(String[] args) throws Exception {

        Person dokter1 = new Dokter();
        Person petani1 = new Petani();

        dokter1.greetings();
        System.out.println();
        petani1.greetings();
    }
}
