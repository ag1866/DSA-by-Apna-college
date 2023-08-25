// Q. Find the height of tree

public class binarytree_problem3 {
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
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left); // phle left subtree ki height nikalenge
        int rightHeight = height(root.right);// phir right subtree ki height nikalenge

        int myHeight = Math.max(leftHeight, rightHeight) + 1; // phir jiski height max hogi usme 1 add krdenge to apni height of tree ajaegi
        return myHeight;
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        System.out.println(height(root));
    }
}
