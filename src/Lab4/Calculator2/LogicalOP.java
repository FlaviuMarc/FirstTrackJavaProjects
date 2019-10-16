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
}
