class MyQueue {
    Stack <Integer> Q1=new Stack<Integer>();
    Stack <Integer> Q2=new Stack<Integer>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        Q1.push(x);
    }
    
    public int pop() {
        if(Q2.empty()==false) return Q2.pop();
        else{
            while(!Q1.empty()) Q2.push(Q1.pop());
            return Q2.pop();
        }
    }
    
    public int peek() {
        if(Q2.empty()==false) return Q2.peek();
        else{
            while(!Q1.empty()) Q2.push(Q1.pop());
            return Q2.peek();
        }
    }
    
    public boolean empty() {
        return Q1.empty() && Q2.empty();
    }
}
