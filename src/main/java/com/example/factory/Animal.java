package com.example.factory;

public abstract class Animal {
    EnumAnimalType type;
    EnumAnimalEra era;
    String name;

    Animal(EnumAnimalType type, EnumAnimalEra era, String name) {
        this.type = type;
        this.era = era;
        this.name = name;
    }

    abstract void create();
}
