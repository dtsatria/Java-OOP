public class App {
    public static void main(String[] args) throws Exception {

        Petani petani1 = new Petani();
        petani1.nama = "Jaka";
        petani1.umur = 30;

        Dokter dokter1 = new Dokter("Dika", 24, "Jantung");

        petani1.greetings();
        System.out.println();
        dokter1.greetings();
        System.out.println();
    }
}
