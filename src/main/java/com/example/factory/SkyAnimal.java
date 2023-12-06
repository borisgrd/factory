package com.example.factory;

public class SkyAnimal extends Animal {

    SkyAnimal(EnumAnimalEra era, String name) {
        super(EnumAnimalType.SKY, era, name);
    }

    @Override
    void create() {
        System.out.println("Sky " + era.toString() + " " + name);
    }
}
