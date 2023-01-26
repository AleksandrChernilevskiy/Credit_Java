public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int year;
        double monthlyPayment = service.calculate(2, 1_000_000, 9.99 );
        System.out.println("Кредит 1.000.000 рублей");
        System.out.println("Процентная ставка 9.99% годовых");
        System.out.println("Ваш ежемесячный платёж по кредиту " + (int) monthlyPayment + " рублей в месяц.");
    }
}