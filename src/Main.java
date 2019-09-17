import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // Exercitiu 1

        System.out.println("Exercitiu 1:");
        System.out.println("Hello\nFlaviu\n");

        //Exercitiu 2
        int min = 2;
        int max = 100;
        System.out.println("Exercitiu 2 \nSuna a doua numere aleatorii intre min ("+ min +") si max ("+ max +")" );
        System.out.println(new Random().nextInt((max - min) + 1) + min);

        //Dormitor
        byte walls = 4;
        byte doors = 2;
        byte windows = 2;
        String roomColour = "alb";
        byte pat = 1;
        float haine = 220.4f;
        float luminozitate = 1300.58f;
        System.out.println("Suma intre walls si doors");
        System.out.println(walls + doors);


        //Exercitiu 3
        System.out.println("\nExercitiu 3:");
        System.out.println("Luminozitate + haine = " + luminozitate / haine);

        //Exercitiu 4
        System.out.println("\nExercitiul 4");
        System.out.println(-5 + 8 * 6);
        System.out.println((55+9) % 9 );
        System.out.println(20 + -3*5 / 8 );
        System.out.println(5 + 15 / 3 * 2 - 8 % 3 );





	// write your code here
    }
}
