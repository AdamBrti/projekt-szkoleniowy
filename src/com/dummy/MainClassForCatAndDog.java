package com.dummy;

public class MainClassForCatAndDog {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
    }

    //metoda sluzaca do stworzenia dwóch obiektów i nadania im wartości przy użyciu konstruktora
    public static void creatingCatAndSettingValuesWithConstructor() {
        //Metody - przyklady uzycia
        Cat cat = new Cat();
        cat.makeVoice();
        Cat zenekCat = new Cat(9, "Zenek");
    }

    public static void initializingAndDeclaration() {
        //inicjalizacja wraz  z deklacją
        Cat cat = new Cat();
        //deklaracja
        Cat cat2;
        //inicjalizajca
        cat2 = new Cat();
        //mozna nadac wartosc null
        cat2 = null;
    }
}
