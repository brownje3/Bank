public class LoanEligibility {
    static Integer counter = 1001;
    String name;
    String contact;
    Boolean isLoanAllocated;
    Integer customerId;
    Integer creditScore;
    Integer requiredLoanAmount;

    public LoanEligibility(String name, String contact, Boolean isLoanAllocated, Integer creditScore) {
        customerId = counter;
        counter++;
        this.name = name;
        this.contact = contact;
        this.isLoanAllocated = isLoanAllocated;
        this.customerId = customerId;
        this.creditScore = creditScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Boolean getIsLoanAllocated() {
        return isLoanAllocated;
    }

    public void setIsLoanAllocated(Boolean isLoanAllocated) {
        this.isLoanAllocated = isLoanAllocated;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(Integer creditScore) {
        this.creditScore = creditScore;
    }

    public Integer getRequiredLoanAmount() {
        return requiredLoanAmount;
    }

    public void setRequiredLoanAmount(Integer requiredLoanAmount) {
        this.requiredLoanAmount = requiredLoanAmount;
    }

    public Boolean isEligibleForLoan(){
            return (!isLoanAllocated && creditScore >= 600);
    }

    String applyForLoan(){
        if (creditScore >= 600 && isEligibleForLoan()) {
            determineLoanAmount();
            return "Congratulations on your new loan of " + requiredLoanAmount + "\n";
        }

        return "Sorry you already have a loan or your credit score is too " +
                "low. You may not apply for a loan\n";
    }

    void determineLoanAmount(){
       if (creditScore >= 600 && creditScore <= 750)
           setRequiredLoanAmount(300000);
       else if (creditScore >= 751 && creditScore <= 850)
           setRequiredLoanAmount(800000);
       else if (creditScore > 850)
           setRequiredLoanAmount(1500000);
    }
}