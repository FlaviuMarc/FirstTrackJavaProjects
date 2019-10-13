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
        System.out.println(Mita.getName());

        Mita.setColor("albastru");
        System.out.println(Mita.getColor());

     Dog Rex = new Dog();

     Rex.setBreed("Ciobanesc");
        System.out.println(Rex.getBreed());

     Rex.setWeight(31.2f);
        System.out.println(Rex.getWeight());
    }


}
