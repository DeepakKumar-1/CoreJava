package com.company.Patterns;

public class Pattern5 {
    public static void main(String []args){
        int n=5;
        int m=n-1;
        for(int row=1; row<=2*n; row++){
            if(row<=n) {
                for (int col = 1; col <= row; col++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            else{
                for(int col=1; col<=m; col++){
                    System.out.print("*");
                }
                System.out.println();
                m--;
            }
        }
    }
}
