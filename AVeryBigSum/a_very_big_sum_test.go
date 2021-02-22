package main

import (
	"testing"
)

/*
 * Sum the big elements of an array.
 */
func aVeryBigSum(ar []int64) int64 {

	var arSum int64
	for i := 0; i < len(ar); i++ {
		arSum += ar[i]
	}

	return arSum
}

func TestWithSingleInput(t *testing.T) {
	// 5
	var arr = []int64{5}
	aVeryBigSum(arr)

	if aVeryBigSum(arr) != 5 {
		t.Errorf("Incorrect sum: %d, want: %d.", aVeryBigSum(arr), 5)
	}
}

func TestWithMultipleInput(t *testing.T) {
	//1000000001, 1000000002, 1000000003, 1000000004, 1000000005
	var arr = []int64{1000000001, 1000000002, 1000000003, 1000000004, 1000000005}
	aVeryBigSum(arr)

	if aVeryBigSum(arr) != 5000000015 {
		t.Errorf("Incorrect sum: %d, want: %d.", aVeryBigSum(arr), 5000000015)
	}

}
