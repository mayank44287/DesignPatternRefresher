package Behavioral.CoR;


// Interface defining request handling
interface LoanHandler {
    boolean handleRequest(LoanApplication application);
    void setNextHandler(LoanHandler nextHandler);
}
