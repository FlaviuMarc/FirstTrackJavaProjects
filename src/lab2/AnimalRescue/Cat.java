package lab2.AnimalRescue;

public class Cat {
    private String color = "White";
    private String breed = "Burmese";
    private float weight = 3.4f;
    private float age = 5.2f;
    private char gender = 'f';
    private String name = "Miti";
    public void  setName (String newName)  {
        this.name = newName;

    }
    public String getName(){
        return name;
    }
    public void setColor(String newColor){
        this.color = newColor;
    }
    public String getColor(){
        return color;
    }
    public void setBreed(String newBreed){
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
    public void setAge (float newAge){
        this.age = newAge;
    }
    public float getAge(){
        return age;
    }
    public void setGender(char newGender){
      this.gender = newGender;
    }
    public char getGender (){
        return gender;
    }


    public void moew(){
        System.out.println("meow");

    }

    public void sit(){
        System.out.println("sit");

            }
     public void lick (){
         System.out.println("licking");
     }
     public void sleep(){
         System.out.println("sleeping");
     }

     public void scratch (){
         System.out.println("scratching");
     }
}
