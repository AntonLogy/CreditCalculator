public class CreditPaymentService {
    public double calculate(int creditsumm, double percent, int month) {
        double percentm = percent / 12 / 100;// Месячная процентная ставка;
        double percentm2 = percentm + 1; // Процент+1 ( для формулы аннуитета);
        double percentm3 = Math.pow(percentm2, month); // Возведение в степень процента+1 (для формулы аннуитета);
        double annuity = percentm * (percentm3 / (percentm3 - 1)); // Коэффициент аннуитета;
        double payment = creditsumm * annuity; // сумма взноса
        return payment;
    }
}
