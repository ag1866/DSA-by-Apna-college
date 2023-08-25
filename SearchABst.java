public class SearchABst {
    static class Node{ // sbse phle apn ne node bnaya jisme data h aur node
        // left m bhi jai h aur right m bhi 
        int data;
        Node left;
        Node right;

        Node(int data){ // yha apn ne node ka constructor define krdiya
            this.data = data;
        }
    }

    public static Node insert(Node root, int val){ // yha apn ne node m value insert krna 
// start krdiya 
        if(root == null){ // agr node null h to wha new node bana denge aur root
// node ko return krdenge
            root = new Node(val);
            return root;

        }

        if(root.data > val){ //agr key value root node se choti h to left subtree bnega
            // left subtree
            root.left = insert(root.left, val);

        }
        else{
            root.right = insert(root.right, val); 
        }
        return root;
    }

    public static void inorder(Node root){ // to verify ki tree hmara shi build hua h
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    // TO SERACH A KEY VALUE IN A BINARY SEARCH TREE
    public static boolean search(Node root, int key){
        if(root == null){ // agr root value null h to phir to wo kuch false hi return krega
            return false;
        }
        if(root.data > key){ // agr root value bdi h key se left m bhejo searc ke liye
            return search(root.left, key);
        }

        else if(root.data == key){ // agr equal hogyi to match krjaegi true return krdega
            return true;
        }
        else{
            return search(root.right, key);
        }
        
    }
    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for(int i=0; i<values.length; i++){ //ye har ek value ko print krne ke liye
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();

        if(search(root, 1)){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }

    }
}

