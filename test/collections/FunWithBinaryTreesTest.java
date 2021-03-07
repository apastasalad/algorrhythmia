package collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FunWithBinaryTreesTest {

  @Test
  void sumValuesTest() {

    // Our example tree looks like this:
    //         2
    //       /   \
    //      3     4
    //     / \
    //    5   6

    Node node2 = new Node(2);
    Node node3 = new Node(3);
    Node node4 = new Node(4);
    Node node5 = new Node(5);
    Node node6 = new Node(6);

    node2.left = node3;
    node2.right = node4;
    node3.left = node5;
    node3.right = node6;

    System.out.println("Sum of all values of this tree is (should print 20):");
    Assertions.assertEquals(FunWithBinaryTrees.sumValues(node2), 20);
  }

  @Test
  void univalTreeTest() {

    // Our example tree looks like this:
    //         0
    //       /   \
    //      1     0
    //           / \
    //          1   0
    //         / \
    //        1   1

    Node nodeA = new Node(0);

    Node nodeB = new Node(1);
    Node nodeC = new Node(0);

    Node nodeD = new Node(1);
    Node nodeE = new Node(0);

    Node nodeF = new Node(1);
    Node nodeG = new Node(1);

    nodeA.left = nodeB;
    nodeA.right = nodeC;

    nodeC.left = nodeD;
    nodeC.right = nodeE;

    nodeD.left = nodeF;
    nodeD.right = nodeG;

    Assertions.assertEquals(5, FunWithBinaryTrees.countUnivalTrees(nodeA));
  }

  @Test
  void univalTreeTestPlusPlus() {

    // Our example tree looks like this:
    //         0
    //       /   \
    //      1     0
    //           / \
    //          1   0
    //         / \
    //        1   1

    Node nodeA = new Node(0);

    Node nodeB = new Node(1);
    Node nodeC = new Node(0);

    Node nodeD = new Node(1);
    Node nodeE = new Node(0);

    Node nodeF = new Node(1);
    Node nodeG = new Node(1);

    nodeA.left = nodeB;
    nodeA.right = nodeC;

    nodeC.left = nodeD;
    nodeC.right = nodeE;

    nodeD.left = nodeF;
    nodeD.right = nodeG;

    Assertions.assertEquals(5, FunWithBinaryTrees.countUniversalTreesPlusPlus(nodeA));
  }
}