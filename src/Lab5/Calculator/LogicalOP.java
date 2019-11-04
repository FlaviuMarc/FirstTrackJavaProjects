package Lab5.Calculator;

import java.lang.reflect.Array;

public class LogicalOP {
public float sum(int a, int b, float c){
    return a + b + c;
}
public float sum(int a, int b){
    return a + b;
}
public void ex2(){
    int[] myArray = new int [100];
    for (int i = 1; i <= 100; i++){
        myArray[i-1] = i;
        System.out.println(myArray[i-1]);
    }
}

public void ex3(){
    int myArray[] = new int[100];
    for (int i = 1; i <=100; i++){
        if(i % 2 ==0){
            myArray[i-1] = i;
            System.out.println(myArray[i-1]);
        }
    }

}

public float ex4(int[] myArray ){
    int sum = 0;
    int count = 0;
    int x = 1;
    while (x <= myArray.length){
       sum = sum + myArray[x-1];
        x++;
        count++;
    }
    return sum/count;
}
//5. Creati o metoda care sa primeasca un parametru de tip array de string-uri, populat cu valori, si un
// parametru de tip String. Metoda sa verifice daca valoarea string-ului primit se regaseste in array-ul primit,
// iar daca da sa returneze true iar daca nu, sa returneze false.  Apelati metoda in main() pentru a verifica daca functioneaza.

public boolean ex5(String[] myArray, String x) {
    for (int i = 1; i < myArray.length; i++) {
        if (myArray[i - 1] == x) {
            return true;
        } else {
            return false;
        }
    }
    return false;
}

//6. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori,
// si un parametru de tip numar. Metoda sa verifice daca numarul primit se afla in array-ul primit, si daca da,
// atunci sa returneze pozitia pe care se afla numarul.  Apelati metoda in main() pentru a verifica daca functioneaza.

public int ex6(int[] myArray, int x){
    for(int i = 1; i <= myArray.length; i++){
        if (myArray[i-1]==x){
            return i-1;
        }
        else{
            return 0;
        }
    }
  return 0;
}
}
