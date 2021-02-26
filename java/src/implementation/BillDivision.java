package implementation;

import java.util.List;

public class BillDivision {

  // Complete the bonAppetit function below.
  static void bonAppetit(List<Integer> bill, int k, int b) {

    int sumOfBill = 0;

    // sum the bill
    for (int item : bill) {
      sumOfBill += item;

    }

    // subtract the item she didn't eat
    sumOfBill -= bill.get(k);

    // calculate Anna's share
    int annasShare = sumOfBill / 2;

    // determine the output
    if (annasShare == b) {
      System.out.println("Bon Appetit");
    } else {
      System.out.println(b - annasShare);
    }
  }
}
