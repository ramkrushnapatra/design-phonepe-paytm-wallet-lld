package service;

import enums.TransactionStatus;
import enums.TransactionType;
import model.Transaction;
import model.TransactionHistory;
import model.User;
import model.Wallet;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class WalletInterface {
    private static WalletInterface instance;
    private Map<Integer, Wallet>userToWallet;
    private TransactionHistory transactionHistory;

    private WalletInterface() {
        this.userToWallet = new HashMap<>();
        this.transactionHistory = new TransactionHistory();
    }

    public static WalletInterface getInstance() {
        if (instance == null) {
            instance = new WalletInterface();
        }
        return instance;
    }



    public synchronized void createWallet(Wallet wallet, User user){
        if(this.userToWallet.containsKey(user.getUserId())){
            System.out.println("user already created wallet");
            return;
        }

        this.userToWallet.put(user.getUserId(),wallet);
        System.out.println("Wallet Successfully Created");
    }

    public synchronized void  addMoney(User user,double amount){
      Wallet wallet = this.userToWallet.get(user.getUserId());
      wallet.setWalletAmount(wallet.getWalletAmount() + amount);
      System.out.println("Amount successfully add to your wallet");
    }

    public synchronized void transferAmount(double amount,User sender,User receiver){
        Wallet senderWallet = this.userToWallet.get(sender.getUserId());
        if(amount > senderWallet.getWalletAmount()){
            System.out.println("Your Wallet have less amount ,please fund more amount");
            return;
        }
        senderWallet.setWalletAmount(senderWallet.getWalletAmount() - amount);
        Random random = new Random();
        Integer id = random.nextInt();
        Transaction transaction = new Transaction(id, senderWallet.getWalletId(), sender.getUserId(), TransactionType.SEND_MONEY,TransactionStatus.SUCCESS,amount, new Date());
        this.transactionHistory.addTransactionHistory(transaction);


        Wallet receiverWallet = this.userToWallet.get(receiver.getUserId());
        receiverWallet.setWalletAmount(receiverWallet.getWalletAmount() + amount);
        Integer id1 = random.nextInt();
        Transaction transaction1 = new Transaction(id1, receiverWallet.getWalletId(), receiver.getUserId(), TransactionType.RECEIVED_MONEY,TransactionStatus.SUCCESS,amount,new Date());
        this.transactionHistory.addTransactionHistory(transaction1);

        System.out.println("money transfer successfully");
    }

    public void getTransactionHistory(User user){
        this.transactionHistory.getTransactionHistory(user.getUserId());
    }

    public void checkAmount(User user){
        double amount = this.userToWallet.get(user.getUserId()).getWalletAmount();
        System.out.println("amount is %d"+amount);
    }
}
