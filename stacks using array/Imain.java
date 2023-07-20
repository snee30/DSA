import java.util.*;

class Stack{

    int top=-1;
    int max=10;
    int[] stack=new int[max];



    void push(int el){
        if(top==(max-1))
            System.out.println("stack overflow");

        else{
            top++;
            stack[top]=el;

        }
    }

    void pop(){
        if(top==-1)
            System.out.println("empty stack");
        else{
            System.out.println("top item is revomed");
            top--;
        }
    }

    void search(int key){

        for(int i=top;i>-1;i--){
            if(key==stack[i]){
                System.out.println("found at position : "+(i+1));
                break;
            }
        }
    }
    void display(){
        for(int i=top;i>-1;i--){
            System.out.println(stack[i]);
        }
    }

}

class Imain{
    public static void main(String[] args){
        Stack s=new Stack();
        s.push(2);
        s.push(3);
        s.push(5);
        s.display();
        System.out.println();
        s.pop();
        s.display();
         System.out.println();
        s.search(2);
        s.display();
         System.out.println();
    }

}
