package tn.esprit.gestionzoo.entites;

import tn.esprit.gestionzoo.exceptions.ZooFullException;

import java.util.Arrays;
import java.util.Objects;

public class Zoo {
    private Animal[] animals;
    private Aquatique[] aquatiques;
    private String city,nameaniaml;
    private final int nbrCages=5;
    public int animalcount=0;
    private int nbraquatique;
    public static final int MAX_ANIMALS=25;

    public Aquatique[] getAquatiques() {
        return aquatiques;
    }

    public void setAquatiques(Aquatique[] aquatiques) {
        this.aquatiques = aquatiques;
    }

    public int getNbraquatique() {
        return nbraquatique;
    }

    public void setNbraquatique(int nbraquatique) {
        this.nbraquatique = nbraquatique;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + Arrays.toString(animals) +
                ", city='" + city + '\'' +
                ", nameaniaml='" + nameaniaml + '\'' +
                ", nbrCages=" + nbrCages +
                ", animalcount=" + animalcount +
                '}';
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNameaniaml() {
        return nameaniaml;
    }

    public void setNameaniaml(String nameaniaml) {
        if(nameaniaml.isBlank())
            System.out.println("The zooname cant be empty ");
        else
            this.nameaniaml = nameaniaml;

    }

    public int getNbrCages() {
        return nbrCages;
    }



    public int getAnimalcount() {
        return animalcount;
    }

    public void setAnimalcount(int animalcount) {
        this.animalcount = animalcount;
    }

    public Zoo(String city, String nameaniaml) {
        this.city = city;
        this.nameaniaml = nameaniaml;
        this.animals = new Animal[MAX_ANIMALS];
        this.aquatiques = new Aquatique[MAX_ANIMALS];

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zoo zoo = (Zoo) o;
        return Objects.equals(nameaniaml, zoo.nameaniaml);
    }



    public void displayZoo(){
        System.out.println("City :"+city+
                "Name :"+nameaniaml+
                "Nbr Cages :"+nbrCages);

    }
    public void displayAnimals() {
        System.out.println("Animals in the zoo:");
        for (int i = 0; i < animalcount; i++) {
            System.out.println("Animal " + (i + 1) + ":");
            animals[i].displayAnimal();
        }
    }

    public void addAnimal(Animal animal) throws ZooFullException{
        if (searchAnimal(animal) != -1)
            System.out.println("This animal already exist");
        if (isZooFull()){
            throw new ZooFullException("The Zoo is full");
        }
        animals[animalcount] = animal;
        animalcount++;
    }
    public int searchAnimal(Animal animal){
        int index=-1;
        for (int i=0;i<animalcount;i++){
            if (animal.getNameAnimal() == animals[i].getNameAnimal()){

                return i;
            }

        }return index;
    }
    public boolean removeAnimal(Animal animal){
        int index= searchAnimal(animal);
        if(index!=-1){
            for(int i=index;i<animalcount-1;i++){
                animals[i]=animals[i+1];
            }
            animals[animalcount-1]=null;
            animalcount--;
            return true;
        }
        return false;
    }
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalcount > z2.animalcount) {
            return z1;
        } else{
            return z2;
        }
    }
    public void addAquatic(Aquatique aquatique){
        aquatiques[nbraquatique]=aquatique;
        nbraquatique++;
    }
    public float maxPenguinSwimmingDepth(){
        float maxdepth=0f;
        for(int i=0;i<nbraquatique;i++){
            if(aquatiques[i] instanceof Penguin penguin){
                if(maxdepth<penguin.getSwimmingDepth())
                    maxdepth = penguin.getSwimmingDepth();
            }
        }
        return maxdepth;
    }
    public void displayNumberOfAquaticsByType(){
        int nbrdolphins=0;
        int nbrpenguins=0;
        for(int i=0;i<animalcount;i++){
            if(aquatiques[i] instanceof Dolphin)
                nbrdolphins++;
            if(aquatiques[i] instanceof Penguin)
                nbrpenguins++;
        }
        System.out.println("Le zoo :"+nameaniaml+" contient "+nbrdolphins+"Dolphins and "+nbrpenguins+"Penguins");
    }
    public boolean isZooFull(){
        return animalcount==nbrCages;
    }
}
