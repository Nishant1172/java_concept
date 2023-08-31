package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class array_list {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);

        for (int i =0; i< al.size(); i++){
            System.out.println(al.get(i));
        }

        System.out.println("use the for each loop : ");
        for (int str : al){
            System.out.println(str);
        }

        System.out.println("Iterator concept :");
        Iterator<Integer> itr = al.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("back word Iterator :");
        ListIterator<Integer> back_itr = al.listIterator(al.size());
        while (back_itr.hasPrevious()){
            System.out.println(back_itr.previous());
        }
        //add the new number inside the array list
        System.out.println("add the data inside the array list :");
        al.add(3,4);
        System.out.println(al);

        //get the data from the arraylist
        System.out.println("get the data from the array list:");
        Integer n = al.get(2);
        System.out.println(n);

        //get the size of the array list using size() function
        System.out.println("get the size of the array list using the size() function ");
        int size = al.size();
        System.out.println(size);

        //remove the index number
        System.out.println("remove the index number : ");
        int removeIndex = al.remove(2);
        System.out.println(+removeIndex);


    }
}
