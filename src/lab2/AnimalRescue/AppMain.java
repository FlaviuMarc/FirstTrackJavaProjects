package lab2.AnimalRescue;

public class AppMain {
    public static void main (String[] x){
        Cat Mita = new Cat();
//        System.out.println(Mita.name);
//
//        Mita.name = "Mita";
//
//        System.out.println("is"); Mita.lick();
        Mita.setName("Kitty");
        System.out.println("Mita's name is: ");
        System.out.println(Mita.getName());

        Mita.setColor("albastru");
        System.out.println("Mita's color is: ");
        System.out.println(Mita.getColor());

        Mita.setBreed("Persane");
        System.out.println("Mita's breed is:");
        System.out.println(Mita.getBreed());

        System.out.println("Mita's weight is: " + Mita.getBreed());

        Mita.setWeight(3.2f);
        System.out.println(Mita.getWeight());

        Mita.setAge(8);
        System.out.println("Mita's age is:");
        System.out.println(Mita.getAge());

        Mita.setGender('m');
        System.out.println("Mita's  gender is: ");
        System.out.println(Mita.getGender());


     Dog Rex = new Dog();

     Rex.setName("Athos");
        System.out.println( "\n Dog name is: ");
        System.out.println(Rex.getName());

     Rex.setBreed("Ciobanesc");
        System.out.println("Dog's breed is: ");
        System.out.println(Rex.getBreed());

     Rex.setWeight(31.2f);
        System.out.println("Dog's weight is: ");
        System.out.println(Rex.getWeight());

     Rex.setColor("Alb");
        System.out.println("Athos color is :");
        System.out.println(Rex.getColor());

     Rex.setAge(3.7f);
        System.out.println("Athis age is: ");
        System.out.println(Rex.getAge());

     Rex.setGender('f');
        System.out.println("Athis gender is: ");
        System.out.println(Rex.getGender());
    }



}
