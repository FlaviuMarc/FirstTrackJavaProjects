package lab7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Read {

    public float retFloat(){
        float x = 0.0f;
        boolean repeat = false;

        do{
            try{
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter a real number: ");
                x = scan.nextFloat();

            }
            catch (InputMismatchException e){
                System.out.println("Incorect value, please enter a correct number!");
                repeat = true;
            }

        }
        while(repeat == true);
        return  x;
    }

}
