package constructor;

public class cons {
    //parameterised constructor
    cons(int empId, String empName){
        System.out.println(empId);
        System.out.println(empName);
    }

    public static void main(String[] args) {

        cons c = new cons(10,"nishant");
    }

}
