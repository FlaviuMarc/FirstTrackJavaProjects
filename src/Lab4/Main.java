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
        exercitiu.ex2(20);

        System.out.println("");
        System.out.println("\n Java for loops ex 3: ");
        exercitiu.ex3(5,14);

        System.out.println("");
        System.out.print("\n Java for loops ex 4: ");
        exercitiu.ex4(8, 2);

        System.out.print("");
        System.out.print("\n Java for loops ex 5: ");
        exercitiu.ex5();

        System.out.println("");
        System.out.println("\n Java for loops ex 6: ");
        exercitiu.ex6();


        System.out.println("");
        System.out.print("\n Java for loops ex 7: ");
        System.out.println(exercitiu.ex7(22));


        System.out.println("");
        System.out.println("\n Java for loops ex 8: ");
        System.out.println(exercitiu.ex8(30));


        System.out.println("");
        System.out.println("\n Java for loops ex 9: ");
        exercitiu.ex9();


        System.out.println("\n \n Exercitiile Java While Loop \n");

        System.out.println("Java While Loop ex1: ");
        exercitiu.exw1(90);

        System.out.println("\n \nJava While Loop ex2: ");
        exercitiu.exw2(-80);

        System.out.println("\n \nJava While Loop ex3: ");
        exercitiu.exw3(5,10);

        System.out.println("\n \nJava While Loop ex4: ");
        exercitiu.exw4(8, 5);

    }
}
