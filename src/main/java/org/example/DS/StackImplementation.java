package org.example.DS;

class Stack{
    int arr [] = new int[10];
    int top;
    int size;
    public Stack(){
        this.top = -1;
        this.size = arr.length;
    }
    public void push(int data){
        top++;
        if(top<size){
            arr[top] = data;
        } else {
            System.out.println("StackOverFlow");
            top--;
        }
    }
    public int pop(){
        if(top>-1)
            return arr[top--];
        else
            System.out.println("StackUnderFlow");
        return 0;
    }
    public int peak(){
        return arr[top];
    }
    public void printStack(){
        for(int val : arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }
}
public class StackImplementation {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);
        st.push(80);
        st.push(90);
        st.push(100);
        st.push(101);
        st.printStack();

        st.pop();
        System.out.println(st.peak());
    }
}
