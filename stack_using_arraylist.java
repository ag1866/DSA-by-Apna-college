// ye code online java compiler pe run krrha h
import java.util.*;
public class stack_using_arraylist {
     static class Stack{

        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        // push operation ----> isme bs element add krte jaenge
        public static void push(int data){
            list.add(data);
        }

        // pop ----> isme arraylist ka last wala element delete krenge
        public static int pop(){
            int top = list.get(list.size()-1); // phle apn ne top ka element nikal liya
// -1 index ki wajah se liya h phir usi last wale ko remove krke return kradiya
            list.remove(list.size()-1);
            return top;
        }
        // peek operation
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }


    }
    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}
