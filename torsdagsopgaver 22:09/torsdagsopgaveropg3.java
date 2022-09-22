/*Task 3 Leg med tal
3.a Create a class MathWork add a main method.

3.b Write a method 'divisible', that takes in 
an integer as a parameter and prints all values 
between 0 and 100 that are divisible by the parameter 
received.

3.c call the method from main

3.d add the following array to the 
class: int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 }

3.e Write a method, 'getRandom' that returns a 
random element from the above array.

3.f Write a function that takes an integer as a 
parameter and prints the number. After that, it 
subtracts one from the input and calls itself 
again (recursion). If the input is less than zero, it 
should no longer call itself.*/

import java.util.Random

class MathWork {
public static void main (String[] args) {
	int numbers = 100;
	int divisible = 12;
	int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 };

	for (int i = 1; i <= numbers; i++) {
		if(i%divisible==0){
			System.out.print(i + " ");
		}


	}
System.out.println();
System.out.println(getRandom(arr));
printNum(5);
}
public static int getRandom(int[]arr) {
	int rnd = new Random().nextInt(arr.length);
	return arr[rnd];
}
public static void printNum( int num){
	System.out.println(num);
	num = num -1
	Systen.out.println(num);
}
}