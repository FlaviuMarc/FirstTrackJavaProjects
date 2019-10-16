package Lab4;

import Lab4.Calculator2.LogicalOP;

public class Main {
    public static void main(String[] args ){

        System.out.println("Exercitiul clasa 1: ");

        LogicalOP exercitiu = new LogicalOP();
        exercitiu.printBackwards(50, 2);

        System.out.println();
        System.out.println("Exercitiu clasa 2: ");
        System.out.println(exercitiu.sumAndAverage());

    }
}
