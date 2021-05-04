import java.util.Iterator;
import java.util.Stack;

class DFSTreeIterator implements Iterator<Integer> {
  Stack<Node> stack;

  DFSTreeIterator(Node node) {
    stack = new Stack<>();
    while (node != null) {
      stack.push(node);
      node = node.left;
    }
  }

  @Override
  public boolean hasNext() {
    return !stack.isEmpty();
  }

  @Override
  public Integer next() {
    Node node = stack.pop();
    int result = node.value;

    if(node.right != null) {
      node = node.right;

      while (node != null) {
        stack.push(node);
        node = node.left;
      }
    }

    return result;
  }
}
