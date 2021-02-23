package main

import (
	"testing"
)

/*
 * Sum the elements of an array.
 */
func simpleArraySum(ar []int32) int32 {

	var arSum int32
	for i := 0; i < len(ar); i++ {
		arSum += ar[i]
	}

	return arSum
}

func TestWithSingleInput(t *testing.T) {
	// 6
	var arr = []int32{6}
	simpleArraySum(arr)

	if simpleArraySum(arr) != 6 {
		t.Errorf("Incorrect sum: %d, want: %d.", simpleArraySum(arr), 6)
	}
}

func TestWithMultipleInput(t *testing.T) {
	//1 2 3 4 10 11
	var arr = []int32{1, 2, 3, 4, 10, 11}
	simpleArraySum(arr)

	if simpleArraySum(arr) != 31 {
		t.Errorf("Incorrect sum: %d, want: %d.", simpleArraySum(arr), 31)
	}

}
