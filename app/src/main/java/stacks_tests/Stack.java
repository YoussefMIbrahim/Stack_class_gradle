package stacks_tests;

import java.lang.reflect.Array;

public class Stack<E> {
    
    private final int DEFAULT = 20;
    private E[] array;
    //Top is used to keep track of the top element of the array.
    //credit: https://www.geeksforgeeks.org/how-to-implement-stack-in-java-using-array-and-generics/
    private int top;


    //default constructor
    //credit https://stackoverflow.com/questions/529085/how-can-i-create-a-generic-array-in-java
    public Stack(Class<E> clazz){

        this.array = (E[]) Array.newInstance(clazz, DEFAULT);
        this.top = -1;
    }
    //constructor with a specific size
    public Stack(Class<E> clazz, int capacity){


        this.array = (E[]) Array.newInstance(clazz, capacity);
        this.top = -1;
  
        
    }

    public void push(E i){

        if(top == array.length -1 ){
            //throw exception
        }

        top = top + 1 ;

        array[top] = i;
    
    }

    public E pop(){

        if(top == -1){
            //exceptoion stack is empty
        }

        E item = array[top];
        array[top] = null;

        top = top - 1 ;

        return item;

    }

    public E peek(){

        if(top == -1){
            //exceptoion stack is empty
        }

  
        return array[top];
    }

    public boolean empty(){
        return top ==-1;
    }


}
