public class Main {
    public static void main(String[] args){
        //instructions were a bit odd
        LoanEligibility a1 = new LoanEligibility("Tom", "123-111-1234", false, 650);
        LoanEligibility a2 = new LoanEligibility("Tommy", "222-222-2223", false, 900);
        LoanEligibility a3 = new LoanEligibility("Timmy", "333-123-1234", false, 599);
        System.out.println(a1.applyForLoan() + a2.applyForLoan() + a3.applyForLoan());
    }
}
