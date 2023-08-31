package java_Basic;

import java.util.Scanner;

public class logical {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b= sc.nextInt();
        if (a>10 && b < 20){
            System.out.println("true");
        }
        else {
            System.out.println("False");
        }
    }
}

