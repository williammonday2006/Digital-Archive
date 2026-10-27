# Phase 1

I created the BSTNode and BinarySearchTree classes and used recursion to insert accession IDs in the correct positions. Comparable allows the tree to compare values and maintain the binary search tree ordering. I tested the program and confirmed that it ran successfully.

# Phase 2

I added a height method that uses recursion to find the deepest branch of the tree. It calculates the heights of the left and right subtrees and returns the larger height plus one. An empty tree returns -1, making a tree with only a root node have height 0. My sample tree returned the expected height of 2.

# Phase 3

I added inorder and preorder traversal methods using recursion. Inorder visits the left subtree, the current node, and then the right subtree, which prints the IDs in sorted order. Preorder visits the current node first, followed by the left and right subtrees. I tested both methods and confirmed that they produced the expected output.

# Phase 4

I tested empty, single-node, and skewed trees. The empty tree returned a height of -1 without crashing, and the single-node tree returned 0. Inserting sorted values created a right-skewed tree with height 3. The sample tree had height 2, showing that insertion order affects the tree's structure and efficiency.