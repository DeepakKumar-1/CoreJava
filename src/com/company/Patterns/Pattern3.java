package com.company.Patterns;

public class Pattern3 {
    public static void main(String[] args) {
        int n = 5;
        for(int row=1; row<=5; row++){
            for(int col=1; col<=n; col++){
                System.out.print("*");
            }
            System.out.println();
            n--;
        }
    }
}
