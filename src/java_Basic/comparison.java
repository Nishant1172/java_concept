package java_Basic;

import java.util.Scanner;

public class comparison {
    public static void main(String[] args) {

    int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b= sc.nextInt();

        if(a < b){
            System.out.println(" a And  b value are same");
        }
        else if(!(a==b)){
            System.out.println("a and b value are not same");
        }
        else {
            System.out.println(" both condition are false");
        }
    }
}
