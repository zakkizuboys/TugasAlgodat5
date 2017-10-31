
package BinaryTreeLinked;

public class ExtendedBinaryTreeClass implements ExtendedBinaryTree{

    @Override
    public boolean compareTrees(BinaryTreeNode a, BinaryTreeNode b){
        if (a == null && b == null){
            return true;
        } 
        if (a != null && b != null){ 
            return (a.element == b.element && 
                    compareTrees(a.leftChild, b.leftChild)&& 
                    compareTrees(a.rightChild, b.rightChild));
        }
        return false;
    }
    
    @Override
    public Object clone(){
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException e) {
            throw new Error("Node tidak bisa di clone");
        }
    }
    
    @Override
    public void swapSubtrees(final BinaryTreeNode root) {
    final BinaryTreeNode temp = root.rightChild;
    root.rightChild = root.leftChild;
    root.leftChild = temp;
        if (root.leftChild != null) {
            swapSubtrees(root.leftChild);
        }

        if (root.rightChild != null) {
            swapSubtrees(root.rightChild);
        }
    }    
}