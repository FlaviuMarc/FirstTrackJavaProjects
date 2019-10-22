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
    public void ex3 (int nr1, int nr2) {
        aa:
        for (int i = nr1; i < nr2; i++) {
            System.out.print(" " + i + ",");
        }
        for (int i = nr2; i < nr1; i++)
            System.out.print(" " + i +",");
    }

    public void ex4 (int nr1, int nr2){

            for (int i = nr1; i < nr2; i++) {
                System.out.print(" " + i + ",");
            }
            for (int i = nr2; i < nr1; i++)
                System.out.print("" + i + ",");
        }
        public void ex5(){

        for (int i = 0; i<=100; i++ ){
            if (i%2==0){
                System.out.print("" + i + ",");
            }
        }
        }

        public void ex6(){
        for (int i=100; i>=0; i--){
            if (i%2!=0){
                System.out.print("" + i + ",");
            }
        }
        }
        public int ex7(int x){
        int sumaTotala = 0;
        for (int i = x; i < 100; i++ ){
         sumaTotala = sumaTotala + i;

            }
        return sumaTotala;
         }

         public int ex8(int x){
        int sumaTotala = 0;
        for (int i = x; i < 100; i++){
            sumaTotala = sumaTotala + i;

        }
        return sumaTotala / (100 - x + 1);
         }

         public void ex9(){
        for (int i = 7; i > 0; i--){
            System.out.print("\n");
        for (int j = 0; j < i; j++){
            System.out.print("*");
        }
        }
         }
    }

