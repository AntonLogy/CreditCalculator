public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int creditsumm = 1_000_000;
        double percent = 99.9;
        int month12 = 12;
        int month24 = 24;
        int month36 = 36;


        double payment12 = service.calculate(creditsumm, percent, month12);
        int result1 = (int)payment12; // За 1 год

        double payment24 = service.calculate(creditsumm, percent, month24);
        int result2 = (int)payment24;// За 2 года


        double payment36 = service.calculate(creditsumm, percent, month36);
        int result3 = (int)payment36;// За 3 года

        System.out.println("Ежемесячный платеж " + result1);
        System.out.println("Ежемесячный платеж " + result2);
        System.out.println("Ежемесячный платеж " + result3);
    }
}
