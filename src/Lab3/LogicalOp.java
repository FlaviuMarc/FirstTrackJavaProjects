package Lab3;

public class LogicalOp {

    public String textComparation(String text){
        if (text.equals("FastTrack")){
            return ("Learning text comparison");
        }
        else{
           return ("Got to try some more");
        }
    }
    public int checkBiggerNumber(int x, int y){
        if (x>y){
            return x;
        }
        else {
            return y;
        }
    }
    public String exercitiul5(String text, int x) {

        if (text.equals("FastTrackIT") && x <= 3) {
           return (text + "  " + x);
        } else if (text.equals("FastTrackIT") && x >= 4){
            return (x + "   " + text);
        } else {
            return null;
        }
    }
    public String exercitiul6(int x){
        if (x>=8 && x==6){
            return "The amount of snow this winter was(cm):" + x;
        }
        else {
            return "The forecast snow is(cm):" + x;
        }
    }
    public String exercitiul7(int x){
        if (x>3 && x!=4 ){
            return "The number is greater than 3 and not equal to 4";
        }
        else if (x==4){
            return "The number is equal to 4";
        }
        else {
            return "The number is lower than 3";
        }
    }
    public boolean isNumberEven (int x){
        if(x%2==0 ){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isEligibleToVote (int x){
        if (x>18){
            return true;
        }
        else{
            return false;
        }
    }
    public int exercitiul11 (int x, int y, int z){
        if (x>y && x>z){
            return x;
        }
        else if (y>x && y>z){
            return y;
        }
        else{
            return z;
        }
    }
    public void swichMetode (int x) {
        switch (x) {
            case 1:
                System.out.println("The number is: 1!");
                break;
            case 2:
                System.out.println("The number is: 2!");
                break;
            case 3:
                System.out.println("The number is: 3!");
                break;
            case 4:
                System.out.println("The number is: 4!");
                break;
            case 5:
                System.out.println("The number is: 5!");
                break;
            default:
                System.out.println(x);
                break;
        }
    }
}
