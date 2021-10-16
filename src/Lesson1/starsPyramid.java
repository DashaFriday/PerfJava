package Lesson1;

import java.util.Scanner;

public class starsPyramid {

    //duplicate counter
    static int duplI;

    //symbol from min to max
    public static void min_max (char c, int count) {
        for (int k = 1; k <= count; k++) {

            System.out.print(c);

        }
    }

    //symbol from max to min
    public static void max_min(char c) {
        for (int k = duplI; k >= 1; k--) {

            System.out.print(c);

        }
    }

    public static void main(String[] args) {

        Scanner inputStr = new Scanner(System.in);

        int i = inputStr.nextInt();
        char ch = inputStr.next().charAt(0);
        duplI = i;

        //count of line
        for (int j = 1; j <= i; j++) {

            //first pyramid
            min_max(ch, j);
            max_min(' ');

            //second pyramid
            max_min(ch);
            min_max(' ',j);

            //third pyramid
            min_max(' ',j);
            max_min(ch);

            //fourth pyramid
            max_min(' ');
            min_max(ch,j);

            //decrease duplicate counter
            duplI--;

            //line break
            System.out.println();
        }

        inputStr.close();

    }

}
