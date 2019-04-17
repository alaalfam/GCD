package com.company;

import java.util.Scanner;

public class Main {
    private static int GCD(int n , int m){
        int min = (n<m)?n:m; // find min(n,m)
        for (int i = min; i >=2 ; i--) {
            if (n%i == 0 && m%i == 0){
                return i;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number n.");
        int n = scan.nextInt();
        System.out.println("Enter number m.");
        int m = scan.nextInt();
        System.out.println("GCD("+n+","+m+") = "+GCD(Math.abs(n) , Math.abs(m)));
    }
}
