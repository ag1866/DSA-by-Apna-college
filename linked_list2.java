// we are creating and performing operations on linked list by using java 
// collection framework
import java.util.*;
public class linked_list2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
// add at first and last position
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        list.addFirst("this");
        list.addLast("List");
        System.out.println(list);
// size of linked list
        System.out.println(list.size());
// size od linked list using for loop
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("null");
// remove at first and last position
        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

// or we can also remove by passing the index
        list.remove(2);
        System.out.println(list);
    }
}
