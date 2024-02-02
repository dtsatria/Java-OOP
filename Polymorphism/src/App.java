public class App {
    public static void main(String[] args) throws Exception {

        Person dokter1 = new Dokter("Dika", 24, "Jantung");
        boolean isDoctor = dokter1 instanceof Dokter;

        dokter1.greetings();
        System.out.println();

        System.out.println(isDoctor); // mengecek apakah dokter1 merupakan Dokter
        System.out.println();

        System.out.println(((Dokter) dokter1).spesialis);// recasting polymorphism

    }
}
