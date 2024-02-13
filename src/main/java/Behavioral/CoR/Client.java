package Behavioral.CoR;


// Client forming the chain
public class Client {
    public static void main(String[] args) {
        String applicantName = "John Doe";
        double income = 10000;
        double loanAmount = 50000;
        LoanApplication application = new LoanApplication(applicantName,loanAmount,income);

        IncomeVerificationHandler incomeHandler = new IncomeVerificationHandler();
        CreditCheckHandler creditHandler = new CreditCheckHandler();
        FinalApprovalHandler finalHandler = new FinalApprovalHandler();

        incomeHandler.setNextHandler(creditHandler);
        creditHandler.setNextHandler(finalHandler);

        incomeHandler.handleRequest(application); // Trigger chain
    }
}
