import java.util.LinkedList;

/**
/* Tree is a hierarchical data structure in which a collection of elements known as nodes are connected to each other via edges
/* there exists exactly one path between any two nodes.
/* Here example is of Binary Tree
 */
public class Tree {

    /** This will return a treeNode which is root of tree */
    public TreeNode create() {
        final TreeNode rootNode = new TreeNode(1);
        final TreeNode leftChild = new TreeNode(2);
        final TreeNode rightChild = new TreeNode(3);
        final TreeNode leftLeftChild = new TreeNode(4);
        final TreeNode leftRightChild = new TreeNode(5);
        final TreeNode rightRightChild = new TreeNode(6);

        rootNode.left = leftChild;
        rootNode.right = rightChild;

        leftChild.left = leftLeftChild;
        leftChild.right = leftRightChild;

        rightChild.right = rightRightChild;
        return rootNode;
    }

    public void preOrderTraversal(final TreeNode treeNode) {
        if(treeNode == null) {
            return;
        }
        System.out.println(treeNode.data);
        preOrderTraversal(treeNode.left);
        preOrderTraversal(treeNode.right);
    }

    public void inOrderTraversal(final TreeNode treeNode) {
        if(treeNode == null) {
            return;
        }
        inOrderTraversal(treeNode.left);
        System.out.println(treeNode.data);
        inOrderTraversal(treeNode.right);
    }

    public void postOrderTraversal(final TreeNode treeNode) {
        if(treeNode==null) {
            return;
        }
        postOrderTraversal(treeNode.left);
        postOrderTraversal(treeNode.right);
        System.out.println(treeNode.data);
    }

    public void levelOrderTraversal(final TreeNode treeNode) {
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        if(treeNode==null) {
            return;
        }
        linkedList.add(treeNode);

        while(!linkedList.isEmpty()) {
            TreeNode node = linkedList.poll();
            if(node.left != null) {
                linkedList.add(node.left);
            }
            if(node.right != null) {
                linkedList.add(node.right);
            }
            System.out.println(node.data);
        }
    }
}
