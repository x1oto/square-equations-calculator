package com.company;
import java.util.Scanner;
public class Main {
    // Square equations calculator by x1oto
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double d;
        System.out.print("Enter number #1: ");
        double a = scan.nextDouble();
        System.out.print("Enter number #2: ");
        double b =  scan.nextDouble();
        System.out.print("Enter number #3: ");
        double c =  scan.nextDouble();
        // D = B*2 - 4AC
        d =  ((b*b) - (4*a*c));
        if (d > 0) {
            double res1, res2;
            res1 =  ((-b + Math.sqrt(d)) / (2*a));
            res2 =  ((-b - Math.sqrt(d)) / (2*a));
            System.out.println("x1: " + res1);
            System.out.println("x2: " + res2);
        } else if (d == 0) {
            double res1;
            res1 =  (-b / 2*a);
            System.out.println("x1: "  + res1);
        } else {
            System.out.println("No roots...");
        }
    }
}