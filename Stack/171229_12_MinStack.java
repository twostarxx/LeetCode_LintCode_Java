/**
12. 带最小值操作的栈 
实现一个带有取最小值min方法的栈，min方法将返回当前栈中的最小值。

你实现的栈将支持push，pop 和 min 操作，所有操作要求都在O(1)时间内完成。

 注意事项
如果堆栈中没有数字则不能进行min方法的调用

样例
如下操作：push(1)，pop()，push(2)，push(3)，min()， push(1)，min() 返回 1，2，1
*/

public class MinStack {
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> s = new Stack<Integer>();
    public MinStack() {
        // do intialization if necessary
    }

    /*
     * @param number: An integer
     * @return: nothing
     */
    public void push(int number) {
        // write your code here
        stack.push(number);
        if (s.empty())
            s.push(number);
        else
            s.push(number<s.peek() ? number : s.peek());
    }

    /*
     * @return: An integer
     */
    public int pop() {
        // write your code here
        s.pop();
        return stack.pop();
    }

    /*
     * @return: An integer
     */
    public int min() {
        // write your code here
        return s.peek();
    }
}