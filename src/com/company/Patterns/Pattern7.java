package com.company.Patterns;

public class Pattern7 {
    public static void main(String []args){
        int n=5;
        int m=n;
        for(int row=1; row<=n; row++){
            for(int k=1; k<=row; k++){
                System.out.print(" ");
            }
            for(int col=1; col<=m; col++){
                System.out.print("*");
            }
            System.out.println();
            m--;
        }
    }
}
