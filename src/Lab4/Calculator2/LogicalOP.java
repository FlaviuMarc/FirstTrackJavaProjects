package Lab4.Calculator2;

public class LogicalOP {

    public void printBackwards(int nr1, int nr2) {
        for (int i = nr1; i >= nr2; i--) {
            System.out.print(i + ", ");
        }
    }

    public float sumAndAverage() {
        float sum = 0;
        float nr = 1;
        int count = 0;
        while (nr <= 100) {
            sum = sum + nr;
            nr++;
            count++;
        }
        return (sum / count);
    }

    public void ex1(int nr1) {
        for (int i = nr1; i <= 100; i++)
            System.out.print(i + " ");
    }

    public void ex2(int nr1) {
        for (int i = nr1; i >= -100; i--) {
            System.out.print(i + " ");
        }
    }

    public void ex3(int nr1, int nr2) {
        aa:
        for (int i = nr1; i < nr2; i++) {
            System.out.print(" " + i + ",");
        }
        for (int i = nr2; i < nr1; i++)
            System.out.print(" " + i + ",");
    }

    public void ex4(int nr1, int nr2) {

        for (int i = nr1; i < nr2; i++) {
            System.out.print(" " + i + ",");
        }
        for (int i = nr2; i < nr1; i++)
            System.out.print("" + i + ",");
    }

    public void ex5() {

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print("" + i + ",");
            }
        }
    }

    public void ex6() {
        for (int i = 100; i >= 0; i--) {
            if (i % 2 != 0) {
                System.out.print("" + i + ",");
            }
        }
    }

    public int ex7(int x) {
        int sumaTotala = 0;
        for (int i = x; i < 100; i++) {
            sumaTotala = sumaTotala + i;

        }
        return sumaTotala;
    }

    public int ex8(int x) {
        int sumaTotala = 0;
        for (int i = x; i < 100; i++) {
            sumaTotala = sumaTotala + i;

        }
        return sumaTotala / (100 - x + 1);
    }

    public void ex9() {
        for (int i = 7; i > 0; i--) {
            System.out.print("\n");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
        }
    }

    public void exw1(int x) {

        do {
            System.out.print(x + " ");
            x++;
        }
        while (x <= 100);
    }

    public void exw2(int x) {
        do {
            System.out.print(x + " ");
            x--;
        }
        while (x >= -100);
    }

    public void exw3(int x, int y) {
        do {
            System.out.print(x + " ");
            x++;
        }
        while (x < y);
        do {
            System.out.print(y + " ");
            y++;
        }
        while (y < x);
    }

    public void exw4(int x, int y) {
        while (x < y) {
            System.out.print(x + " ");
            x++;
        }

        while (y <= x) {
            System.out.print(y + " ");
            y++;
        }
    }

    public void exw5() {
        int i = 0;
        do {

            i++;
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        while (i <= 100);
    }

    public void exw6() {
        int i = 0;
        do {
            i++;
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        while (i <= 100);
    }

    public void exw7() {
        int x = 111;
        int sum = 0;
        int count = 0;
        int intCount = 0;
        while (x <= 8899) {
            sum = sum + x;
            x++;
            count++;
        }
        intCount = sum / count;

        System.out.print(sum + " ");
        System.out.print("\n" + intCount + " ");

    }
    public float exw8(int x, int y){
        int aux;
        float sum = 0;
        int count = 0;
        if(y<x) {
            aux = y;
            y=x;
            x=aux;
        }

        while(x<=y){
            if(x % 7 == 0){
                sum = sum + x;
                count++;
            }
            x++;
        }
        return sum / count;
    }

    public void exw9() {
        int x = 1;
        int y = 0;
        int z = 1;
        while (x <= 20) {
            System.out.print(y + " ");
            int sum = y + z;
            y = z;
            z = sum;
            x++;
        }
    }

    public void exw10() {
        int n = 1;
        do {


            if (n % 3 == 0 && n % 5 == 0 && n % 7 == 0) {
                System.out.print(" " + "CozaLozaWoza" + ", ");
            }

            else if (n % 3 == 0 && n % 5 == 0) {
                System.out.print(" " + "CozaLoza" + " ,");
            }

            else if (n % 5 == 0 && n % 7 == 0) {
                System.out.print(" " + "wozaLoza" + ", ");
            }

            else if (n % 3 == 0 && n % 7 == 0) {
                System.out.print(" " + "cozaWoza" + ", ");
            }

            else if (n % 3 == 0) {
                System.out.print(" " + "coza" + " ,");
            }

            else if (n % 5 == 0) {
                System.out.print(" " + "loza" + ", ");
            }

            else if (n % 7 == 0) {
                System.out.print(" " + "woza" + ", ");
            } else {
                System.out.print(" " + n + " ,");
            }
            n++;
        } while (n <= 110);
    }
}


