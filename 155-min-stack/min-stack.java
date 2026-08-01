class MinStack {

    Stack<Integer> s1;
    Stack<Integer> minStack;
    
    public MinStack() {
        s1 = new Stack<>();       
        minStack = new Stack<>(); 
    }
    
    public void push(int value) {
        s1.push(value);
        if(minStack.isEmpty()){
            minStack.push(value);
        }
        else{
            minStack.push(Math.min(value,minStack.peek()));
        }
    }
    
    public void pop() {
        s1.pop();
        minStack.pop();
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */