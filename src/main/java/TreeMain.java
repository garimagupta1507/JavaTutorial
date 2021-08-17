public class TreeMain {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(4);
        TreeNode.insert(tree,3);
        TreeNode.insert(tree,5);
        TreeNode.insert(tree,7);
        TreeNode.insert(tree,6);

        TreeNode.printDFS(tree);
        System.out.println();
        TreeNode.printBFS(tree);
        
    }
}
