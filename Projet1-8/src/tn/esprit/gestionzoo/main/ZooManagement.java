package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entites.*;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;
import tn.esprit.gestionzoo.exceptions.ZooFullException;


public class ZooManagement {
    public static void main(String[] args) throws ZooFullException {


            // Create Zoo
            Zoo zoo = new Zoo("CityZoo", "ZooName");

            // Add Terrestrial Animal (Bear)
            Terrestre bear = new Terrestre("Mammal", "Bear", 7, true, 4);
            zoo.addAnimal(bear);

            // Add Aquatic Animals (Dolphin and Penguin)
            Aquatique dolphin = new Dolphin("Mammal", "Dolphin", 5, true, "Ocean", 10.5f);
            zoo.addAquatic(dolphin);

            Aquatique penguin = new Penguin("Bird", "Penguin", 3, false, "Iceberg", 5.0f);
            zoo.addAquatic(penguin);

            // Display Zoo Information
            zoo.displayZoo();
            zoo.displayAnimals();
            zoo.displayNumberOfAquaticsByType();

            // Test maxPenguinSwimmingDepth method
            float maxPenguinDepth = zoo.maxPenguinSwimmingDepth();
            System.out.println("Max Penguin Swimming Depth: " + maxPenguinDepth);


    }
}