package simplearraysum

import (
	"testing"
)

func TestWithSingleInput(t *testing.T) {
	// 6
	var arr = []int32{6}
	var want = 6

	if got := SimpleArraySum(arr); got != int32(want) {
		t.Errorf("Incorrect sum: %d, want: %d.", SimpleArraySum(arr), want)
	}
}

func TestWithMultipleInput(t *testing.T) {
	//1 2 3 4 10 11
	var arr = []int32{1, 2, 3, 4, 10, 11}
	var want = 31

	if got := SimpleArraySum(arr); got != int32(want) {
		t.Errorf("Incorrect sum: %d, want: %d.", SimpleArraySum(arr), want)
	}
}
