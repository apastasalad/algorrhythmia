package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class FunWithStacks {

  static List<String> stringCollection = new ArrayList<>();

  /**
   * Use a Stack to reverse a List
   */
  static List<String> stringCollection() {

    stringCollection.add("One");
    stringCollection.add("Two");
    stringCollection.add("Three");

    Stack<String> stackOfStrings = new Stack<>();

    // Reverse the order
    while (stringCollection.size() > 0) {
      stackOfStrings.push(stringCollection.remove(0));
    }

    while (stackOfStrings.size() > 0) {
      stringCollection.add(stackOfStrings.pop());
    }

    return stringCollection;
  }
}
