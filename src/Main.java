//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CheckingAccount checking = new CheckingAccount("CHK221", 2000.0, 500.0);
        SavingsAccount savings = new SavingsAccount("SAV201", 3000.0, 0.03);
        COD cod = new COD("COD301", 6000.0, 12);

        System.out.println("Compte courant : " + checking.account + ", Solde : " + checking.balance + ", Limite : " + checking.limit);
        System.out.println("Compte épargne : " + savings.account + ", Solde : " + savings.balance + ", Taux : " + savings.interestRate);
        System.out.println("Certificat dépôt : " + cod.account + ", Solde : " + cod.balance + ", Durée : " + cod.durationMois + " mois");
    }
}
