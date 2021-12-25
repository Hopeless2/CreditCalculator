public class Calculator {
    private static double CREDIT_PERCENT_PER_YEAR = 10.00;

    public Calculator() {

    }

    public double calculateMonthlyPayment(double total, int months) {
        return calculateTotalPayment(total, months) / 12;
    }

    public double calculateTotalPayment(double total, int months) {
        return total + (total * months * (CREDIT_PERCENT_PER_YEAR / (12 * 100)));
    }

    public double calculateOverpayment(double total, int months) {
        return calculateTotalPayment(total, months) - total;
    }


}
