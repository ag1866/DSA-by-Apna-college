public class linked_list {
    Node head;
// size of linked list
    private int size;
    linked_list(){
        this.size = 0;
    }
    class Node{
// yha apn ek node bnaenge jisme ek data ka section hoga aur dusra next ka
// jo next node ko indicate krrha hoga
        String data;
        Node next;

        Node(String data){ //constructor bnadiya
            this.data = data;
            this.next = null;
            size++;
// apn ne node ek constructor bnadiya jisme apn ne data string m store kradiya
// node m ek data store kradiya next , null store kradiya 
        }
    }
// add first position pe krne ke liye phle ek node bnaenge phir uske next ko 
// head ki taraf jo purana head tha uski taraf link kradenge to new head create 
// add - first position, last position
    public void addFirst(String data){
// sbse phle apn check krenge ki koi linked list exist bhi krt y nhi
        Node newNode = new Node(data); //ye node bnadi h
// ab yha neeche apni linked list exist nhi krrhi h to jo new node h whi head bnegi
        if(head == null) {
            head = newNode;
            return;
        }
// yha new node ko head bnaenge kyuki linked list exist krrhi h
        newNode.next = head; // yha apn ne jo new Node bni h uske next ko head ki taraf point kradiya to wo link hogyi
        head = newNode;

     
        
    }
// add last position
// last position pe add krne ke liye us puri list ko traverse(travel) krenge aur jha list 
// khatam hogi usi ke last ko link kradenge new node se last m to last m new node
// add hojaegi 
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
// agr apn ne head ko change krdiya kisi case m to age ane wale sabhi cases m hm main apne 
// se connection kho denge isliye apn ne currNode liya h naki head 
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // print 
    public void printList(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
// delete at first position
// agr first position pe delete krna h to simple h first ke next wale ko head bnadenge
// first apne ap delete hojaega
    public void deleteFirst(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }
// delete last
// agr last m delete krna h to second last ke next ko null bnadenge to last wala apne ap
// delete hojaega
    public void deleteLast(){
        if(head == null || head.next == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        // if(head.next == null){
        //     head = null;
        //     return;
        // }
// ab agr last m delete krna h to puri list ko traverse y travel krna pdega

        Node secondLast = head; // ye puri list traverse krne ke liye apn ne second
// last ko head bnaya aur last m delete krne ke liye secondlast ke next ko null bnadenge
// to last m apne ap delete hojaega
        Node lastNode = head.next; //head.next = null -> lastnode = null
        while(lastNode.next != null){ // jab tk traverse krenge jab tk last node la next
// null na hojae
            lastNode = lastNode.next; // indono m apn traverse krte rhenge jab tk ye dono condition
            // satisfy na krjae
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getsize(){
        return size;
    }





    public static void main(String[] args) {
        linked_list l1 = new linked_list();
        l1.addFirst("a");
        l1.addFirst("is");
        l1.printList();

        l1.addLast("list");
        l1.printList();

        l1.addFirst("this");
        l1.printList();

        l1.deleteFirst();
        l1.printList();
        
        l1.deleteLast();
        l1.printList();

        // l1.getsize();
        // l1.printList();
        System.out.println(l1.getsize());
        l1.addFirst("This");
        System.out.println(l1.getsize()); 

    }
}
