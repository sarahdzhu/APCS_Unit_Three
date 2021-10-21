import java.util.Scanner;
public class AddToPositiveOrNegativeSum {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        // declare and instantiate a Scanner variable and object
       int positiveSum=0;
       int negativeSum=0;



        // declare and initialize variables for a positive and negative sum

        for (int i = 1; i <= 10; i++) {
            /* in this block, allow the user to input a number and add the number to the appropriate sum */
            System.out.print("Enter a number: ");
            int num= scan.nextInt();

        if (num>0) {
            positiveSum+=num;
        }
        if (num<0){
            negativeSum+=num;
        }


        
        } // end of for loop


        System.out.println("The sum of the positive numbers is "+ positiveSum);
        System.out.println("The sum of the negative numbers is "+ negativeSum);


            // output the sums. Make sure the format matches the sample

    }
}

