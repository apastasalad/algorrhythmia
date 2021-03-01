package implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DesignerPDFViewerTest {

  @Test
  void designerPdfViewerTestOne() {

    int[] testArray = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
    int want = 9;
    int got = DesignerPDFViewer.designerPdfViewer(testArray,"abc");

    Assertions.assertEquals(want, got);
  }

  @Test
  void designerPdfViewerTestTwo() {

    int[] testArray = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};
    int want = 28;
    int got = DesignerPDFViewer.designerPdfViewer(testArray,"zaba");

    Assertions.assertEquals(want, got);
  }
}