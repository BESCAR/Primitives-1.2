public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int customerAccount = 500;
        int refillAccount = 1000;

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        if (refillAccount < 1000) {
            int totalSum = customerAccount + refillAccount;
            System.out.println(" бонусов нет, на счету " + totalSum + " рублей. ");
        } else {
            if (refillAccount >= 1000) {
                int totalSum = customerAccount + refillAccount;
                int bBonus = refillAccount / 100;
                int aBonus = totalSum + bBonus;
                System.out.println(" бонус составил " + bBonus + ", на счету " + aBonus + " рублей. ");
            }
        }


    }
}
