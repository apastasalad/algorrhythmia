package simplearraysum

/*
 * Sum the elements of an array.
 */
func SimpleArraySum(ar []int32) int32 {

	var arSum int32
	for i := 0; i < len(ar); i++ {
		arSum += ar[i]
	}

	return arSum
}
