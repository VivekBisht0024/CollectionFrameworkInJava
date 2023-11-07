import java.util.ArrayList;

public class FindMaxInArrayList {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(100);
        list.add(2);
        list.add(800);
        list.add(500);

        System.out.println(list);


        // to getMax element from the ArrayList
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i < list.size() ; i++){
            // if(max < list.get(i)){
            //     max = list.get(i);
            // }
            max = Math.max(max,list.get(i));
        }
        System.out.println("Max element = " + max);
        
    }
}
