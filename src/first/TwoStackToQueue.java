package first;

import java.util.Stack;

/**
 * 两个栈实现一个队列
 */
public class TwoStackToQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void addStack(int temp) {
        stack1.push(temp);
    }

    public int popStack() {
        if (stack2.size() <= 0) {
            while (stack1.size() > 0) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.size() <= 0) {
            throw new RuntimeException("stack2 is null");
        }
       return stack2.pop();
    }

    public static void main(String[] args) {
        TwoStackToQueue twoStackToQueue = new TwoStackToQueue();
        twoStackToQueue.addStack(1);
        twoStackToQueue.addStack(2);
        twoStackToQueue.addStack(3);

        int i = twoStackToQueue.popStack();
        System.out.println(i);
    }
}
