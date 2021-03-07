package collections;

public class FunWithBinaryTrees {

  static int sumValues(Node root) {
    if (root == null) {
      return 0;
    }
    return root.data + sumValues(root.left) + sumValues(root.right);
  }


  /**
   * Is this a unival tree?
   */
  static boolean isUnival(Node root) {
    // Case 1 (no child nodes)
    if (root == null) {
      return true;
    }
    // Case 2 (left node)
    if ((root.left != null) && (root.left.data != root.data)) {
      return false;
    }
    // Case 3 (right node)
    if ((root.right != null) && (root.right.data != root.data)) {
      return false;
    }
    // Case 4 (all children)
    if ((isUnival(root.right)) && ((isUnival(root.left)))) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * return the number of non-empty unival trees
   */
  static int countUnivalTrees(Node root) {
    if (root == null) {
      return 0;
    }

    int totalCount = countUnivalTrees(root.left) + countUnivalTrees(root.right);

    if (isUnival(root)) {
      totalCount += 1;
    }

    return totalCount;
  }

  /**
   * Improve the Search
   */
  static int countUniversalTreesPlusPlus(Node root) {
    return Math.abs(helper(root));
  }

  static int helper(Node root) {
    // case 1
    if (root == null) {
      return 0;
    }

    // case 2
    if ((root.left == null) && (root.right == null)) {
      return 1;
    }

    int left = helper(root.left);
    int right = helper(root.right);

    if (root.left == null) { // root.right != null
      if (right > 0 && root.right.data == root.data) {
        return right + 1;
      } else {
        return right;
      }
    }
    if (root.right == null) { // root.left != null
      if (left > 0 && root.left.data == root.data) {
        return left + 1;
      } else {
        return left;
      }
    }
    if (left > 0 && root.left.data == root.data &&
        right > 0 && root.right.data == root.data) {
      return left + right + 1;
    } else {
      return -Math.abs(left) - Math.abs(right);
    }
  }
}

class Node {

  int data;
  Node left;
  Node right;

  Node(int data) {

    this.data = data;
  }
}