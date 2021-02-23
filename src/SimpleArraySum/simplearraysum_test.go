package simplearraysum

import (
	"testing"
)

func TestWithSingleInput(t *testing.T) {
	// 6
	var arr = []int32{6}
	SimpleArraySum(arr)

	if SimpleArraySum(arr) != 6 {
		t.Errorf("Incorrect sum: %d, want: %d.", SimpleArraySum(arr), 6)
	}
}

func TestWithMultipleInput(t *testing.T) {
	//1 2 3 4 10 11
	var arr = []int32{1, 2, 3, 4, 10, 11}
	SimpleArraySum(arr)

	if SimpleArraySum(arr) != 31 {
		t.Errorf("Incorrect sum: %d, want: %d.", SimpleArraySum(arr), 31)
	}

}
