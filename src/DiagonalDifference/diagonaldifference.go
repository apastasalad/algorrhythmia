package diagonaldifference

import "fmt"

//Given a square matrix, calculate the absolute difference between the sums of its diagonals.
//
//For example, the square matrix  is shown below:
//
//1 2 3
//4 5 6
//9 8 9
//The left-to-right diagonal = . The right to left diagonal = . Their absolute difference is .
func DiagonalDifference(arr [][]int32) int32 {

	var l2r int32
	var r2l int32

	var length = len(arr) - 1

	for i := 0; i <= length; i++ {
		fmt.Println(i)
		l2r += arr[i][i]
	}

	for j := 0; j <= length; j++ {
		r2l += arr[j][length-j]
	}

	// calculate the absolute difference
	// there isn't a math function that does this for int, so let's write out own.
	var result = l2r - r2l
	if result < 0 {
		return -result
	}

	return result
}
