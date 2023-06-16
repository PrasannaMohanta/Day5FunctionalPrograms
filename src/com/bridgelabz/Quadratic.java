package com.bridgelabz;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter value: ");
        int a=r.nextInt();
        System.out.println("Enter value: ");
        int b=r.nextInt();
        System.out.println("Enter value: ");
        int c=r.nextInt();

        double d=(b*b-4*a*c);
        if(d>0){
            double r1=b+Math.sqrt(d)/(2*a);
            double r2=b-Math.sqrt(d)/(2*a);
            System.out.println("The roots are: " + r1 + " and " + r2);
        }
        else{
            System.out.println("Roots are imaginary");
        }
    }
}
