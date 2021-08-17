public class TreeNode {
    public int value;
    public TreeNode left;
    public TreeNode right;

    TreeNode(int value) {
        this.value = value;
        right = null;
        left = null;
    }

    public static void insert(TreeNode root, int value){
        if(root == null){
            TreeNode temp = new TreeNode(value);
            root = temp;
        }
        if(root.value > value  ){
            if(root.left == null){
                TreeNode temp = new TreeNode(value);
                root.left = temp;
            }
            else {
                insert(root.left, value);
            }
        } else {
            if(root.right == null){
                TreeNode temp = new TreeNode(value);
                root.right = temp;
            }
            else {
                insert(root.right, value);
            }
        }
    }

    public static void printDFS(TreeNode node) {
        if (node == null) {
            return;
        } else {
            printDFS(node.left);
            printDFS(node.right);
            System.out.println(node.value);
        }
    }

    public static void printBFS(TreeNode node) {
        if (node == null) {
            return;
        } else {
            System.out.println(node.value);
            printBFS(node.left);
            printBFS(node.right);

        }
    }
}
