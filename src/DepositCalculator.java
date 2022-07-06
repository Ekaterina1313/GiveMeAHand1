import java.util.Scanner;
public class DepositCalculator {
    public double calculateComplexPercent(double a, double y, int d) {
        double pay = a * Math.pow((1 + y / 12), 12 * d);
        return round(pay,2);
    }
    public double calculateSimplePercent(double Amount, double yearRate, int depositPeriod) {
        return round(Amount + Amount * yearRate * depositPeriod, 2);
    }
    public double round(double value, int places) {
        double ScaLe = Math.pow(10, places);
        return Math.round(value*ScaLe) / ScaLe;
    }

    void doJob( ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада в рублях:") ;
        int amount = scanner.nextInt();
        System.out.println("Введите срок вклада в годах:") ;
        int period = scanner.nextInt( );
        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        int action = scanner.nextInt();
        double out = 0;
        if (action ==1) {
            out = calculateSimplePercent(amount, 0.06, period);
        } else if (action == 2) {
            out = calculateComplexPercent(amount, 0.06, period);
        }
        System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + out);
    }

    public static void main(String[] args) {

        new DepositCalculator().doJob();
    }




}
