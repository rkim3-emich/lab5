
/**
 * Lab to demonstrate types of loops.
 *
 * @author (Ryan Kim)
 * @version (3-6-19)
 */
import java.util.Scanner;
public class Loops
{
    public static void main(String[] args) {
        //Print header
        System.out.println("Programmer:   Ryan Kim");
        System.out.println("Course:       COSC 111, Winter 2019");
        System.out.println("Lab#:         5");
        System.out.println("Due date:     March 6, 2019\n");
        String answer;
        do {
        //Declare scanner and take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a whole number: ");
        int userInput = sc.nextInt();
        
        //check if user input is even or odd
        if (userInput % 2 == 0)
            System.out.println(userInput + " is even\n");
        else
            System.out.println(userInput + " is odd\n");
            
        //Print numbers from 1 to userInput
        System.out.println("Numbers from 1 through " + userInput + " are:");
        for (int i = 1; i <= userInput; i++)
            System.out.print(i + "\t");
        
        //output square of odd numbers from 1 through userInput
        int i = 0;
        System.out.println("\n\nSquare of odd numbers from 1 through " + userInput + " are:");
        while(i <= userInput) {
            if (i % 2 != 0)
                System.out.print((i*i) + "\t");
            i++;
            }
        
        //Ouput sum of even numbers from 1 through userInput
        int sum = 0;
        i = 1;
        while(i <= userInput){
            if (i % 2 == 0)
                sum += i;
            i++;
            }
        System.out.println("\n\nSum of even numbers from 1 through " + userInput + " is:");
        System.out.println(sum);
        
        //output numbers 1 through userInput with 5 numbers on each line
        System.out.println("\nNumbers from 1 through " + userInput + " (5 numbers per line)");
        int count = 1;
        for(int x = 1; x <= userInput; x++) {
            if (count <= 5) {
                System.out.print(x + "\t");
                count++;
            }
            else {
                System.out.println();
                System.out.print(x + "\t");
                count = 2;
            }
        }
        System.out.print("\n\nDo it again, yes (or no)?");
        answer = sc.next();
        System.out.println();
        } while (answer.equalsIgnoreCase("yes"));
    }
}
/*
Programmer:   Ryan Kim
Course:       COSC 111, Winter 2019
Lab#:         5
Due date:     March 6, 2019

Enter a whole number: 12
12 is even

Numbers from 1 through 12 are:
1	2	3	4	5	6	7	8	9	10	11	12	

Square of odd numbers from 1 through 12 are:
1	9	25	49	81	121	

Sum of even numbers from 1 through 12 is:
42

Numbers from 1 through 12 (5 numbers per line)
1	2	3	4	5	
6	7	8	9	10	
11	12	

Do it again, yes (or no)?YES

Enter a whole number: 9
9 is odd

Numbers from 1 through 9 are:
1	2	3	4	5	6	7	8	9	

Square of odd numbers from 1 through 9 are:
1	9	25	49	81	

Sum of even numbers from 1 through 9 is:
20

Numbers from 1 through 9 (5 numbers per line)
1	2	3	4	5	
6	7	8	9	

Do it again, yes (or no)?no
 */
