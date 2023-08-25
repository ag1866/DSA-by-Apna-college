// here we are doing homework problems on linkedlist
// Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3).
//  Search for the number 7 & display its index
import java.util.*;
public class linked_list3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(8);
        list.addFirst(3);
        list.addFirst(7);
        list.addFirst(5);
        list.addFirst(1);
        System.out.println(list);
        System.out.println(list.get(2));
// now finding the number 7 and looking for its index
        for(int i=0;i<list.size();i++){
            if(list.get(i) == 7){
                System.out.println(i);
            }
        }

    }
}
