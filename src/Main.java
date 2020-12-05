public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int balanceRefil = 1500;
        if (balanceRefil > 1000) {
            int bonus = balanceRefil / 100;
            balance = balance + balanceRefil + bonus;
        } else {
            balance = balance + balanceRefil;
        }
        System.out.println(balance);
    }
}
