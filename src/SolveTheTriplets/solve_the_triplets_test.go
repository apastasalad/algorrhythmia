package main

import (
	"testing"
)

// A reviewer rates the two challenges,
// awarding points on a scale from 1 to 100 for three categories: problem clarity, originality, and difficulty.
func compareTriplets(a []int32, b []int32) []int32 {

	var points []int32

	// initialise
	points = append(points, int32(0))
	points = append(points, int32(0))

	for i := 0; i < len(a); i++ {
		if a[i] > b[i] {
			// If a[i] > b[i], then Alice is awarded 1 point.
			points[0] += int32(1)

		} else if a[i] < b[i] {
			// If a[i] < b[i], then Bob is awarded 1 point.
			points[1] += int32(1)

		} else if a[i] == b[i] {
			// If a[i] = b[i], then neither person receives a point.
			// do nothing

		} else {
			// do nothing
		}
	}

	return points
}

func TestCaseOne(t *testing.T) {
	// 5 6 7
	// 3 6 10
	var arrA = []int32{5, 6, 7}
	var arrB = []int32{3, 6, 10}

	var result = compareTriplets(arrA, arrB)

	if (result[0] != 1) && (result[1] != 1) {
		t.Errorf("Incorrect results: %d", compareTriplets(arrA, arrB))
	}
}

func TestCaseTwo(t *testing.T) {
	//17 28 30
	//99 16 8
	var arrA = []int32{17, 28, 30}
	var arrB = []int32{99, 16, 8}

	var result = compareTriplets(arrA, arrB)

	if (result[0] != 2) && (result[1] != 1) {
		t.Errorf("Incorrect results: %d", compareTriplets(arrA, arrB))
	}
}

func main() {
}
