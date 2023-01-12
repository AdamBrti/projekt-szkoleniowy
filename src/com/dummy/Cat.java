package com.dummy;

// operator dostępu np. public (private, protected ...) |
// class | zawsze, jeżeli definiujemy klasę
// Cat | nazwa naszej klasy, i tym samym nazwa typu danych
public class Cat {
    //pola w klasie / member variable
    int age;
    String name;

    //kontruktor (bezargumentowy)
    public Cat() {
    }
    //kontruktor który przyjmuje argumenty i ustawia wartosci dla pól w klasie
    public Cat(int defaultAge, String name) {
        this.age = defaultAge;
        this.name = name;
    }

    public void makeVoice() {
        System.out.println("Miaaaaaaaaaaaaaaaaaaaaaaau");
    }
}
