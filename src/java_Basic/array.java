package java_Basic;

public class array {
    public static void main(String[] args) {
       // arrays is a collection of items of same datatype store at contiguous memory locations.

        //   arrays are used to store multiple values in a single variable,
        //   instead of declaring separate variables for each value.

        //one or more data to store in same datatype .
        // datatype variable[size];
        // int a[5];

        String[] name ={"nishant", "patel"};

        //System.out.println( name[1]+"\n"+ age[0]);

        //for(Initialization, condition, Increment/dec)
        for(int i=0; i<name.length; i++){
            System.out.println( name[i]);
        }
    }
}
