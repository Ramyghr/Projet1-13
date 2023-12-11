    package tn.esprit.gestionzoo.entites;

    public  class Dolphin extends Aquatique {
        private float swimmingspeed;

        public Dolphin(String family, String nameAnimal, int age, boolean isMammal, String habitat, float swimmingspeed) {
            super(family, nameAnimal, age, isMammal, habitat);
            this.swimmingspeed = swimmingspeed;
        }

        public float getSwimmingspeed() {
            return swimmingspeed;
        }

        public void setSwimmingspeed(float swimmingspeed) {
            this.swimmingspeed = swimmingspeed;
        }

        @Override
        public String toString() {
            return super.toString()+"swimmingspeed: "+swimmingspeed;
        }

        @Override
        public void swim() {
            System.out.println("this dolphin is swimming");
        }
    }
