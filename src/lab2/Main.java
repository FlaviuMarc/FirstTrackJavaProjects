package lab2;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        float x = 12.5f;
        float y = 2f;
        float z = -8.2f;
        float F = 78f;
        float in = 147f;
        float D = 1200f;
        float T = 3670f;
        float result = sum(x, y, z);
        printMyName();
        System.out.println("Ex:2 \n" + result);
        result = substract(x,y,z);
        System.out.println(result);
        result = multip(x,y,z);
        System.out.println(result);
        result = devide(x,y);
        System.out.println(result);
       printJava();
         result = mean(x,y,z);
        System.out.println("Ex 4: \n" + result);
        printFace();

        result = modulo(x,y);
        System.out.println("Ex 6: \n" + result);
        result = temp(F);
        System.out.println("Ex 7: \n C=" + result);

        result = distance(in);
        System.out.println("Ex 8: \n m=" + result);

        speed(1200,1,1,10);

    }

    public static void printFace() {
        System.out.println("Ex: 5:\n");
        System.out.println("  +\"\"\"\"\"\"\"+");
        System.out.println("[ | o   o | ]");
        System.out.println("  |   ^   |");
        System.out.println("  |  '_'  |");
        System.out.println("  +-------+");
    }

    public static void printJava() {
        System.out.println("Ex: 3");
        System.out.println("   J   a  V     V   a");
        System.out.println("   J  a a  V   V   a a");
        System.out.println("J  J aaaaa  V V   aaaaa");
        System.out.println(" JJ a     a  V   a     a");
    }


    public static void printMyName(){
        System.out.println("Hello \n Flaviu");
            }

        public static float sum (float first, float second, float third){
            float sum = first + second + third;
            return sum;
        }


    public static float substract (float first, float second, float third){
        float res = first - second - third;
        return res;

}
public static float multip (float first, float second, float third){
        float ori = first * second * third;
        return ori;
}

public static float devide (float first, float second){
        float imp = first / second;
        return imp;
}
public static float mean (float first, float second, float third){
    float meanValue = (first + second + third) / 3;
return meanValue;
}
public static float modulo(float first, float second){
    float modu = first % second;
    return modu;
}
public static float temp (float F){
        float C = (5f/9f)*(F -32f);
        return C;
}
public static float distance (float in){
        float m = in / 39.37f;
        return m;
}
public static void speed (float distance,int hours, int minutes, int seconds){
        int totalTimeSeconds = hours*3600 + minutes*60 + seconds;
    System.out.println("Speed in m/s : " + distance / totalTimeSeconds);
    System.out.println("Speed in km/h : " + (distance / 1000)/(totalTimeSeconds / 3600));
    System.out.println("Speed in mi/h : " + (distance / 1609.344)/(totalTimeSeconds / 3600));
}

}