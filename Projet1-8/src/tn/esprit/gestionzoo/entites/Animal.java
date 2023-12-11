package tn.esprit.gestionzoo.entites;
import java.util.EnumSet;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;

public class Animal {
    private String family;
    private String nameAnimal;
    private int age;
    private boolean isMammal;

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getNameAnimal() {
        return nameAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException {

        if(age<0)
            throw new InvalidAgeException("Age must be positive");
        else
            this.age = age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public Animal(String family, String nameAnimal, int age, boolean isMammal) {
        this.family = family;
        this.nameAnimal = nameAnimal;
        this.age = age;
        this.isMammal = isMammal;
    }
    public void displayAnimal(){
        System.out.println("Family :"+family+"Name Animal :"+nameAnimal+"Age :"+age+"Is mammal :"+isMammal);
    }
}
