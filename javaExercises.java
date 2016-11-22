// You may import any libraries you need.

public class javaExercises
{
/********************************************
***********  Java Exercises  ****************
*********************************************

  Answer the questions by writing code to satisfy the Expected
  results.  The first function - Question1() - has been defined
  already, and called inside of main().  Follow this format for
  the remaining questions.

  ** NOTE ** Your functions should have the static modifier in order
  to compile if you call the function without creating a javaExercises
  object.  You may import any libraries you wish in order to complete
  the questions.

  NAME:

  Question 1: Write a function to print the result of the
              following operations:

              Test Data:
              a. -5 + 8 * 6
              b. (55 + 9) % 9
              c. 20 + -3 * 5 / 8
              d. 5 + 15 / 3 * 2 - 8 % 3

              Expected Output:
              43
              1
              19
              13
*/
public static void Question1()
{

  double a = (-5 + 8 * 6);
  double b = ((55 + 9) % 9);
  double c = (20 + -3 * 5 / 8);
  double d = (5 + 15 / 3 * 2 - 8 % 3);

  System.out.println(a);
  System.out.println(b);
  System.out.println(c);
  System.out.println(d);

}

/*
  Question 2: Write a function that asks the user for two numbers
              and prints the sum, multiplies, subtracts, divides, and
              the remainder of the two numbers (modulus).

              Test Data:
              First number: 125
              Second Number: 24

              Expected Output:
              125 + 24 = 149
              125 - 24 = 101
              125 x 24 = 3000
              125 / 24 = 5
              125 mod 25 = 5
*/
//TODO Implement Question 2 here

public static void Question2(double a, double b) {

    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    if(b == 0) {
      System.out.println("Can't divide by zero!");
    }
    else {
      System.out.println(a / b);
    }
    System.out.println(a % b);

}

/*
  Question 3: Write a function that takes a number as input and
              print its multiplication table up to 10.

              Test Data:
              Input a number: 8

              Expected Output:
              8 x 1 = 8
              8 x 2 = 16
              8 x 3 = 24
              ...
              8 x 10 = 80
*/
//TODO Implement Question 3 here

public static void Question3(int a) {
  for(int x = 1; x <= 10; x++) {
    System.out.println(a*x);
  }
}


/*
  Question 4: Write a function to print the area and perimeter
              of a circle with a radius input by the user.

              Test Data:
              Radius = 7.5

              Expected Output:
              Perimeter is = 47.12388980384689
              Area is = 176.71458676442586
*/
//TODO Implement Question 4 here

public static void Question4(double radius) {

    double circumference  = 2 * radius * Math.PI;
    double area           = radius * radius * Math.PI;

    System.out.println(circumference);
    System.out.println(area);

}


/*
  Question 5: Write a function that swaps the values of 2 integer variables
              Use the given function declaration.

              Expected Output:
              Before swapping : a, b = 15, 27
              After swapping : a, b = 27, 15
*/
public static void Question5(int a, int b)
{
  //TODO Implement swap logic here

}

/* Question 6: Write a function that converts temperature from
               Fahrenheit to Celsius.

               Test Data:
               Input a temperature in degrees Fahrenheit: 212

               Expected Output:
               212.0 degrees Fahrenheit is equal to 100.0 in Celsius
*/
//TODO Implement Question 6 here

public static void Question6(double fahrenheit) {

  double celsius = ((fahrenheit - 32) * 9 / 5);
  System.out.println(celsius);

}

/*
  Question 7: Write a function that reads an integer between 0 and 1000
              and adds all the digits in the integer.

              Test Data:
              Input an integer between 0 and 1000: 565

              Expected Output:
              The sum of all digits in 565 is 16
*/
//TODO Implement Question 7 here

public static void Question7(int number) {

  String numberStr  = number + "";
  Double answer     = 0.0;

  for(int x = 0; x < numberStr.length(); x++) {
    answer += Double.parseDouble(numberStr.substring(x, x+1));
  }

  System.out.println(answer);

}

/*
  Question 8: Write a function that gets a number from the user and
              print whether it is positive or negative.

              Test Data:
              Input number: 35

              Expected Output:
              Number is positive.
*/
//TODO Implement Question 8 here

public static void Question8(int number) {

  if(number < 0) {
    System.out.println(number + " is less than zero, ergo it is negative.");
  }

  else if(number > 0) {
    System.out.println(number + " is greater than zero, ergo it is positive.");
  }

  else {
    System.out.println(number + " is zero.");
  }

}

/*
  Question 9: Write a function that returns a String takes a number
              from the user and generates an integer between 1 and 7
              and displays the day of the week *Monday = 1 Sunday = 7*

              Test Data:
              Input number: 3

              Expected Output:
              Wednesday
*/
//TODO Implement Question 9 here

public static void Question9(int number) {
  switch(number) {

    case 1:
      System.out.println("Monday");
      break;

    case 2:
      System.out.println("Tuesday");
      break;

    case 3:
      System.out.println("Wednesday");
      break;

    case 4:
      System.out.println("Thursday");
      break;

    case 5:
      System.out.println("Friday");
      break;

    case 6:
      System.out.println("Saturday");
      break;

    case 7:
      System.out.println("Sunday");
      break;

    default:
      System.out.println("Invalid number.");
      break;

  }
}

/*
  Question 10: Write a function that prints a triangular pattern of
               numbers with each number increased by 1. Such as:

               1
               2 3
               4 5 6
               7 8 9 10

               Test Data:
               Input number of rows: 4

               Expected Output:
               1
               23
               456
               78910
*/
//TODO Implement Question 10 here

public static void Question10(int rows) {

  int count = 1;

  for(int x = 0; x < rows; x++) {   //Row count

    for(int i = 0; i < x; i++) {    //# count per row, no more numbers than the row number


    }

  }

}


  public static void main(String[] args)
  {
    //Call Question functions here.
    Question1();
    Question2(125, 24);
    Question3(8);
    Question4(7.5);
    Question5(15, 27);
    Question6(212);
    Question7(565);
    Question8(35);
    Question9(3);
    //Question10();

  }
}
