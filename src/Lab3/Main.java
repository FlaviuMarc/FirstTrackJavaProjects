package Lab3;

public class Main {


      public int Check;
    public static void main (String[] args) {



        System.out.println("Exercitiul 1:");
        Calculator MyCalc = new Calculator();
        System.out.println("This is devide: " + MyCalc.devide(10,4));
        System.out.println("This is sume: " + MyCalc.sum(10f,4f, 2f));
        System.out.println("This is substract: " + MyCalc.substract(10,4, 1));
        System.out.println("This is multip: " + MyCalc.multip(10,4,1));
        System.out.println("This is mean: " + MyCalc.mean(10,4, 1));
        System.out.println("This is modulo: " + MyCalc.modulo(10,4));

        System.out.println("Exercitiul 3:");
        LogicalOp Logic = new LogicalOp();
        System.out.println("The greater number is: " + Logic.checkBiggerNumber(10,6));

        System.out.println("Exercitiul 4:");
        LogicalOp op = new LogicalOp();
        System.out.println(op.textComparation("FastTrackJ"));
        System.out.println("Exercitiul 5:");
        String text = "FastTrackIT";
        System.out.println(Logic.exercitiul5(text, 4));
        System.out.println("Exercitiul 6:");
        System.out.println(Logic.exercitiul6(3));
        System.out.println("Exercitiul 7:");
        System.out.println(Logic.exercitiul7(3));

    }

    }

