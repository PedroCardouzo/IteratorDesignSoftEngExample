import java.util.*;

public class BinaryTree implements Iterable<Integer> {

  private Node root;
  private int mode;

  public BinaryTree() {
    mode = 0; // DFS by default
  }

  @Override
  public Iterator<Integer> iterator() {
    if (mode == 1)
      return new BFSTreeIterator(root);
    else
      return new DFSTreeIterator(root);

  }

  public void add(int value) {
    root = addNode(root, value);
  }

  public void changeIterator(int newMode) {
    this.mode = newMode;
  }

  public static BinaryTree sampleBinaryTree() {
    BinaryTree bt = new BinaryTree();

    bt.add(1);
    bt.add(5);
    bt.add(3);
    bt.add(6);
    bt.add(3);
    bt.add(8);
    bt.add(11);

    return bt;
  }

  private Node addNode(Node current, int value) {
    if (current == null) {
      return new Node(value);
    }

    if (value < current.value) {
      current.left = addNode(current.left, value);
    } else if (value > current.value) {
      current.right = addNode(current.right, value);
    } else {
      // equal values go to the left
      current.left = addNode(current.left, value);
    }

    return current;
  }
}

