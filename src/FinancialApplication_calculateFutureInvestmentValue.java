import java.util.Scanner;

public class FinancialApplication_calculateFutureInvestmentValue {
    public static void main(String[] args)   {

        /* The task will be performed in three steps
        1) Prompt for user to input investment amount, annual interest and how many years to invest, then set up variables
        2) Calculate results
        3) Display results
         */

        // 1) Prompt, and set up variables
        Scanner input = new Scanner(System.in); // We need a scanner

        System.out.print(
                "Please enter the investment amount: "  // Prompting for user investment amount input
        );
        double investmentAmount = input.nextDouble(); // Declaring and assigning the investment amount variable from user input

        System.out.print(
                "Please enter annual interest rate: "   // Prompting for user annual interest input
        );
        double annualInterestRate = input.nextDouble(); // Declaring and assigning the interest rate, in percent, variable from user input
        double monthlyInterestRate = annualInterestRate / 12; // Converting the annualInterestRate to a monthly interest rate

        System.out.print(
                "Please enter the amount of years to invest: "  // Prompting for user amount of years to invest
        );
        int numberOfYears = input.nextInt();    // Declaring and assigning the number of years variable from user input

        // 2) Calculate results
        double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate/100), (numberOfYears * 12));    // Calculating the future investment value from the user inputs

        // Displaying the result
        System.out.print(
                "The future investment value is: " + futureInvestmentValue
        );
    }
}
