import java.util. *;
// ye code online java compiler pe run krrha h
public class Stack_using_linkedlist {
    static class Node {
        int data;
        Node next;
        public Node(int data){ // constructor
            this.data = data;
            next = null;

        }

    }
    static class Stack{
        public static Node head; // ye list aur stack ka head h
        public static boolean isEmpty(){ //ye apn ne ye check krne ke liye likha h
// ki stack y linked list empty h y nhi
            return head == null;
        }
// push function ---> inserting an element in a stack
        public static void push(int data){
            Node newNode = new Node(data); // ye apn ne new Node craee krli
            if(isEmpty()) {
                head = newNode;
// agr apna stack empty h to jo apn ne new node dali h use hi head bnadenge
                return;
            }
            newNode.next = head; // aur agr empty nhi to new node ko head bnana pdega
            head = newNode;
        }

// pop function ---> means deleting top element
        public static int pop(){
// aur agr stack empty hua to -1 return krdenge iska mtlb hota ki usme kuch nhi h
            if(isEmpty()){
                return -1;
            }
// iska mtlb ye ki upr wale element ko pop kra to agle element ko head bnadenge
            int top = head.data;
            head = head.next;
            return top;
    

        }
// peek function
        public static int peek(){
            if(isEmpty()){
                return -1;
                
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()) { // isme ye h ki jab k stack khali na hojae tab tk peek krenge 
// aur jinhe jinhe peek krenge unhe turant  remove krte jaenge
            System.out.println(s.peek());
            s.pop();
        }
    }
}
