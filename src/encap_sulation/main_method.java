package encap_sulation;

import java.util.Scanner;

public class main_method extends setter_getter {
    public static void main(String[] args) {

        setter_getter sg = new setter_getter();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name :");
        sg.setUsername(sc.nextLine());

        System.out.println("Enter the address:");
        sg.setAddress(sc.next());

        //System.out.println(" Enter the name : " + sg.getName());
        System.out.println(sg.getName());
        System.out.println("Enter the address : " + sg.getAddress());
    }

}
