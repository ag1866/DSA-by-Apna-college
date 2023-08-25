// Q.  find the total no. of nodes in given question
// here we are building a binary tree
public class binarytree_Problem1 {
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
    public static int countOfNodes(Node root){
        if(root == null){ // agr root node m kuch h nhi to 0 return krdenge
            return 0;
        }
        int leftNodes = countOfNodes(root.left); // sbse phle apn ne left subtree ki node ko count krliya
        int rightNodes = countOfNodes(root.right); //phir apn ne right subtree ki node ko count krliya

        return leftNodes + rightNodes + 1; // aur last m lejake add krdia
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        System.out.println(countOfNodes(root));
    }
}
