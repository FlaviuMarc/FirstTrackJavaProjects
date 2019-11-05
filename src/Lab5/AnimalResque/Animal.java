package Lab5.AnimalResque;

public class Animal {
    private float age = 2.2f;

    public void animalSound(String sound){
        System.out.println("The sound that animal makes: " + sound);
    }
    public void animalColor(String color){
        System.out.println("The color of the animal is: " + color);
    }
    public void animalBreed(String breed){
        System.out.println("The animal breed is: "+ breed);
    }

    public void animalAge(){
        System.out.println("Athos name is: " + age + " years old. ");
    }
    public void setAge(float newAge){
        this.age = newAge;
    }


}
