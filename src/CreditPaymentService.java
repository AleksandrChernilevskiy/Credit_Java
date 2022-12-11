public class CreditPaymentService {
    public double calculate( int year) {
        double interestRate = 9.99; //Процентная ставка
        int balanceOfTheLoan = 1_000_000; //Остаток суммы кредита
        int interestPeriods = year * 12; //процентные периоды до окончания срока кредита (в месяцах)
        double monthlyInterestRate = interestRate / ( 100 * 12 ); //месячная процентная ставка (рассчитывается как ставка по кредиту /100 *12)
        double result;
        if ( interestPeriods >= 12) {
            result = balanceOfTheLoan * ( monthlyInterestRate / ( 1 - Math.pow( (1 + monthlyInterestRate), -interestPeriods) ));
        } else {
            result = 0;
        }
        return result;
    }
}
