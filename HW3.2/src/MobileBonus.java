public class MobileBonus {
    public static void main(String[] args) {
        int payment = 1100;
        int bonus = payment / 100;
        if (payment < 1000) {
            bonus = 0;
        }
        System.out.println(bonus);
    }
}
