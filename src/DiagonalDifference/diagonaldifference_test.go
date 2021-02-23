package diagonaldifference

import "testing"

//11 2 4
//4 5 6
//10 8 -12
//Sample Output
//
//15
//Explanation
//
//The primary diagonal is:
//
//11
//5
//-12
//Sum across the primary diagonal: 11 + 5 - 12 = 4
//
//The secondary diagonal is:
//
//4
//5
//10
//Sum across the secondary diagonal: 4 + 5 + 10 = 19
//Difference: |4 - 19| = 15

func TestCaseOne(t *testing.T) {
	var arr = [][]int32{{11, 2, 4}, {4, 5, 6}, {10, 8, -12}}
	var want = 15

	if got := DiagonalDifference(arr); got != int32(want) {
		t.Errorf("Incorrect sum: %d, want: %d.", DiagonalDifference(arr), want)
	}
}
