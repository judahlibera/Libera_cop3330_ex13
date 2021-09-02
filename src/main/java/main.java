/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Judah Libera
 */
import java.util.*;
public class main {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("What is the principle amount: ");
        double P = sc.nextDouble();
        System.out.printf("What is the rate of interest: ");
        double r = sc.nextDouble();
        System.out.printf("What is the number of years: ");
        int t = sc.nextInt();
        System.out.printf("What is the number of times the interest is compounded per year? ");
        int n = sc.nextInt();
        System.out.printf("$%.2f invested at %.1f%% for %d years compounded %d times per year is $%.2f.", P, r, t, n, P * Math.pow((1 + (r/100)/n),(n*t)));
    }
}