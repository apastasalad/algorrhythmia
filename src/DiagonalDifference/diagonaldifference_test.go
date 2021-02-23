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

func TestCaseTwo(t *testing.T) {
	var arr = [][]int32{{1, 2, 3}, {4, 5, 6}, {9, 8, 9}}
	var want = 2

	if got := DiagonalDifference(arr); got != int32(want) {
		t.Errorf("Incorrect sum: %d, want: %d.", DiagonalDifference(arr), want)
	}
}

func TestCaseSmallerArray(t *testing.T) {
	var arr = [][]int32{{6, 8}, {-6, 9}}
	var want = 13

	if got := DiagonalDifference(arr); got != int32(want) {
		t.Errorf("Incorrect sum: %d, want: %d.", DiagonalDifference(arr), want)
	}
}
