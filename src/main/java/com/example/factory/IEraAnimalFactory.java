package com.example.factory;

public interface IEraAnimalFactory {

    LandAnimal makeLandAnimal(String name);

    SkyAnimal makeSkyAnimal(String name);
}