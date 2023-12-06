package com.example.factory;

public class LandAnimal extends Animal {

    LandAnimal(EnumAnimalEra era, String name) {
        super(EnumAnimalType.LAND, era, name);
    }

    @Override
    void create() {
        System.out.println("Land " + era.toString() + " " + name);
    }
}