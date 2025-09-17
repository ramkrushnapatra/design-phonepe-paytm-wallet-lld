import model.User;
import model.Wallet;
import service.WalletInterface;

public class WalletApp {
    public static void main(String[]args){
        User user1 = new User(1,"ram","raqm@yopmail.com");
        Wallet wallet1 = new Wallet(1,0);
        WalletInterface walletInterface = WalletInterface.getInstance();
        walletInterface.createWallet(wallet1,user1);

        User user2 = new User(2,"ram1","raq1m@yopmail.com");
        Wallet wallet2 = new Wallet(2,0);
        walletInterface.createWallet(wallet2,user2);


        walletInterface.addMoney(user1,10);
        walletInterface.addMoney(user2,10);

        walletInterface.getTransactionHistory(user1);
        walletInterface.getTransactionHistory(user2);

        walletInterface.transferAmount(10,user1,user2);
        walletInterface.checkAmount(user1);
        walletInterface.checkAmount(user2);

        walletInterface.getTransactionHistory(user1);
        walletInterface.getTransactionHistory(user2);

    }
}
