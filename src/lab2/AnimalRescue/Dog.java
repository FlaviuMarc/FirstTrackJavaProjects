package lab2.AnimalRescue;

public class Dog {

        private String color = "Maro";
        private String breed = "German Shepard";
        private float weight = 33.5f;
        private float age = 2.5f;
        private char gender = 'n';
        private String name = "Rex/a";

        public void setBreed (String newBreed){
            this.breed = newBreed;
        }
        public String getBreed(){
            return breed;
        }
        public void setWeight(float newWeight){
            this.weight = newWeight;
        }
        public float getWeight(){
            return weight;
        }


        public String bark() {
            return ("woof");
        }

        public String jump(){
            return "jump";
        }


    }

