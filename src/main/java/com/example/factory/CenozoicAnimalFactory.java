package com.example.factory;

public class CenozoicAnimalFactory implements IEraAnimalFactory {

    @Override
    public LandAnimal makeLandAnimal(String name) {
        return new LandAnimal(EnumAnimalEra.CENOZOIC, name);
    }

    @Override
    public SkyAnimal makeSkyAnimal(String name) {
        return new SkyAnimal(EnumAnimalEra.CENOZOIC, name);
    }

    public Animal createAnimal(EnumAnimalType animalType, String name) {
        switch (animalType) {
            case LAND:
                return makeLandAnimal(name);
            default:
                return makeSkyAnimal(name);
        }
    }

}
