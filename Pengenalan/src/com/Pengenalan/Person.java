package com.Pengenalan;

public class Person {
    // field atau attribute
    String nama;
    String alamat;
    final String negara = "Indonesia";

    // constructor default
    Person() {

    }

    // constructor param
    Person(String nama, String alamat) {
        // variabel shadowing
        this.nama = nama;
        this.alamat = alamat;

    }

    // method param
    void sayHello(String paramNama) {
        System.out.println("Hello Nama saya " + paramNama);
    }

    // method return value
    String sayAlamat() {
        return "saya orang " + alamat;
    }
}