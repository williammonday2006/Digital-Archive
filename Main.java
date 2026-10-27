public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> archive = new BinarySearchTree<>();

        System.out.println("=== Sample Archive ===");
        int[] sampleIds = {50, 25, 75, 10, 30, 60, 85};

        for (int id : sampleIds) {
            archive.add(id);
        }

        System.out.println("Archive height: " + archive.height());
        System.out.print("Inorder traversal: ");
        archive.inOrderTraversal();
        System.out.print("Preorder traversal: ");
        archive.preOrderTraversal();

        System.out.println("\n=== Empty Tree ===");
        BinarySearchTree<Integer> emptyTree = new BinarySearchTree<>();
        System.out.println("Empty tree height: " + emptyTree.height());
        System.out.print("Inorder traversal: ");
        emptyTree.inOrderTraversal();
        System.out.print("Preorder traversal: ");
        emptyTree.preOrderTraversal();

        System.out.println("\n=== Single-Node Tree ===");
        BinarySearchTree<Integer> singleTree = new BinarySearchTree<>();
        singleTree.add(42);
        System.out.println("Single-node tree height: " + singleTree.height());
        System.out.print("Inorder traversal: ");
        singleTree.inOrderTraversal();
        System.out.print("Preorder traversal: ");
        singleTree.preOrderTraversal();

        System.out.println("\n=== Skewed Tree ===");
        BinarySearchTree<Integer> skewedTree = new BinarySearchTree<>();
        int[] sortedIds = {10, 20, 30, 40};

        for (int id : sortedIds) {
            skewedTree.add(id);
        }

        System.out.println("Skewed tree height: " + skewedTree.height());
        System.out.print("Inorder traversal: ");
        skewedTree.inOrderTraversal();
        System.out.print("Preorder traversal: ");
        skewedTree.preOrderTraversal();
    }
}
