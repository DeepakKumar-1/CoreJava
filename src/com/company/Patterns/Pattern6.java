package com.company.Patterns;

public class Pattern6 {
    public static void main(String []args){
        int n=5;
        int m=n-1;
        for(int row=1; row<=n; row++){
            // Spaces
            for(int k=1; k<=m; k++){
                System.out.print(" ");
            }
            m--;
            // print stars
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
