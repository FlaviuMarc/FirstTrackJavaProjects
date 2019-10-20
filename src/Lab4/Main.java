package Lab4;

import Lab4.Calculator2.LogicalOP;

public class Main {
    public static void main(String[] args ){


        LogicalOP exercitiu = new LogicalOP();
        exercitiu.printBackwards(50, 2);

        System.out.println();
        System.out.println("Exercitiu clasa 2: ");
        System.out.println(exercitiu.sumAndAverage());

        System.out.println("\n Java for loops ex 1: ");
        exercitiu.ex1(50);

        System.out.println("");
        System.out.println("\n Java for loops ex 2: ");
        exercitiu.ex2(80);

        System.out.println("");
        System.out.println("\n Java for loops ex 3: ");
        exercitiu.ex3(5,14);


    }
}
