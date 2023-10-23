import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        //last in first out

        Stack<String> animals = new Stack<>();

        animals.push("Lion");
        animals.push("dog");
        animals.push("cat");
        animals.push("Horse");

        System.out.println(animals);


        // peek() - the element on the top

        System.out.println(animals.peek());

        // pop to remove/delete the element
        System.out.println(animals.pop());
        

    }
}
