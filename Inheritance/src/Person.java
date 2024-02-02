public class Person {
    String nama;
    int umur;

    Person() {
        super();
    }

    Person(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    void greetings() {
        System.out.println("Nama saya " + nama);
        System.out.println("Saya berumur " + umur);

    }
}