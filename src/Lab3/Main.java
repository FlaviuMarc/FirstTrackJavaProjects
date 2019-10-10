package Lab3;

public class Main {
    /*public static void main(String[] args) {

        LogicalOp op = new LogicalOp();
        System.out.println(op.textComparation("FastTrackJ"));
//       }*/
      public int Check;
    public static void main (String[] args) {
        String text = "FastTrackIT";
        int x = 3;
        int y = 3;
        int z = 4;

        if ((text.equals("FastTrackIT") && y <= x)) {
            System.out.println(text + "  " + y);
        } else if (!text.equals("FastTrackIT") && y >= z) {
            System.out.println(y + "   " + text);
        }

    }
    }

