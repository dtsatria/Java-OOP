package Parent;

public class Person {
    protected String nama;
    protected int umur;

    protected Person() {
        super();
    }

    protected Person(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void greetings() {
        System.out.println("Nama saya " + nama);
        System.out.println("Saya berumur " + umur);

    }
}