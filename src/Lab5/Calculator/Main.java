package Lab5.Calculator;

public class Main {
    public static void main(String[] args) {
        LogicalOP tema = new LogicalOP();

        System.out.println("Java Arrays ex 1: ");
        System.out.println(tema.sum(5,8));
        System.out.println(tema.sum(5,8,2.5f));

        System.out.println("Java Arrays ex 2: ");
        tema.ex2();

        System.out.println("Java Arrays ex 3: ");
        tema.ex3();

        System.out.println("Java Arrays ex 4: ");
        int[] myArray = new int []{1,2,3,4,5,6,7};
        System.out.println(tema.ex4(myArray));

        System.out.println("Java Arrays ex 5: ");
        String[] listArray = new String[] {"mama","tata", "caine"};
        System.out.println(tema.ex5(listArray, "supa"));

        System.out.println("Java Arrays ex 6: ");
        int[] nrArray = new int[]{2,3,4,5,6,7,8,9,22,14,88};
        System.out.println(tema.ex6(nrArray, 8));
    }
}

