package averybigsum

import (
	"testing"
)

func TestWithSingleInput(t *testing.T) {
	// 5
	var arr = []int64{5}
	var want = 5

	if got := VeryBigSum(arr); got != int64(want) {
		t.Errorf("Incorrect sum: %d, want: %d.", VeryBigSum(arr), want)
	}

	if VeryBigSum(arr) != 5 {

	}
}

func TestWithMultipleInput(t *testing.T) {
	//1000000001, 1000000002, 1000000003, 1000000004, 1000000005
	var arr = []int64{1000000001, 1000000002, 1000000003, 1000000004, 1000000005}
	var want = 5000000015

	if got := VeryBigSum(arr); got != int64(want) {
		t.Errorf("Incorrect sum: %d, want: %d.", VeryBigSum(arr), want)
	}
}
