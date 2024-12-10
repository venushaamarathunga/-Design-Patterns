package algo;

public class Stack {
    int[] stack = new int[7];
    int top= 0;
    public void push(int data){
        stack[top] = data;
        top++;
    }

    public int pop(){
        int data;
        top--;
        data = stack[top];
        stack[top] = 0;
        return data;
    }

    public int peek(){
        int data;
        data = stack[top-1];
        return data;
    }
    
    public void show(){
        for (int i: stack) {
            System.out.print(i + " ");
        }
    }
}
