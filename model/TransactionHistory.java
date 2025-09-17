package model;

import java.util.*;

public class TransactionHistory {
    private Map<Integer, List<Transaction>>transactionHistory;

    public TransactionHistory(){
        this.transactionHistory = new HashMap<>();
    }

    public void addTransactionHistory(Transaction transaction){
        if(this.transactionHistory.containsKey(transaction.getUserId())){
            List<Transaction>transactionList = this.transactionHistory.get(transaction.getUserId());
            transactionList.add(transaction);
            this.transactionHistory.put(transaction.getUserId(),transactionList);
            return;
        }
        List<Transaction>transactions = new ArrayList<>();
        transactions.add(transaction);
        this.transactionHistory.put(transaction.getUserId(), transactions);

    }

    public void getTransactionHistory(Integer userId){
        if(!this.transactionHistory.containsKey(userId)){
            System.out.println("no transaction history present for this user");
            return;
        }

        List<Transaction>transactions = this.transactionHistory.get(userId);
        transactions.sort(Comparator.comparing(Transaction::getTransactionDate));
        for(Transaction transaction:transactions){
            System.out.println(transaction);
        }
    }
}
