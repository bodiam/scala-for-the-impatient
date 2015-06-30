/* “Write a Scala program that writes the powers of 2 and their reciprocals to a file, with the exponent ranging from 0 to 20. Line up the columns:
  1      1
  2      0.5
  4      0.25
...      ...”
*/

val out = new java.io.PrintWriter("05.out")
for(i <- 0 to 20) println("%8.0f    %f".format(math.pow(2.0, i), math.pow(2.0, -i)))
//(1 to 20).foreach(num => println("\t" +  (num * num) + "\t" + (1.0/num)))