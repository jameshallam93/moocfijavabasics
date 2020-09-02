
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account MattsAccount = new Account("Matthews account", 1000);
        Account JamesAccount = new Account("My account", 0);
        MattsAccount.withdrawal(100.00);
        JamesAccount.deposit(100.00);
        System.out.println(MattsAccount);
        System.out.println(JamesAccount);
    }
}
