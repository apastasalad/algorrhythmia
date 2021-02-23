package diagonaldifference

//Given a square matrix, calculate the absolute difference between the sums of its diagonals.
//
//For example, the square matrix  is shown below:
//
//1 2 3
//4 5 6
//9 8 9
//The left-to-right diagonal = . The right to left diagonal = . Their absolute difference is .
func DiagonalDifference(arr [][]int32) int32 {

	var left2right = arr[0][0] + arr[1][1] + arr[2][2]
	var right2left = arr[0][2] + arr[1][1] + arr[2][0]

	// calculate the absolute difference
	// there isn't a math function that does this for int, so let's write out own.
	var result = left2right - right2left
	if result < 0 {
		return -result
	}

	return result
}
