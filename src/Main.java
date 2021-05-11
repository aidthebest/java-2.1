public class Main {
    public static void main(String[] args) {
        int initial_client_balance = 2_000_000_000;
        int balance_top_up = 500_000_000;
        int current_balance = initial_client_balance + balance_top_up;
        System.out.println(current_balance);
    }
}