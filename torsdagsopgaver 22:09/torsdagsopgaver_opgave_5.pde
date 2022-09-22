
//Debugging 2 - klaret
/*
void setup()
 {
 println("Jobs done!");
 }
 
 //Debugging 3 (ikke klaret)
 
 boolean isJobDone = false;
 
 void setup()
 {
 if (isJobDone)
 println("Job's done!");
 }
 
 void isJobDone()
 {
 
 }
 
 
 //Debugging 4 - klaret
 boolean jobsDone = true;
 
 void setup()
 {
 if (jobsDone)
 {
 println("Job's done!");
 }
 }
 
 boolean isJobDone()
 {
 return jobsDone;
 }
 //Debugging 5 - klaret
 boolean jobsDone = true;
 
 void setup()
 {
 if (jobsDone==true)
 {
 println("Job's done!");
 }
 }
 
 boolean isJobDone;
 {
 
 }
 
 
 //Debugging 6 - ikke klaret
 boolean jobsDone = true;
 
 void setup()
 {
 
 println(getRandomNumber(0, 10));
 if (isJobDone())
 {
 println("Job's done!");
 }
 }
 
 boolean isJobDone()
 {
 return jobsDone;
 }
 
 int getRandomNumber(int min, int max)
 {
 return random(min, max);
 }
 
 //Debugging 7 - klar
 boolean jobsDone = true;
 
 void setup()
 {
 int myArray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
 println(getSumOfElementsInArray(myArray));
 
 if (isJobDone())
 {
 println("Job's done!");
 }
 }
 
 int getSumOfElementsInArray(int[] array)
 {
 int sum = 0;
 for (int value : array) {
 sum += value;
 }
 return sum;
 }
 
 boolean isJobDone()
 {
 return jobsDone;
 }
 
 //Debuggin 8 - ikke klaret
 boolean jobsDone = true;
 
 void setup()
 {
 println(isValueGreaterThanThreshold(10, 5));
 println(isValueGreaterThanThreshold(4, 8));
 
 if (isJobDone())
 {
 println("Job's done!");
 }
 }
 
 boolean isValueGreaterThanThreshold(value,threshold)
 {
 if (value > threshold)
 {
 return true;
 }
 }
 
 boolean isJobDone()
 {
 return jobsDone;
 }
 
 //Debugging 9 - klaret
 boolean jobsDone = true;
 
 void setup()
 {
 int myArray[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1};
 print(getSumOfAllElementsInArray(myArray));
 
 if (isJobDone())
 {
 println("Job's done!");
 }
 }
 
 boolean isJobDone()
 {
 return jobsDone;
 }
 
 int getSumOfAllElementsInArray(int[] arr)
 {
 int sum = 0;
 for (int i = 0; i >= arr.length; i++)
 {
 sum += arr[i];
 }
 return sum;
 }
 */
boolean jobsDone = true;

void setup()
{
  size(1000, 1000);
  drawGrid(15, 15, 40);

  if (isJobDone())
  {
    println("Job's done!");
  }
}

void draw() {
}

boolean isJobDone()
{
  return jobsDone;
}


void drawGrid(int numberOfHorizontalCells, int numberOfVerticalCells, int cellSideLength)
{
  for (int x = 0; x < numberOfHorizontalCells; x++)
  {
    for (int y = 0; y < numberOfVerticalCells; y++)
    {

      if (x % 2 == 0 && y % 2==0)
      {

        fill(0);
      } else if (y % 2==1 && x % 2 == 1 ) {

        fill(255);
      }
      rect(x * cellSideLength, y * cellSideLength, cellSideLength, cellSideLength);
    }
  }
}
