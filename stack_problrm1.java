// push at the bottom of stack
// hme 4 ko push krna h bottom m aur 1 2 3 uske andar derkhe h to phle 1 2 3 ko pop krenge
// phir 4 ko push krke dobara1 2 3 ko push krenge
import java.util.*;
public class stack_problrm1 {
    public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){ // yha check kiya h ki jaise hi empty ho turant push krna start krdo
            s.push(data);
            return;
        }
        int top = s.pop(); // yha se apn ne remove krna start kra
        pushAtBottom(data, s); // phir data pass krna start kra
        s.push(top); // aur phir dobara elements ko push krna start kra

    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
       
        pushAtBottom(4, s);
        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
