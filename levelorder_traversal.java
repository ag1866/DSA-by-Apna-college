import java.util.*;
public class levelorder_traversal {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){ // constructor
            this.data = data;
            this.left = null; // left child starting m null h
            this.right = null; // right child starting m null h
        }


    }
    static class BinaryTree{
        static int idx = -1; // -1 isliye taki hm traverse krskte puri list m har ek pe
// -1 likhenge to wo 0 se start krega aur har bar increment krke hm last tk lejaenge
        public static Node buildTree(int nodes[]){ // ye function hmara har ek node ko lenge 
// root node ko return krdega
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes); // left tree build krne ke liye
            newNode.right = buildTree(nodes); // right tree build krne ke liye

            return newNode;
        }
    }
    public static void levelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>(); // sbse phle apn ne queue bnayi isme hm apne tree ki nodes ko store krenge
        q.add(root); // usme root node ko add kiya 
        q.add(null); // phir null ko add kiya

        while(!q.isEmpty()){ // loop chlaya jab tk queue empty na hojae
            Node currNode = q.remove(); // yha se currnode ko nikal liya
            if(currNode == null){ // agr currnode empty h to next line 
                System.out.println();
                if(q.isEmpty()){ // agr last node nullnode thi to phir loop hi khatam hojaega
                    break;
                }else{
                    q.add(null); // aisa nhi h to next line ke liye null ko add krenge 
// taki null dobara phuche aur new next line printho
                }
            } else{ // aur agr null node nhi thi to uske data ko print kraenge
//  aur phir left child ko aur right child ko
                System.out.print(currNode.data+" ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        levelOrder(root);
    } 
}
