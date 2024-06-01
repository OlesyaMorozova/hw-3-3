public class CreditPaymentService {
    public double calculate(double percent, int term, int sum) {
        double monthlyRate = percent / 12 / 100;
        double result = sum * (monthlyRate * Math.pow(monthlyRate + 1, term) / (Math.pow(monthlyRate + 1, term) - 1));
        return result;
    }
}
