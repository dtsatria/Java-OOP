package Child;

import Parent.Person;

public class Petani extends Person {
    String tanaman;

    public void menanam() {
        System.out.println("Saya menanam " + tanaman);
    }

    // constructor default
    public Petani() {
        super();
    }

    // constructor param
    public Petani(String nama, int umur, String tanaman) {
        super(nama, umur);
        this.tanaman = tanaman;
    }

    // method overriding
    public void greetings() {
        super.greetings(); // super keyword
        System.out.println("Dan saya seorang Petani");
    }
}
