package question_30.solution;

import java.util.Stack;

public class MinStackSingleStack {
    Stack<Integer> base;
    Integer min = Integer.MAX_VALUE;

    /**
     * initialize your data structure here.
     */
    public MinStackSingleStack() {
        base = new Stack<>();
    }

    public void push(int x) {
        if (x <=min){
            base.push(min);
            base.push(x);
            min = x;
        }else {
            base.push(x);
        }
    }

    public void pop() {
        if (base.pop().equals(min)){
            min = base.pop();
        }
    }

    public int top() {
        return base.peek();
    }

    public int min() {
        return min;
    }
}
