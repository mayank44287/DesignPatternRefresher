package Behavioral.CoR;

// Concrete handler - income verification
class IncomeVerificationHandler implements LoanHandler {
    private LoanHandler nextHandler;

    @Override
    public boolean handleRequest(LoanApplication application) {
        if (application.getIncome() >= application.getLoanAmount()) {
            System.out.println("Income verified");
            if (nextHandler != null) {
                return nextHandler.handleRequest(application);
            }
            return true; // Approval complete
        } else {
            System.out.println("Insufficient income");
            return false; // Stop further processing
        }
    }

    @Override
    public void setNextHandler(LoanHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}


