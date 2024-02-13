package Behavioral.CoR;

class LoanApplication {
    private String applicantName;
    private double loanAmount;
    private double income;
    // ... other relevant loan application details

    public LoanApplication(String applicantName, double loanAmount, double income) {
        this.applicantName = applicantName;
        this.loanAmount = loanAmount;
        this.income = income;
    }

    // Getters and setters for LoanApplication properties

    public String getApplicantName() {
        return applicantName;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public double getIncome() {
        return income;
    }
}
