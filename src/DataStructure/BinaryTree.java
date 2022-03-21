package DataStructure;

public class BinaryTree {
    Node root;

    public void add(int data){
        root = addRecursive(root, data);
    }

    private Node addRecursive(Node current, int data){
        if(current == null){
            current = new Node(data);
        }

        if(data < current.data){
            current.leftNode = addRecursive(current.leftNode, data);
        }else if(data > current.data){
            current.rightNode = addRecursive(current.rightNode, data);
        }else{
            return current;
        }

        return current;
    }
}
