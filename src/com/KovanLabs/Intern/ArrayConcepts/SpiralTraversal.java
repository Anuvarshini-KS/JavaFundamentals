package com.KovanLabs.Intern.ArrayConcepts;
import java.util.*;
public class SpiralTraversal {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns :");
        int col = sc.nextInt();
        int[][] array1 = new int[row][col];
        System.out.println("Enter the values for array :");
        for(int i=0;i<array1.length;i++)
        {
            for(int j=0;j< array1[i].length;j++)
            {
                array1[i][j] = sc.nextInt();
            }
        }
        int rowStart = 0, rowEnd = row-1, colStart = 0, colEnd = col-1;
        while(rowStart <= rowEnd && colStart <= colEnd)
        {
            for(int i=colStart;i<=colEnd;i++)
            {
                System.out.print(array1[rowStart][i]+" ");
            }
            rowStart+=1;
            for(int i=rowStart;i<=rowEnd;i++)
            {
                System.out.print(array1[i][colEnd]+" ");
            }
            colEnd-=1;
            if(rowStart<=rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    System.out.print(array1[rowEnd][i] + " ");
                }
                rowEnd -= 1;
            }
            if(colStart<=colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    System.out.print(array1[i][colStart] + " ");
                }
                colStart += 1;
            }
        }
    }

}
