package solvethetriplets

// A reviewer rates the two challenges,
// awarding points on a scale from 1 to 100 for three categories: problem clarity, originality, and difficulty.
func CompareTriplets(a []int32, b []int32) []int32 {

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
