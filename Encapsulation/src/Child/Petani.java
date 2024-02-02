package Child;

import Parent.Person;

public class Petani extends Person {
    private String tanaman;

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
        System.out.println("Nama saya " + getNama());
        System.out.println("Saya berumur " + getUmur());
        System.out.println("Dan saya seorang Petani");
    }

    public String getTanaman() {
        return this.tanaman;
    }

    public void setTanaman(String tanaman) {
        this.tanaman = tanaman;
    }
}
