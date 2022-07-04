package com.company.Patterns;

public class Pattern8 {
    public static void main(String[] args) {
        int n=5;
        int m= n;
        int count = 1;
        for(int row=1; row<=n; row++){
            // Spaces
            for(int k=1; k<=m; k++){
                System.out.print(" ");
            }
            m--;

            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            if(row >= 2) {
                for (int col = 1; col <= count; col++) {
                    System.out.print("*");
                }

                count++;
            }
            System.out.println();
        }
    }
}
