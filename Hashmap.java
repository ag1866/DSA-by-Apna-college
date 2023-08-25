import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        // creating a hashmap
        // country(key), population(value)
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion ----> means we inserting key and value pairs
        map.put("India", 135);
        map.put("US", 30);
        map.put("China", 150);

        System.out.println(map);
        
        map.put("China", 180); // It will update the value
        System.out.println(map);

        // search operation ---> means the value or key for we are searching exist or not

        if(map.containsKey("China")){
            System.out.println("Key is present in the map");
        } else {
            System.out.println("Key is not present in the map");
        }
// neeche jo do line likhi h wo apn ne ye check krne ke liye likhi h
// ki key ki value exist krti h y nhi 
        System.out.println(map.get("China")); //key exist
        System.out.println(map.get("Indonesia")); // key doesn't exist

        // iterate or traverse
        // int arr[] = {12, 15, 18};
        // for (int i=0; i<3; i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();

        // for(int val : arr){
        //     System.out.print(val + " ");
        // }
        // System.out.println();
        
        // iteration(1) or traverse
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        // iteration(2)
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " " + map.get(key));
        }
// isme phle key ki value print kralenge phir map.get(key) se uske coreesponding 
// integer value print kralenge

        // remove
        map.remove("China");
        System.out.println(map);
    }
}
