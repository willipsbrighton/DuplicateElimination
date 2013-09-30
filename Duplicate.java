
//Max Waluk
//Java 1
//09/29/2013
//this program inputs five numbers between 10 and 100, inclusive. As each number is read it is displayed only if
//it's not a duplicate.
import java.util.Scanner; //class uses scanner
public class Duplicate {

       public static void main (String args[]) 
       {
              int numbers[] = new int [5]; //array to hold numbers entered by user
              Scanner input = new Scanner(System.in); //scanner object
              int count = 0; //initialize count to zero

              while (count < numbers.length) 
              {
                     System.out.println("Enter number: "); //asks user to enter a number
                     int number = input.nextInt(); //stores number

                     //check range
                     if (number >= 10 && number <= 100) 
                     {
                           boolean a = false; //indicates if number was read already.

                           //compare current number with the numbers in array
                           for (int i = 0; i < count; i++) 
                           {
                                  //if the number duplicate, set a to true
                                  if (number == numbers[i])
                                  {
                                         a = true;
                                         System.out.println(number + " has already been entered");
                                  } //end if
                           } //end for loop

                           if (!a) //add number to array if it is not a duplicate
                           { 
                                  numbers[count] = number;
                                  count ++;
                           } //end if

                     } //end if
                     else 
                     {
                           System.out.println("number must be between 10 and 100");
                     } //end else

                     //display numbers currently in array.
                     for (int i = 0; i < count; i++ ) 
                     {
                           System.out.print(numbers[i] + " ");
                     } //end for loop

                     System.out.println("\n");
              } //end while loop
       } //end main method
} //end class duplicate