package Lesson1;

import java.util.Scanner;

public class pyramid {

    public static void main(String[] args) {

        Scanner inputStr = new Scanner(System.in);

        int i = inputStr.nextInt();

        for (int j = 1; j <= i; j++) {

            for (int k = 1; k <=j; k++) {

                System.out.printf(k + " ");

            }
            System.out.println();
        }

        inputStr.close();

    }

}
