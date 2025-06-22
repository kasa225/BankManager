public class COD extends BankAccount {
    public int durationMois;

    public COD(String account, double balance, int durationMois) {
        super(account, balance);
        this.durationMois = durationMois;
    }
}
