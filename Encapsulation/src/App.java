import Child.Dokter;

public class App {
    public static void main(String[] args) throws Exception {

        Dokter dokter1 = new Dokter();
        dokter1.setNama("Dika");
        dokter1.setUmur(24);
        dokter1.setSpesialis("jantung"); // mengisi field yang sudah di encapsulation

        System.out.println(dokter1.getNama());
        System.out.println(dokter1.getUmur());
        System.out.println(dokter1.getSpesialis());// mengakses field yang sudah di encapsulation
    }
}
