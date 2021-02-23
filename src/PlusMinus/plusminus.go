package main

import "fmt"

func main() {
	plusMinus([]int32{-4, 3, -9, 0, 4, 1})
}

// Complete the plusMinus function below.
func plusMinus(arr []int32) {

	var length = len(arr)
	var positive int32 = 0
	var negative int32 = 0
	var zeroes int32 = 0

	// iterate over the array and check for positive values.
	for i := 0; i < length; i++ {
		if arr[i] > 0 {
			positive++
		} else if arr[i] < 0 {
			negative++
		} else if arr[i] == 0 {
			zeroes++
		} else {
			// do nothing
		}
	}

	//print the proportion of positive values
	// we need to explicitly cast each element of the division in order
	// to remain type safe.
	fmt.Printf("%f\n", float32(positive)/float32(length))
	fmt.Printf("%f\n", float32(negative)/float32(length))
	fmt.Printf("%f\n", float32(zeroes)/float32(length))
}
