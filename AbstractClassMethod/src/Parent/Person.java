package Parent;

//abstract class
public abstract class Person {
    private String nama;
    private int umur;

    protected Person() {
        super();
    }

    protected Person(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // abstrat methos
    public abstract void greetings();

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return this.umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}