package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class list {
    public static void main(String[] args) {

        List<String> ls = new ArrayList<String>();
        ls.add("banana");
        ls.add("apple");
        ls.add("grapes");
        ls.add("mango");

        Collections.sort(ls);
        for(String fr : ls)
        {
            System.out.println(fr);
        }
    }
}
