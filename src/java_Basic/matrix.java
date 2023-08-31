package java_Basic;

import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {

        //int[][] a= {{2,3},{4,5}};
        Scanner sc= new Scanner(System.in);
        int a[][]= new int[2][2];

        for (int i=0; i<a.length;i++)
        {
            for (int j = 0; j < a.length; j++)
            {
                System.out.print("Enter a[" + i + "]" + "[" + j + "]");
                a[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        for (int i=0; i<a.length;i++)
        {
            for (int j = 0; j < a.length; j++)
            {
                System.out.print(a[i][j] +"\t");
            }
            System.out.println();
        }
    }
}
