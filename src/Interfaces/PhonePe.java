package Interfaces;

public class PhonePe {
    public static void main(String[] args) {
        BankApi bankApi = new YesBankApi();

        bankApi.checkBalance();
        bankApi.depositMoney("432244",540);
        bankApi.checkBalance();
        bankApi.transferMoney("534323","432244",22);
    }
}
