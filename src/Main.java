public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int year = 2;
        double monthlyPayment = service.calculate(year);
        System.out.println("Кредит 1.000.000 рублей");
        System.out.println("Процентная ставка 9.99% годовых");
        if ( year == 1) {
            System.out.println("Срок кредита " + year + " год");
        } else {
            System.out.println("Срок кредита " + year + " года");
        }
        System.out.println("Ваш ежемесячный платёж по кредиту " + (int) monthlyPayment + " рублей в месяц.");
    }
}