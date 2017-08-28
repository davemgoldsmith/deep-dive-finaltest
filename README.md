# deep-dive-finaltest
final test

Final Test/Program that demonstrates reading in dat file, shuffling items(numbers) in a line, sorting on the lowest number
of each line, printing the sorted (and shuffled) line to a created file (test-output.dat) as well as printing the average of 
all the numbers to that file.

DataReader class is utilized to read in the data file "test-input.dat"
Try with resources is employed.  Catches utilized for exceptions.

FinalTest class contains main method and is responsible for the data manipulation and printing to file.
Lines are shuffled in an enhanced for loop.
lines are sorted using a lambda.

writeShuffled method writes the results with "|" delimited numbers to output file.

Note: various testing lines of code are intentially left in.
The testing lines are commented out and do not affect program performance. 
