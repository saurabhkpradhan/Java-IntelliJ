package DS;
import java.util.*;
public class StackMain {
    public static void main(String[] args) {
        System.out.println("************* Stack *************");
         Stack stack = new Stack(50);
         stack.push(10);
         stack.push(20);
         stack.push(30);
         stack.push(40);
         stack.push(50);
        while (!stack.isEmpty()) {
            long value = stack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");

    }
}
