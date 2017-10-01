# PowerSet-Java

DESCRIPTION OF PROBLEM:

The input for this problem will be an array of numbers representing a set, which only contains unique numbers
The goal is to print every possible set combination, otherwise known as the power set


EXAMPLE:

input set = [1, 2, 3]
power set = [[], [1], [2], [3], [1, 2], [2, 3], [1, 3] [1, 2, 3]]


ALGORITHM:

There will be 2^N possible combinations of a set of length N because every element can either be in the set or not 
We do this for N numbers, giving us 2 * 2 * 2 ... = 2^N. 

(1) Loop from 0 to 2^N

(2) For each number get the binary representation of the number, e.g. 3 = 011

(3) Determine from the binary representation whether or not to include a number from the set, e.g. 011 = [exclude, include, include]

