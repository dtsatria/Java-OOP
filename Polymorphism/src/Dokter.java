public class Dokter extends Person {
    String spesialis;

    void operasi() {
        System.out.println("Saya spesialis " + spesialis);
    }

    // constructor default
    Dokter() {
        super();
    }

    // constructor param
    Dokter(String nama, int umur, String spesialis) {
        super(nama, umur);
        this.spesialis = spesialis;
    }

    // method overriding
    void greetings() {
        super.greetings(); // super keyword
        System.out.println("Dan saya seorang Dokter");
    }
}
