package java_Basic;

import java.util.Scanner;

public class switch_op {
    public static void main(String[] args) {

        System.out.print("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        String operation = sc.next();
        switch (operation){
            case "1":
                System.out.println("Sunday");
                break;
            case "2":
                System.out.println("Monday");
                break;
            case "3":
                System.out.println("Tuesday");
                break;
            case "4":
                System.out.println("Wednesday");
                break;
            case "5":
                System.out.println("Thursday");
                break;
            case "6":
                System.out.println("Friday");
                break;
            case "7":
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Please enter right operation");
        }
    }
}
