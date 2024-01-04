package com.company.stack;

import java.util.ArrayList;

public class StackUsingArrayList {

    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();  //yha object Static nahi hai obj ka variable static hai.
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        public static void push(int data){
            list.add(data);
        }

        public static int pop(){
            if (isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1); // pop krne k liye ham list ka last index nikalenge bcoz wahi top element hai.
            list.remove(list.size()-1);
            return top;
        }

        public static int peek(){
            if (isEmpty()){
                return -1;
            }
            return list.get(list.size()-1); //return last value as peek
        }
    }



    public static void main(String[] args) {
        StackUsingLinkedList.Stack s = new StackUsingLinkedList.Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}
