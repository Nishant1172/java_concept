package polymorphism;

public class add {
    //If a class has multiple methods having
      //  same name but different in parameters, it is known as Method Overloading.
    public void sum(int a, int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        add a = new add();
        a.sum(10,20);
        a.sum(10,40);
    }

}

