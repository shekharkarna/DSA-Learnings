public class TreeSolution {

    public static void main(String[] args) {
        final Tree tree = new Tree();
        TreeNode rootNode = tree.create();

        System.out.println("printing PreOrder Traversal");
        tree.preOrderTraversal(rootNode);
        System.out.println("printing InOrder Traversal");
        tree.inOrderTraversal(rootNode);
        System.out.println("printing PostOrder Traversal");
        tree.postOrderTraversal(rootNode);
        System.out.println("printing Level Order Traversal");
        tree.levelOrderTraversal(rootNode);
    }
}
