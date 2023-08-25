public class circular_queue_using_array {
    static class Queue {
        static int arr[]; // yha array define krdia
        static int size; // yha size define krdia
        static int rear = -1; //-1 isliye define kiya kyuki -1 mtlb apn usse pura empty assume krrhe h
        static int front = -1;//-1 isliye define kiya kyuki -1 mtlb apn usse pura empty assume krrhe h

        Queue(int n) { //  ye apn ne queue ka constructor define krdia
            arr = new int[n];
            this.size = n;
            
        }

        public static boolean isEmpty(){ // yha apn ye check krenge ki khi wo array empty to nhi
            return rear == -1 && front == -1; //-1 isliye define kiya kyuki -1 mtlb apn usse 
            //pura empty assume krrhe h
        }

        public static boolean isFull(){
            return (rear+1) % size == front;
// ye condition h hmare queue ke full hone ki
        }

        // add function(Enqueue)
        public static void add(int data){
            if(isFull()){ //yha apn phle ye check krenge ki khi wo queue full to nhi h agr 
                // queue full h to full queue return krdenge
                System.out.println("full queue");
                return;
            }
            // 1st element add
            if(front == -1){
                front = 0; // yha agr front pe element add krenge to usme front ko
// zero index pe leaenge
            }
            
            rear = (rear + 1) % size; // yha agr full nhi h to add krdenge
            arr[rear] = data;
        }

        // dequeue
        public static int remove(){
            if(isEmpty()){ //yha apn phle ye check krenge ki khi wo queue full to nhi h agr 
                // queue full h to full queue return krdenge
                System.out.println("empty queue");
                return -1; // yha bhi -1 yhi represent krrha h ki ye queue
                // empty h
            }

            int result = arr[front]; 
// agr kewal single element present h array m to
            if(rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        
        }

        // peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }

            return arr[front];
        }

    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);

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
