
package BinaryTreeLinked;

public class DriverLinkedBinaryTree {
    public static void main(String[] args) {
        LinkedBinaryTree l = new LinkedBinaryTree();
        //insert data ke Object L
        l.root = new BinaryTreeNode(1);
        l.root.leftChild = new BinaryTreeNode(2);
        l.root.rightChild = new BinaryTreeNode(3);
        
        //tampilkan preorder, postorder dan inorder dari Object L
        System.out.println("PreOrder dari Object L");
        l.preOrderOutput();
        System.out.println("PostOrder dari Object L");
        l.postOrderOutput();
        System.out.println("InOrder dari Object L");
        l.inOrderOutput();
        System.out.println();
        LinkedBinaryTree r = new LinkedBinaryTree();
        
        //insert data ke Object R
        r.root = new BinaryTreeNode(1);
        r.root.leftChild = new BinaryTreeNode(2);
        r.root.rightChild = new BinaryTreeNode(3);
        
        //tampilkan preorder, postorder dan inorder dari Object R
        System.out.println("PreOrder dari Object R");
        r.preOrderOutput();
        System.out.println("PostOrder dari Object R");
        r.postOrderOutput();
        System.out.println("InOrder dari Object R");
        r.inOrderOutput();
        System.out.println();
        System.out.println("Apakah Object L dan Obejct R sama? ");
        System.out.println(r.compareTrees(r.root, l.root));
        System.out.println();
        
        //insert data ke Object L
        l.root.leftChild.leftChild = new BinaryTreeNode(4);
        l.root.leftChild.rightChild = new BinaryTreeNode(5);
        LinkedBinaryTree a = (LinkedBinaryTree) r.clone();
        System.out.println("Setelah di copy ke Object A");
        System.out.println("PreOrder dari Object A");
        a.preOrderOutput();
        System.out.println("PostOrder dari Object A");
        a.postOrderOutput();
        System.out.println("InOrder dari Object A");
        a.inOrderOutput();
        
        //swap tree
        System.out.println("Data Object R sebelum di swap(preOrder)");
        r.preOrderOutput();
        System.out.println("Setelah d swap(preOrder");
        r.swapSubtrees(r.root);
        r.preOrderOutput();
        System.out.println("Setelah Object r kiri di swap dengan r kanan(PreOrder R)");
        r.preOrderOutput();
        
        //hapus leftSubtree
        System.out.println("sebelum Object L sebelum di hapus");
        l.preOrderOutput();
        l.removeLeftSubtree();
        System.out.println("setelah Object L kiri di remove");
        l.preOrderOutput();
    }
}

