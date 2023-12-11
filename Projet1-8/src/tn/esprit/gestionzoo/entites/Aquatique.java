package tn.esprit.gestionzoo.entites;
import tn.esprit.gestionzoo.entites.Food;

import tn.esprit.gestionzoo.Interfaces.Carnivore;

import java.util.Objects;

public abstract  class Aquatique extends Animal implements Carnivore<Food>  {
    protected String habitat;

    public Aquatique(String family, String nameAnimal, int age, boolean isMammal, String habitat) {
        super(family, nameAnimal, age, isMammal);
        this.habitat = habitat;
    }
    @Override
    public void eatMeat(Food meat) {
        System.out.println("this animal eat meat");
    }


    @Override
    public String toString() {
        return super.toString()+
                "habitat='" + habitat + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if( o instanceof Aquatique aquatique){
            return Objects.equals(habitat, aquatique.habitat)&&aquatique.getNameAnimal().equals(super.getNameAnimal()) && aquatique.getAge()==super.getAge();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(habitat);
    }

    public abstract void swim();


}
