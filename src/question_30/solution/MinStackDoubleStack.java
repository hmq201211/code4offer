package question_30.solution;

import java.util.Stack;

public class MinStackDoubleStack {
    Stack<Integer> base;
    Stack<Integer> augment;

    /**
     * initialize your data structure here.
     */
    public MinStackDoubleStack() {
        base = new Stack<>();
        augment = new Stack<>();

    }

    public void push(int x) {
        base.add(x);
        if (augment.size() == 0) {
            augment.add(x);
        } else {
            if (x <= augment.peek()) {
                augment.add(x);
            }
        }

    }

    public void pop() {
        if (base.pop().equals(augment.peek())) {
            augment.pop();
        }
    }

    public int top() {
        return base.peek();
    }

    public int min() {
        return augment.peek();
    }
}