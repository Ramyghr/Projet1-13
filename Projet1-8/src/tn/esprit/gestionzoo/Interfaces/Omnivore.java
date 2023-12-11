package tn.esprit.gestionzoo.Interfaces;

public interface Omnivore<T> extends Carnivore<T>,Herbivore<T>{
    public void eatPlantAndMeat(T food);
}
