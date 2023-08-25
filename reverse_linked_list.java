public class reverse_linked_list {
    Node head;
// size of linked list
    private int size;
    reverse_linked_list(){
        this.size = 0;
    }
    class Node{
// yha apn ek node bnaenge jisme ek data ka section hoga aur dusra next ka
// jo next node ko indicate krrha hoga
        Integer data;
        Node next;

        Node(Integer data){
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
    public void addFirst(Integer data){
// sbse phle apn check krenge ki koi linked list exist bhi krt y nhi
        Node newNode = new Node(data); //ye node bnadi h
// ab yha neeche apni linked list exist nhi krrhi h to jo new node h whi head bnegi
        if(head == null) {
            head = newNode;
            return;
        }
// yha new node ko head bnaenge kyuki linked list exist krrhi h
        newNode.next = head;
        head = newNode;

     
        
    }
// add last position
// last position pe add krne ke liye us puri list ko traverse(travel) krenge aur jha list 
// khatam hogi usi ke last ko link kradenge new node se last m to last m new node
// add hojaegi 
    public void addLast(Integer data){
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
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
// ab agr last m delete krna h to puri list ko traverse y travel krna pdega

        Node secondLast = head;
        Node lastNode = head.next; //head.next = null -> lastnode = null
        while(lastNode.next != null){ // 
            lastNode = lastNode.next; //
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getsize(){
        return size;
    }
// reverse linked list by iteartive form
    public void reverseIterate(){

        if(head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
// apn ne currNode ke next wali ke liye loop isliye use kiya kyuki apn last tk jaenge 
// aur last tk phuchte hi use prev node m store karadenge
        while(currNode  != null){ //currNode ko null tk legye
            Node nextNode = currNode.next; //aur phir yha apn ne nextNode ko define kra aur phir use prevNode m store kradiya
            currNode.next = prevNode;

            // update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null; //agr reverse krte krte hm last tk phuch gye 
// to phir next wala node to hoga nhi null hoga aur null se previous wala head bnjaega
        head = prevNode;
    }


// reverse linked list by recursive form
public Node reverseRecursive(Node head){

    if(head == null || head.next == null){
        return head;
    }
    Node newHead = reverseRecursive(head.next);
    head.next.next = head;
    head.next = null;

    return newHead;

}





    public static void main(String[] args) {
        reverse_linked_list l1 = new reverse_linked_list();
        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(4);
        l1.printList();

        // l1.reverseIterate();
        // l1.printList();

        l1.head = l1.reverseRecursive(l1.head);
        l1.printList();

        






        // System.out.println(l1.getsize());
        // l1.addFirst("5");
        // System.out.println(l1.getsize());
    }
}