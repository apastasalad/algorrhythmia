package implementation;

public class DesignerPDFViewer {

  /**
   * @return Return the size of the highlighted area
   */
  static int designerPdfViewer(int[] h, String word) {
    int maxHeight = Integer.MIN_VALUE;

    // loop over the characters in the word
    for (int i = 0; i < word.length(); i++) {
      char ch = word.charAt(i);

      // convert the character to an index
      int pos = ch - 'a';

      // if this is the highest we've seen, then record it.
      if (h[pos] > maxHeight) {
        maxHeight = h[pos];
      }
    }

    return maxHeight * word.length();
  }
}
