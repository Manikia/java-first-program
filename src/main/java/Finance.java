import com.h2.BestLoanRates;
import java.util.Map;

public class Finance {
    public final static String BEST_LOAN_RATES = "bestLoanRates";
    public final static String SAVINGS_CALCULATOR = "savingsCalculator";
    public final static String MORTGAGE_CALCULATOR = "mortgageCalculator";

    public final static Map<String, String> commandsToUsage = Map.of(BEST_LOAN_RATES, "usage: bestLoanRates",
            SAVINGS_CALCULATOR, "usage: savingsCalculator <credits separated by ','> <debits separated by ','>",
            MORTGAGE_CALCULATOR, "usage: mortgageCalculator <loanAmount> <termInYears> <annualRate>");

    private static boolean validateCommandArguments(String[] args)
    {
        switch(args[0])
        {
            case "BEST_LOAN_RATES":
            {
                if(args.length == 1)
                {
                    return args.length == 1;
                }
                else
                {
                    break;
                }
            }
            case "SAVINGS_CALCULATOR":
            {
                if(args.length == 3)
                {
                    return args.length == 3;
                }
                else
                {
                    break;
                }
            }
            case "MORTGAGE_CALCULATOR":
            {
                if(args.length == 4)
                {
                    return args.length == 4;
                }
                else
                {
                    break;
                }
            }
        }
        return false;
    }

    private static void executeCommand(String command, String[] arguments)
    {
        switch(command)
        {
            case "BEST_LOAN_RATES":
            {
                System.out.println("Finding best loan rates ...");
                //calling another file main method
                BestLoanRates BestLoanRates = new BestLoanRates();
                BestLoanRates.main(arguments);
            }
            case "SAVINGS_CALCULATOR":
            {
                System.out.println("Finding your net savings ...");
            }
            case "MORTGAGE_CALCULATOR":
            {
                System.out.println("Finding your monthly payment ...");
            }
        }
    }


}
