class MyStack {
    Queue<Integer> myQueue = new LinkedList<Integer>();
    int size=0;
    public MyStack() {
        
    }
    
    public void push(int x) {
        size++;
        myQueue.add(x);
        for(int i=0;i<size-1;i++) myQueue.add(myQueue.remove());
    }
    
    public int pop() {
        size--;
        return myQueue.remove();
    }
    
    public int top() {
        return myQueue.peek();
    }
    
    public boolean empty() {
        return size==0;
    }
}
