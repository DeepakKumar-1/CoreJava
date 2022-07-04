package com.company.Patterns;

public class Pattern9 {
    public static void main(String []args){
        int n=5;
        int m=n;
        int q=n-1;
        for(int row=1; row<=n; row++){
            // Spaces
            for(int k=1; k<=row-1; k++){
                System.out.print(" ");
            }
            for(int col=1; col<=m; col++){
                System.out.print("*");
            }
            m--;
            for(int col=1; col<=q; col++){
                System.out.print("*");
            }
            q--;
            System.out.println();
        }
    }
}
