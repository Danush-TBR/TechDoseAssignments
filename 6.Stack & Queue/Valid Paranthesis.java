class Solution {
    public boolean isValid(String s) {
        Stack<Character> myStack = new Stack<Character>();
        int len=s.length();
        for(int i=0;i<len;i++){
            char ch=s.charAt(i);
            if(ch=='(' ||  ch=='[' ||  ch=='{') myStack.push(ch);
            else{
                if(myStack.empty()) return false;
                else{
                    char ch2=myStack.peek();
                    if((ch==')' && ch2=='(') || (ch=='}' && ch2=='{') || (ch==']' && ch2=='[')) myStack.pop();
                    else return false;
                }
            }
        }
        if(myStack.empty()) return true;
        else return false;
    }
}
