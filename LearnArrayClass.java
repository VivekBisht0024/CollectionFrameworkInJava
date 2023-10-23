import java.util.Arrays;

public class LearnArrayClass {

    public static void main(String[] args) {
        
        int [] arr = {1,2,3,4,5,6,7,8};
        int index = Arrays.binarySearch(arr,4);

        System.out.println(index);

        int [] arr2 = {8,6,8,9,0,6,4,2,1};
        Arrays.sort(arr2);
        for(int i : arr2){
            System.out.println(i);
        }

        Arrays.fill(arr2,12);
        for(int i : arr2){
            System.out.println(i);
        }
    }
    
}
