import java.util.HashSet;
import java.util.Iterator;
public class Hashset {
    public static void main(String[] args) {
        // creating a Hashset
        HashSet<Integer> set = new HashSet<>();

        // Add
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1); // it doesnot dd same element in the set
        System.out.println(set);

        // size
        System.out.println("size of set is : " + set.size());

        // search
        if(set.contains(1)){
            System.out.println("present"); // ye present tabhi print krega jab set m koi element hoga 
            // wrna kuch print nhi krega
        }

        if(!set.contains(6)){
            System.out.println("absent");
        }

        // Delete
        set.remove(1); // yha remove krdiya
        // ab neeche verify krenge
        if(!set.contains(1)){
            System.out.println("does not contains 1");
        }

        // print all elements
        System.out.println(set);

        // iterator
        Iterator it = set.iterator();
        // iterator has two function---> has next function or has function
// it.next har bar next value ko return krega or 
// it.hasnext ye pta krega ki is value ke age agli value h y nhi or ye true y false retunr krta h
        while(it.hasNext()){
            System.out.println(it.next() + ", ");
        }
    // isEmpty
        if(!set.isEmpty()){
            System.out.println("set is not empty");
        }


    }
}
