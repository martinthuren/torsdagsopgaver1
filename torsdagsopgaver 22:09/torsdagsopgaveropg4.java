/*Task 4 Fibonacci
4.a Write a method, fibonacci that takes 
two integers as parameters and prints the 
first of them. Each printed value should 
followed by a tab ( \t ). Then have the 
function calculate and print the 
fibunacci sequence (0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144) 
by calling itself. If the input is 
greater than 1000, then stop. Start the function 
by calling it from main with the input (1, 1).
*/

public class fibonacci

public static void main (String[] args);

var A = 0;
var B = 1;
var T;

for(var i = 1; i <= 10; i++ ){
  System.out.println( "" + i + ": " + B );
  T = A + B;
  A = B;
  B = T;
}

