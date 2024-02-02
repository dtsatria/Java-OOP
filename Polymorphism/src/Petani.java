public class Petani extends Person {
    String tanaman;

    void menanam() {
        System.out.println("Saya menanam " + tanaman);
    }

    // constructor default
    Petani() {
        super();
    }

    // constructor param
    Petani(String nama, int umur, String tanaman) {
        super(nama, umur);
        this.tanaman = tanaman;
    }

    // method overriding
    void greetings() {
        super.greetings(); // super keyword
        System.out.println("Dan saya seorang Petani");
    }
}
