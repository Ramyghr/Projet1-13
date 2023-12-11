package tn.esprit.gestionzoo.entites;

import tn.esprit.gestionzoo.Interfaces.Omnivore;

public final class Terrestre extends Animal implements Omnivore<Food> {
    private int nbrlegs;

    public Terrestre(String family, String nameAnimal, int age, boolean isMammal, int nbrlegs) {
        super(family, nameAnimal, age, isMammal);
        this.nbrlegs = nbrlegs;
    }

    @Override
    public String toString() {
        return "Terrestre{" +
                "nbrlegs=" + nbrlegs +
                '}';
    }

    @Override
    public void eatMeat(Food meat) {
        System.out.println("this animal eat meat");
    }

    @Override
    public void eatPlant(Food plant) {
        System.out.println("this animal eats plant");
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        System.out.println("this animal eat both");
    }
}
