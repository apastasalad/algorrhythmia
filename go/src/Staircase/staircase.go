package main

import "fmt"

func main() {

	staircase(9)

}

// Complete the staircase function below.
func staircase(n int32) {

	// the first step is spaces and ONE hash
	var hashPrinter = 1
	var spacePrinter = int(n) - 1

	for i := 0; int32(i) < n; i++ {
		// print the spaces for this line if we should
		if spacePrinter > 0 {
			// print the spaces
			for j := 0; j < spacePrinter; j++ {
				fmt.Print(" ")
			}

		}

		// print all the #s for this line
		for k := 0; k < hashPrinter; k++ {
			fmt.Print("#")

		}

		// add a new line at the end
		fmt.Println("")

		// calculate the next line
		hashPrinter++
		spacePrinter--
	}
}
