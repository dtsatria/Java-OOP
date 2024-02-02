package Child;

import Parent.Person;

public class Dokter extends Person {
    public String spesialis;

    public void operasi() {
        System.out.println("Saya spesialis " + spesialis);
    }

    // constructor default
    public Dokter() {
        super();
    }

    // constructor param
    public Dokter(String nama, int umur, String spesialis) {
        super(nama, umur);
        this.spesialis = spesialis;
    }

    // method overriding
    public void greetings() {
        super.greetings(); // super keyword
        System.out.println("Dan saya seorang Dokter");
    }
}
