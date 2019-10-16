package Lab3;

public class Calculator {
    public float sum (float first, float second, float third){
        float sum = first + second + third;
        return sum;
    }


    public float substract (float first, float second, float third){
        float res = first - second - third;
        return res;

    }
    public float multip (float first, float second, float third){
        float ori = first * second * third;
        return ori;
    }

    public float devide (float first, float second){
        float imp = first / second;
        return imp;
    }
    public float mean (float first, float second, float third){
        float meanValue = (first + second + third) / 3;
        return meanValue;
    }
    public float modulo(float first, float second) {
        float modu = first % second;
        return modu;
    }
    public int square(int x){
        int y = x;
        int nr =  (x * y);
        return nr;
    }
}
