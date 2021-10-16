package Lesson1;

import java.util.Scanner;

public class starsPyramid {

    //duplicate counter
    static int duplI;

    //* from min to max
    public static void min_max (int count) {
        for (int k = 1; k <= count; k++) {

            System.out.print("*");

        }
    }

    //space from max to min
    public static void max_min_space() {
        for (int h = 0; h < duplI; h ++) {
            System.out.print(" ");
        }
    }

    //* from max to min
    public static void max_min() {
        for (int k = duplI; k >= 1; k--) {

            System.out.print("*");

        }
    }

    //space from min to max
    public static void min_max_space(int count) {
        for (int h = count; h > 0; h --) {
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {

        Scanner inputStr = new Scanner(System.in);

        int i = inputStr.nextInt();
        duplI = i;

        //count of line
        for (int j = 1; j <= i; j++) {

            //first pyramid
            min_max(j);
            max_min_space();

            //second pyramid
            max_min();
            min_max_space(j);

            //third pyramid
            min_max_space(j);
            max_min();

            //fourth pyramid
            max_min_space();
            min_max(j);

            //decrease duplicate counter
            duplI--;

            //line break
            System.out.println();
        }

        inputStr.close();

    }

}
