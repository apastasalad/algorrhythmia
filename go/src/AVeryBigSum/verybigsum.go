package averybigsum

/*
 * Sum the big elements of an array.
 */
func VeryBigSum(ar []int64) int64 {

	var arSum int64
	for i := 0; i < len(ar); i++ {
		arSum += ar[i]
	}

	return arSum
}
