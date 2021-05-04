import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class BFSTreeIterator implements Iterator<Integer> {
  Queue<Node> queue;

  BFSTreeIterator(Node node) {
    queue = new LinkedList<>();
    queue.add(node);
  }

  @Override
  public boolean hasNext() {
    return !queue.isEmpty();
  }

  @Override
  public Integer next() {
    final Node node = queue.remove();

    if (node.left != null)
      queue.add(node.left);

    if (node.right != null)
      queue.add(node.right);

    return node.value;
  }
}
