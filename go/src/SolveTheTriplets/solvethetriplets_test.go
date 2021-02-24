package solvethetriplets

import (
	"testing"
)

func TestCaseOne(t *testing.T) {
	// 5 6 7
	// 3 6 10
	var arrA = []int32{5, 6, 7}
	var arrB = []int32{3, 6, 10}

	var result = CompareTriplets(arrA, arrB)

	if (result[0] != 1) && (result[1] != 1) {
		t.Errorf("Incorrect results: %d", CompareTriplets(arrA, arrB))
	}
}

func TestCaseTwo(t *testing.T) {
	//17 28 30
	//99 16 8
	var arrA = []int32{17, 28, 30}
	var arrB = []int32{99, 16, 8}

	var result = CompareTriplets(arrA, arrB)

	if (result[0] != 2) && (result[1] != 1) {
		t.Errorf("Incorrect results: %d", CompareTriplets(arrA, arrB))
	}
}
