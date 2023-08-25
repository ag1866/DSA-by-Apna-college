// Q1 = root to leaf path mtlb hmare jitne bhi path root se start hoke 
// leaf tk jate h unhe print krana h
// we will use arryalist in this problem
import java.util.*;
public class BST_problem_1 {
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


// TO solve problem 1 

    public static void printPath(ArrayList<Integer> path){
        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }

    public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);

        // leaf
        if(root.left == null && root.right == null){
            printPath(path);
        }else { //non leaf nodes
            printRoot2Leaf(root.left, path);
            printRoot2Leaf(root.right, path);
        }
        
        path.remove(path.size()-1);


    }
    
    public static void main(String[] args) {
        int values[] = {8, 5, 3, 6, 10, 11, 14};
        Node root = null;

        for(int i=0; i<values.length; i++){ //ye har ek value ko print krne ke liye
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();

        printRoot2Leaf(root, new ArrayList<>());
    }
}
