package Behavioral.CoR;

class FinalApprovalHandler implements LoanHandler {

    @Override
    public boolean handleRequest(LoanApplication application) {
        // Perform final approval logic
        if (// ... approve based on additional criteria) {
        System.out.println("Loan approved");
        return true; // Final approval
    } else {
        System.out.println("Loan declined");
        return false; // No further processing
    }
}

    @Override
    public void setNextHandler(LoanHandler nextHandler) {
        // Final handler doesn't require a next handler
    }
}
