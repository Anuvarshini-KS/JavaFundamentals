package com.KovanLabs.Intern.ArrayConcepts;
import java.util.*;
public class MatrixMultiplication {
    static int MAX = 100;
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int[][] array1 = new int [MAX][MAX];
        int[][] array2 = new int [MAX][MAX];
        System.out.println("Enter row 1 value : ");
        int row1 = sc.nextInt();
        System.out.println("Enter column 1 value : ");
        int col1 = sc.nextInt();
        System.out.println("Enter the values for Array1 :");
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col1;j++)
            {
                array1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter row 2 value : ");
        int row2 = sc.nextInt();
        System.out.println("Enter column 2 value : ");
        int col2 = sc.nextInt();
        System.out.println("Enter the values for Array2 :");
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col1;j++)
            {
                array2[i][j] = sc.nextInt();
            }
        }
        int[][] multiplyArray = new int [row1][col2];
        System.out.println("The Matrix Multiplication ");
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col2;j++)
            {
                for(int k=0;k<row2;k++)
                {
                    multiplyArray[i][j] = array1[i][k] * array2[k][j];
                }
            }
        }
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col2;j++)
            {
                System.out.print(multiplyArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
