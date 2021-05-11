public class Main {
    public static void main(String[] args) {
        int InitialClientBalance = 2_000_000_000;
        int BalanceTopUp = 500_000_000;
        int CurrentBalance = InitialClientBalance + BalanceTopUp;
        System.out.println(CurrentBalance);
    }
}