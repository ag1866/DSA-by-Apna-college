public class queue_using_linkedlist {
    static class Node { // sbse phle apn linked list ki node bnalenge
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }
    static class Queue {
        static Node head = null;
        static Node tail = null;
    
        }

        public static boolean isEmpty(){ 
            return head == null && tail == null;

        }

        

        // add function(Enqueue)
        public static void add(int data){
            
            Node newNode = new Node(data);
            //Node newNode = new Node(data);
            if(isEmpty()) {
                tail = head = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }

        }

        // dequeue
        public static int remove(){
            if(isEmpty()){ //yha apn phle ye check krenge ki khi wo queue full to nhi h agr 
                // queue full h to full queue return krdenge
                System.out.println("empty queue");
                return -1; // yha bhi -1 yhi represent krrha h ki ye queue
                // empty h
            }

            int front = head.data;
           //single node
            if(head == tail) {
                tail = null;
            }
            head = head.next;
            return front;


            
        
        }

        // peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }

            return head.data;
        }

    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        

        // 1 2 3 ...........
        while(!q.isEmpty()){ // isme ye h ki jab k stack khali na hojae tab tk peek krenge 
            // aur jinhe jinhe peek krenge unhe turant  remove krte jaenge
            System.out.println(q.peek());
            q.remove();
        }
        // System.out.println(q.remove());
        // System.out.println(q.peek());

    }
}
