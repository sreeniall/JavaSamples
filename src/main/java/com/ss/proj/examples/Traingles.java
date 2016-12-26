package com.ss.proj.examples;

/**
 * Created by sreen on 12/26/2016.
 */
public class Traingles {

    public boolean printTriangle(){
        for(int i=1;i<=5;i++) {
            for(int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for (int k = 1; k<=(2*i-1); k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        return true;
    }

    public boolean printSquear(){
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        return true;
    }


    public static void main(String[] args){
        Traingles tr = new Traingles();
        tr.printTriangle();
    }
}
