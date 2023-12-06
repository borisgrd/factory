package com.example.factory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class FactoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(FactoryApplication.class, args);
	}

	@PostConstruct
	public void constructAnimal() {
		var animalFactory = new AnimalAbstractFactory();
		animalFactory.createAnimal(EnumAnimalType.LAND, "Dinosaur");
		animalFactory.createAnimal(EnumAnimalType.SKY, "Pterosaur");
	}

}
