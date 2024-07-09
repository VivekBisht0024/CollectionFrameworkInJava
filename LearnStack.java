// Stack - Last In First Out - like plates / books

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String>Animals = new Stack<>();
        Animals.push("Lion");
        Animals.push("Dog");
        Animals.push("Horse");
        Animals.push("Cat");
        System.out.println(Animals);
        System.out.println(Animals.peek());
        Animals.pop();
        System.out.println(Animals.peek());

    }
    
}
