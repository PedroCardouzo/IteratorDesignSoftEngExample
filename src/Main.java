import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String args[]) {
    BinaryTree bt = BinaryTree.sampleBinaryTree();

    System.out.println("I can go through the tree by just iterating over it now!");
    Tester.testIterable(bt);

    bt.changeIterator(1);
    System.out.println("\nBut what if the project changed and we need to traverse the tree by levels? Easy, just change the iterator implemented (in this case simulated by a internal switch)");
    Tester.testIterable(bt);

    System.out.println("\nAnd what if we passed another structure?");

    final List<Integer> l = new ArrayList<>();
    bt.forEach(l::add);
    Tester.testIterable(l);

    System.out.println("\nNote that we did not have to change the called operation, it is exactly the same :)");
  }
}
