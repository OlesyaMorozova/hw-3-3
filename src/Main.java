public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        System.out.println();
        System.out.println("на 12 месяцев:");
        System.out.println((int) service.calculate(9.99, 12, 1_000_000));

        System.out.println();
        System.out.println("на 24 месяца:");
        System.out.println((int) service.calculate(9.99, 24, 1_000_000));

        System.out.println();
        System.out.println("на 36 месяцев:");
        System.out.println((int) service.calculate(9.99, 36, 1_000_000));
    }
}
