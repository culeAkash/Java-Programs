package Trees.BinaryTree;

public class RemoveLeaves {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root= BinaryTree.takingTreeInput();
        root= removeLeaves(root);
        BinaryTree.printBinaryTree(root);
    }

    private static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root) {
        if(root==null){
            return null;
        }

        if(root.left==null && root.right==null){
            return null;
        }

        root.left= removeLeaves(root.left);
        root.right=removeLeaves(root.right);
        return root;
    }
}
