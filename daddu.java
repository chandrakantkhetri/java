
package javaprogram;

import java.util.Scanner;

public class adding {
    public static void main(String[] args) {
        System.out.println("  Enter  Number from 100 to 200");
        Scanner sc = new Scanner(System.in);
        System.out.println("Aditya Pandit Please Enter a start number :");
        int i = sc.nextInt();
        System.out.println("Aditya Pandit Please Enter a last number :");
        int j = sc.nextInt();

        while (i <= j) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("Hey, Aditya see Above for the y0ur Answer !7");
        System.out.println("Thanks for Asking me !");
    }
}
