public class DeleteANodeinBst {
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
// Delete a Node in Bst 
// it has three cases we will do case by case
// case 1 we will delete leaf node
    public static Node delete(Node root, int val){
        if(root.data > val){ // agr value root node se choti h to left m jaenge
            root.left = delete(root.left, val);
        }
        else if(root.data < val){ // agr value root node se bdi h to left m jaenge
            root.right = delete(root.right, val);
        }
// yha tk hmne delete function m bs search kra ki jis node ko delete krna h 
// wo kis side h ab pta chl gya 
// ab neeche se jo node mili h use delete krna start krenge

        else { // root.data == val
            // case 1 ye apna wo h jiska koi child nhi h use delete krna h
            if(root.left == null && root.right == null){
                return null;
            }

            // case 2 ye apna wo case h jiska kewal ek child h ab check krenge ki child left m h right m
            if(root.left == null){ // agr left child null h to right ko return krdenge
                return root.right;
            }
            else if(root.right == null){ // agr right child null h to left ko return krdenge
                return root.left;
            }

            // case 3
// ab isme do child the to delete krne ke liye apn sbse phle inorder successor dundenge
// inorder successor is leftmost in right subtree
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data; // yha root ka jo data tha uski jagah inorder successor ka data update dedenge
            root.right = delete(root.right, IS.data); // phir yha apn
// root ke right m inorder succesoor ko delete krdenge

        }
        return root; // aur finally last m root ke right m inorder successor ko delte 
// krne ke bad root  ko return krdenge
    }
    public static Node inorderSuccessor(Node root){
        while(root.left != null){ // ye loop chlake apn root ka left nikal rhe h
            root = root.left;
        }

        return root;
    }

    
    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for(int i=0; i<values.length; i++){ //ye har ek value ko print krne ke liye
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        

        // delete(root, 4); // to delete leaf node
        // inorder(root);

        // delete(root, 10); // to delete node that has one child
        // inorder(root);

        delete(root, 5); // to delete node that has two child
        inorder(root);

    }
}

