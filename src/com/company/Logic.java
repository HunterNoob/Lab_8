package com.company;

import java.io.*;

public class Logic {
    public static int[][] process(int[][] arr) {
        int max = arr[0][0];
        int min = arr[0][0];
        int column = arr[0].length;
        int row = arr.length;

        int[][] arr1= new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = i; j < column; j++) {
                int temp = arr[i][j];

                temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }

        }
        return arr;
    }
}
