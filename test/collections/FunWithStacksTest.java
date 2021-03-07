package collections;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FunWithStacksTest {

  @Test
  void stringCollectionTestOne() {
    List<String> want = new ArrayList<>();
    want.add("Three");
    want.add("Two");
    want.add("One");

    List<String> got = FunWithStacks.stringCollection();

    Assertions.assertEquals(want, got);
  }
}