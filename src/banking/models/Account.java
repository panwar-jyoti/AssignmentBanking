package banking.models;

import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicReference;

public class Account {
    private static final BigDecimal LEVY_CHARGES = BigDecimal.valueOf(500l);
    AccountInfo accountInfo;
    AtomicReference<BigDecimal> balance = new AtomicReference<>(BigDecimal.ZERO);

    public long getAccountNumber() {
        return accountInfo.accNo;
    }

    String aadhar, phone;
    Address add;
    @Override
    public String toString() {
        return "Account{" +
                "accountInfo=" + accountInfo +
                ", balance=" + balance +
                ", aadhar='" + aadhar + '\'' +
                ", phone='" + phone + '\'' +
                ", add=" + add +
                '}';
    }

    public Account(AccountInfo accountInfo, String aadhar, String phone, Address add) {
        this.accountInfo = accountInfo;
        this.balance.set(BigDecimal.ZERO);
        this.aadhar = aadhar;
        this.phone = phone;
        this.add = add;
    }
    public BigDecimal getBalance(){
        return balance.get();
    }

    public void setBalance(BigDecimal balance) {
        this.balance.set(balance);
    }

    public void withdraw(BigDecimal amount){
        if(balance.get().compareTo(amount)>=0){
            synchronized (this){
                this.setBalance(balance.get().subtract(amount));
            }
            System.out.println("Remaining balance "+accountInfo.accNo+" "+balance);
        }
        else {
            System.out.println("Insufficient balance");
        }
    }

    public void deposit(BigDecimal amount){
        synchronized (this){
            this.setBalance(balance.get().add(amount));
        }
        System.out.println("Amount deposited"+accountInfo.accNo);
    }

    public void addLevyCharge(){
        this.setBalance(balance.get().subtract(LEVY_CHARGES));
    }

    public boolean isKYCDone(){
        return !aadhar.isBlank();
    }

    public void calculateSavingInterest(){

    }
    //add an account
    //get balance
    //deposit
    //withdraw
    //find all accounts with 0 balance
    // isKYCdone

    //design above keeping best practice in mind keeping model, service, db layer, separate, keep thread safety in mind
}
