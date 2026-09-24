package LeetCode;
    class MinStack {
    Stack <Integer> stack;
    Stack <Integer> minStack;
    public MinStack() {
        stack=new Stack<>();
        minStack=new Stack<>();
    }
    
    public void push(int value) {
        stack.push(value);
        if(minStack.isEmpty() || value<=minStack.peek()){
            minStack.push(value);
        }
    }
    
    public void pop() {
        int a=stack.pop();
        if(minStack.peek().equals(a)){
            minStack.pop();
        }
    }
    
    public int top() {
        if (stack.isEmpty()) {
        return -1;
    }
    return stack.peek();
    }
    
    public int getMin() {
    if (minStack.isEmpty()) {
        return -1;
    }
    return minStack.peek();
    }
}
