import java.util.ArrayList;

public class Stack {
    private ArrayList<Integer> stackArray;

    public Stack() {
        stackArray = new ArrayList<>();
    }

    public void push(int value) {
        stackArray.add(value);
        System.out.println("Pushed: " + value);
    }

    public int pop() {
        if (!isEmpty()) {
            int poppedValue = stackArray.remove(stackArray.size() - 1);
            System.out.println("Extracted: " + poppedValue);
            return poppedValue;
        } else {
            System.out.println("Stack is empty.");
            return -1;
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return stackArray.get(stackArray.size() - 1);
        } else {
            System.out.println("Stack is empty.");
            return -1;
        }
    }

    public boolean isEmpty() {
        return stackArray.isEmpty();
    }
}
