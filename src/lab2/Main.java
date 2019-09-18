package lab2;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        float x = 12.5f;
        float y = 2f;
        float z = -8.2f;
        float result = sum(x, y, z);
        System.out.println(result);
        result = substract(x,y,z);
        System.out.println(result);
        result = multip(x,y,z);
        System.out.println(result);

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
}