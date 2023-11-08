import java.util.*;

public class ArrayListNInputs {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        //array of n size
        int n = sc.nextInt();


        // taking user input
        for(int i = 0 ; i < n ; i++){
            list.add(sc.nextInt());
        }

        //output user input

        System.out.println(list);

        // after completion close it
        sc.close();
    }
}