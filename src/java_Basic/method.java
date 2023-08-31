package java_Basic;

import java.util.Scanner;

public class method {
    static int x;
    static int c;
    static int p;
    static int data(){
        Scanner sc = new Scanner(System.in);
        p =sc.nextInt();
        return p;
    }
    int display(int x, float y){
        this.x = x;
        float d = this.x - y;
        System.out.println(d);
        return (int) (d);
    }
    public static void main(String[] args) {
        int a;
        float b=10;
        a =method.data();

        method m1= new method();
        System.out.println("return float value");
        m1.display(a,b);

        System.out.println("return int value ");
        c = m1.display(a,b);
        System.out.println(c);
    }
}
