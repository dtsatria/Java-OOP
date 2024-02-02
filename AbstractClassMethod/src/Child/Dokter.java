package Child;

import Parent.Person;

public class Dokter extends Person {
    private String spesialis;

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

    // method overriding & implementasi abstract method
    public void greetings() {
        System.out.println("Dan saya seorang Dokter");
    }

    public String getSpesialis() {
        return this.spesialis;
    }

    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }
}
