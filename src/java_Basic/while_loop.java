package java_Basic;

public class while_loop {
    public static void main(String[] args) {

        //while(condition){ code statement}
        int i=0;
        while (i<5){
            System.out.println(i);
            i++;
        }
        System.out.println(" Do while condition apply :");
        int a=0;
        do{
            System.out.println(a);
            a++;
        }while (a<10);
    }
}
