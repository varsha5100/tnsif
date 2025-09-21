package com.tnsif.sixth;

public class JaggedArrayStatic {

    public static void main(String[] args) {
        int[][] jaggedArray = {
            {1, 2, 3, 4},       
            {5, 6},            
            {7, 8, 9, 10, 11}  
        };
        System.out.println("Elements of the Jagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            System.out.print("Row " + i + ": ");
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}