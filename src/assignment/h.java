package assignment;

import java.util.Scanner;

public class h {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String s=sc.nextLine();

        char[] ch = new char[s.length()];
        int z=0,cc=0;
        for(int i = 0; i<s.length(); i++){
            int count=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                ch[z]=s.charAt(i);
                z++;
                cc++;
            }
        }
        if(cc>0){
            System.out.println("Unique characters:");
            for(int i=0;i<ch.length;i++){
                System.out.println(ch[i]);
            }
        }
        else{
            System.out.println("No unique characters");
        }
    }
}

