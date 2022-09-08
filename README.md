# torsdagsopgaver1

Martin Thuren Christensen
cph-mc489@cphbusiness.dk

//Task 2:

//2.a
String navn = "Martin";
println(navn);

//2.b
String alder = "22 years";
println(alder);

//2.c
boolean iamHappy = true;
boolean iamSad = false;

println(iamHappy);

//2.d
println("Hi, my name is",navn,".");
println("I am",alder,"old");
if (iamHappy = false);
println("I dont clap my hands");

Task 4a - 4.a print out numbers from 0 to 20 using a for loop.
size(400, 400);
for (int i = 0; i <= 20; i = i+1) {
if(i > 20);
println(i);
}

//Task 4b - 4.b alter the for loop from 4.a to only print even numbers 

for (int i = 0; i <= 100; i++) {
  if (i % 2 == 0) 
    println(i);
  }
  
//Task 4c - 4.c print out the same result as in task 4.b using a while loop instead of a for loop.

int i = 0;
while (i <= 100) {
  println(i);
  i = i + 2;
}

//Task 5a
The following method has an error in it. Fix the error and run it. 

void MethodOne()
{
  int i = 1000; // You are not allowed to change this line. 
  
  int max = 10;
  
  if (i > max)
    println(i,"is greater than "+max+".");
  }
  
//Task 5b

//6.a Make 2 integer variables named a and b. Print "Success!" if either of them is equal to 10 or if the sum is. If not, print "Failure!".
int a = 10;
int b = 0;
if(a <= 10 && b == 0) {
println("Succes!");
}  else {
  println("Failure!");
}

//6.b make 3 integer variables named x, y and z. Print "Success!" if their sum is 30, but none of them may have the value of 10, 20 or 30. Otherwise print "Failure!".

int x = 7;
int y = 7;
int z = 16;

// Tests to see if 'x' is equal to 'y' is equal to 'z'
if (x+y+z==30 == true) {
  println("Succes!");  // They are 30 together, so this line will print
} else {
  println("Failure!");  // They are not 30 together so this line will print
}

7a. 
//create an integer called input and assign it a value of 20. 
//Use a loop to print all integers between the input value and 0, with the following exceptions:
//if the number is 6, instead print the string "six". Once the number is half of the input value, print "HALF!"


int input4 = 20;
while (input4 >= 9) {
println(input4);
input4 = input4-1;

  if (input4 == 10) {
  println("HALF!");
  }
}

int input = 9;
while (input >= 7) {
println(input);
input = input-1;

  if (input == 6) {
  println("six");
  }
}
int input2 = 5;
while (input2 >= 0) {
println(input2);
input2 = input2-1;
}

Eller

int input = 20;

for (int i = input; i >= 0; i = i -1) {
  if (i==6) {
    println("six");
  }

  else if (i==input/2) {
    println("Halv");
  }else
  println(i);
}

//7.b Run exercise 7.a again with a different input value 
//and make sure it still works. You should also consider 
//if it will work with a negative input, e.g. -20.
