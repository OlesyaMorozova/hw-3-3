public class CreditPaymentService {
    public double calculate(double percent, int term, int sum) {
        double d = percent / term / 100;
        double result = sum * (d * Math.pow(d + 1, term) / (Math.pow(d + 1, term) - 1));
        return result;
    }
}
