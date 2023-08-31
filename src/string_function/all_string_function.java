package string_function;

public class all_string_function {
    public static void main(String[] args) {

        String s1 = "Hello_World";
        String s2 = "Hello_World";
        String s3 = "Welcome to java string";
        String s4 = "       good morning          ";
        System.out.println(s1.equals(s2)); //false

        System.out.println(s1.equalsIgnoreCase(s2)); //true

        System.out.println(s1.compareTo(s2)); //compare the char size -32 output -32 ascii value
        System.out.println(s1.compareTo(s3)); //

        System.out.println(s1.concat(s3));  // merge two string

        System.out.println(s1.substring(2)); //starting index no 2
        System.out.println(s1.substring(0,9));// starting index no0 to 9
        System.out.println(s1.substring(2,8));

        System.out.println(s1.toLowerCase()); // covert the lower char
        System.out.println(s2.toUpperCase()); // covert show the upper char

        System.out.println(s4);
        System.out.println(s4.trim()); // remove the whitespace

        System.out.println(s1.startsWith("H"));
        System.out.println(s1.endsWith("World"));
        System.out.println(s1.contains("llo"));

        System.out.println(s3.length()); // given back length of string with whitespace

        System.out.println(s3.charAt(4)); // given back char index number and value
        System.out.println(s3.lastIndexOf("n"));

        System.out.println(s3.isEmpty()); // check the oue string is empty or not

        System.out.println(s3.indexOf('e',3)); // getting the char value index number
        System.out.println(s3.indexOf("t")); // getting the string value index number

        char[] ch = new char[20];
        s3.getChars(2,18,ch,2);
        System.out.println(ch);
    }
}
