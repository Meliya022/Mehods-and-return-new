//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
    }
    public class InvestmentApp {

        public static String allocateDeposit(double savingsAccountBalance, double indexFundBalance, double depositAmount) {
            // Check if savings account is over $50,000
            if (savingsAccountBalance > 50000) {
                // Add deposit to index fund
                indexFundBalance += depositAmount;
                return String.format("Index Funds updated. New balance: $%.2f", indexFundBalance);
            } else if (savingsAccountBalance + depositAmount > 50000) {
                // Calculate the amount needed to bring savings to $50,000
                double amountToSavings = 50000 - savingsAccountBalance;
                double amountToIndexFund = depositAmount - amountToSavings;

                // Update balances
                savingsAccountBalance = 50000;
                indexFundBalance += amountToIndexFund;

                return String.format("Savings account updated. New balance: $%.2f.\nIndex Funds updated. New balance: $%.2f",
                        savingsAccountBalance, indexFundBalance);
            } else {
                // Add deposit to savings account
                savingsAccountBalance += depositAmount;
                return String.format("Savings account updated. New balance: $%.2f", savingsAccountBalance);
            }
        }

        public static void main(String[] args) {
            System.out.println(allocateDeposit(45000, 20000, 6000)); // Testing example
        }
    }

}