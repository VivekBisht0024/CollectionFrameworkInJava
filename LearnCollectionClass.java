import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnCollectionClass{
    public static void main(String[] args) {
         
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(6);
        l.add(10);
        System.out.println(Collections.min(l));
    }
}