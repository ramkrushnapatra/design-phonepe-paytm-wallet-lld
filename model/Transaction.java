package model;

import enums.TransactionStatus;
import enums.TransactionType;

import java.util.Date;

public class Transaction {
    private Integer transactionId;
    private Integer walletId;
    private Integer userId;
    private double amount;
    private TransactionStatus transactionStatus;
    private TransactionType transactionType;
    private Date transactionDate;

    public Transaction(Integer transactionId, Integer walletId, Integer userId, TransactionType transactionType, TransactionStatus transactionStatus, double amount,Date transactiondate) {
        this.transactionId = transactionId;
        this.walletId = walletId;
        this.userId = userId;
        this.transactionType = transactionType;
        this.transactionStatus = transactionStatus;
        this.amount = amount;
        this.transactionDate = transactiondate;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public Integer getWalletId() {
        return walletId;
    }

    public void setWalletId(Integer walletId) {
        this.walletId = walletId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", walletId=" + walletId +
                ", userId=" + userId +
                ", amount=" + amount +
                ", transactionStatus=" + transactionStatus +
                ", transactionType=" + transactionType +
                ", transactionDate=" + transactionDate +
                '}';
    }
}
