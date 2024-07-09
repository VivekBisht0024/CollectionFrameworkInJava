import java.util.ArrayList;

import java.util.Iterator;
/**
 * LearnArrayList
 */


 //ArrayList is like normal arrays and is a dynamic array whos size can be changes dynamically


public class LearnArrayList {

    public static void main(String[] args) {
        
        ArrayList<String>StudentName = new ArrayList<>();
        StudentName.add("Vivek");
        StudentName.add("Anuj");
        StudentName.add("Mayur");
        StudentName.add("Tejas");
        System.out.println(StudentName);

        // Size of n array --> n + n/2 + 1

        ArrayList<Integer>arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(1,100);
        System.out.println(arr);


        ArrayList<Integer>arr2 = new ArrayList<>();
        arr2.add(200);
        arr2.add(300);
        arr.addAll(arr2);
        System.out.println(arr);


        //get element -- gives the element of the given index

        System.out.println(arr.get(3));

        // removing elements from the arraylist

        arr2.remove(1);
        System.out.println(arr2);


        arr2.remove(Integer.valueOf(100));
        System.out.println(arr2);
        

        // Time complexity - O(N) - insert - remove - ad



        //set function

        arr2.set(0,1000);
        System.out.println(arr2);

        
        System.out.println(arr2.contains(1000));


        // Iterating in the list

        // for loop 
        for(int i = 0 ; i < arr.size() ; i++){
            System.out.println(arr.get(i));
        }
        //for each loop
        for(int it : arr){
            System.out.println(it + " ");
        }

        //Using Iterator
        Iterator<Integer> it = arr.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}