# Phase 1

I created the BSTNode and BinarySearchTree classes and used recursion to insert accession IDs in the correct positions. Comparable allows the tree to compare values and maintain the binary search tree ordering. I tested the program and confirmed that it ran successfully.

# Phase 2

I added a height method that uses recursion to find the deepest branch of the tree. It calculates the heights of the left and right subtrees and returns the larger height plus one. An empty tree returns -1, making a tree with only a root node have height 0. My sample tree returned the expected height of 2.