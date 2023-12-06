package com.example.factory;

public class AnimalAbstractFactory {
    Animal animal;

    Animal createAnimal(EnumAnimalType type, String name) {
        EnumAnimalEra era = getFromConfiguration();

        switch (era) {
            case MESOZOIC:
                animal = new MesozoicAnimalFactory().createAnimal(type, name);
                animal.create();
                break;
            case CENOZOIC:
                animal = new CenozoicAnimalFactory().createAnimal(type, name);
                animal.create();
                break;
        }

        return animal;
    }

    EnumAnimalEra getFromConfiguration() {
        return EnumAnimalEra.MESOZOIC; // Default configuration
    }
}