import java.util.ArrayList;
import java.util.Collections;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // aise hi har type ke liye define krni hoti h arraylist
        // ArrayList<String> list2 = new ArrayList<String>();
        // ArrayList<Boolean> list3 = new ArrayList<Boolean>();
        // add element
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        // to get element
        int element = list.get(0);
        System.out.println(element);
        // add element in between
        list.add(1,2);
        System.out.println(list);
        // set element mtlb value change krni h
        list.set(0,0);
        System.out.println(list);
        // delete element
        list.remove(0); //0 is the index
        System.out.println(list);
        // size of list
        int size = list.size();
        System.out.println(size);
        // loops on list
        for(int i=0; i<list.size(); i++) {
           
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        // sorting 
        Collections.sort(list);
        System.out.println(list);
// sorting ke liye arraylist m collection nam ka function ata h jise import krna hota h
// import java.util.Collections


 


        
    }
}
