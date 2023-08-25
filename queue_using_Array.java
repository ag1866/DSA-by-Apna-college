// ye code online java compiler pe run krrha h
public class queue_using_Array {
    static class Queue {
        static int arr[]; // yha array define krdia
        static int size; // yha size define krdia
        static int rear = -1; //-1 isliye define kiya kyuki -1 mtlb apn usse pura empty assume krrhe h

        Queue(int n) { //  ye apn ne queue ka constructor define krdia
            arr = new int[size];
            
        }

        public static boolean isEmpty(){ // yha apn ye check krenge ki khi wo array empty to nhi
            return rear == -1; //-1 isliye define kiya kyuki -1 mtlb apn usse 
            //pura empty assume krrhe h
        }

        // add function(Enqueue)
        public static void add(int data){
            if(rear == size-1){ //yha apn phle ye check krenge ki khi wo queue full to nhi h agr 
                // queue full h to full queue return krdenge
                System.out.println("full queue");
                return;
            }
            
            rear++; // yha agr full nhi h to peeche add krdenge
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

            int front = arr[0]; // remove krne ke liye hme zeroth index ko access
// krna hota aur apn ne whi kiya
            for(int i=0; i<rear; i++){
                arr[i] = arr[i+1];
            }
// ab apn ne zeroth index ko access krke remove krdiya to ab peeche ke sare elements age laenge ek 
// ek se loop ki help se
            rear--;
            return front;
        }

        // peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }

            return arr[0];
        }

    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
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
