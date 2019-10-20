package Lab4.Calculator2;

public class LogicalOP {

    public void printBackwards (int nr1, int nr2){
        for (int i = nr1; i >= nr2; i--){
            System.out.print(i + ", ");
        }
    }

    public float sumAndAverage(){
           float sum = 0;
           float nr = 1;
           int count = 0;
           while (nr <= 100){
               sum = sum + nr;
               nr++;
               count++;
               }
           return (sum / count);
    }
    public void ex1(int nr1){
            for (int i = nr1; i<=100; i++)
                System.out.print(i + " ");
    }
    public void ex2(int nr1) {
        for (int i = nr1; i >= -100; i--) {
            System.out.print(i + " ");
        }
    }
    public void ex3 (int nr1, int nr2){
        aa:
        for (int i = nr1; i <= nr2; i++) {
            System.out.println(i++);
            bb:
            for (int j = nr2; j <= nr1; i++) ;
            break;
        }

        }

}
