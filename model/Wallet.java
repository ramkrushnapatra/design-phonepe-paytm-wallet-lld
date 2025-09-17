package model;

public class Wallet {
    private Integer walletId;
    private double walletAmount;

    public Wallet(Integer walletId, double walletAmount) {
        this.walletId = walletId;
        this.walletAmount = walletAmount;
    }

    public Integer getWalletId() {
        return walletId;
    }

    public void setWalletId(Integer walletId) {
        this.walletId = walletId;
    }

    public double getWalletAmount() {
        return walletAmount;
    }

    public void setWalletAmount(double walletAmount) {
        this.walletAmount = walletAmount;
    }
}
