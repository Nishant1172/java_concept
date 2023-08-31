package java_Basic;

import java.util.Scanner;

public class all_variable {
    
    int a,b;
    int data(){
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        return a;
    }
    int multiplication(int x, int y){
        int z = x * y;
        this.a =x;
        System.out.println( "multiplication two integer number : "+z);
        return z;
    }
    public static void main(String[] args) {
        int a,b;
         all_variable ab =new all_variable();
         a = ab.data();
         b = (int) ab.data();
         ab.multiplication(a,b);

    }
}
