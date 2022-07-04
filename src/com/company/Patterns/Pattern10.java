package com.company.Patterns;

public class Pattern10 {
    public static void main(String []args){
        int n=5;
        int m=n;
        for(int row=1; row<=n; row++){
            // Spaces
            for(int k=1; k<=m; k++){
                System.out.print(" ");
            }
            m--;
            for(int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
