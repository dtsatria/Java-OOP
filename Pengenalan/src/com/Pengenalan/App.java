package com.Pengenalan;

public class App {
    public static void main(String[] args) {
        Person orang = new Person();
        orang.nama = "Dika";
        orang.alamat = "Padalarang";

        System.out.println(orang.nama);
        System.out.println(orang.alamat);
        System.out.println(orang.negara);

        orang.sayHello(orang.nama);
        System.out.println(orang.sayAlamat());

        // menggunakan constructor param
        Person orang2 = new Person("Jaka", "Bandung");

        System.out.println(orang2.nama);
        System.out.println(orang2.alamat);
        System.out.println(orang2.negara);

        orang2.sayHello(orang2.nama);
        System.out.println(orang2.sayAlamat());
    }
}
