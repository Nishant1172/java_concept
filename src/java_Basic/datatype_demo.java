package java_Basic;

import java.util.Scanner;

public class datatype_demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstname = sc.nextLine();
        String lastname = sc.nextLine();
        String gender = sc.nextLine();
        long age = sc.nextLong();

        String fullName = firstname + lastname;
        System.out.println(fullName);
        System.out.println(gender);
        System.out.println(age);


    }
}
