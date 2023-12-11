package tn.esprit.gestionzoo.entites;

public  class Penguin extends Aquatique{
    private float swimmingDepth;

    public Penguin(String family, String nameAnimal, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, nameAnimal, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return super.toString()+", swimming depth:"+swimmingDepth;
    }

    @Override
    public void swim() {

    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }
}
