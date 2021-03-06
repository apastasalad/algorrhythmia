package implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IHelloPrinterTest {

  @Test
  void helloPrinterTestOne() {

    String want = "Hello World";

    IHelloPrinter hp;
    hp = (s) -> "Hello " + s;
    String got = hp.sayHello("World");

    Assertions.assertEquals(want, got);
  }
}
