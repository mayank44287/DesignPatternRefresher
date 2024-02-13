package Behavioral.CoR;


// Concrete handler - credit check

class CreditCheckHandler implements LoanHandler {
    private LoanHandler nextHandler;

    @Override
    public boolean handleRequest(LoanApplication application) {
        // Perform credit check logic
        if (// ... credit check passed) {
        System.out.println("Credit check passed");
        if (nextHandler != null) {
            return nextHandler.handleRequest(application);
        }
        return true; // Approval complete
    } else {
        System.out.println("Credit check failed");
        return false; // Stop further processing
    }
}

    @Override
    public void setNextHandler(LoanHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}

