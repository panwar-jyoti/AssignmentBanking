package banking;

import banking.models.Account;
import banking.models.Transaction;
import banking.repo.BankRepository;
import banking.repo.TransactionRepo;
import banking.services.BankService;
import banking.services.TransactionService;
import banking.utils.TransactionComment;

import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class BankManager {

    public BankManager() {
        addLevyCharge();
        calculateSavingInterest();
        addSavingInterest();
    }

    private final ScheduledExecutorService scheduler = Executors
            .newScheduledThreadPool(2);
    public void addLevyCharge() {
        final ScheduledFuture<?> taskHandle = scheduler.scheduleAtFixedRate(
                new Runnable() {
                    public void run() {
                        try {
                            System.out.println("In addLevyCharge");
                            BankRepository.accounts.values().stream().filter(account -> account.getBalance().compareTo(BigDecimal.ZERO)==0).toList().forEach(Account::addLevyCharge);
                        }catch(Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                }, 0, 1, TimeUnit.DAYS);
    }

    public void calculateSavingInterest() {
        final ScheduledFuture<?> taskHandle = scheduler.scheduleAtFixedRate(
                new Runnable() {
                    public void run() {
                        try {
                            System.out.println("In calculateSavingInterest");
                            BankRepository.accounts.values().forEach(acc->ts.addInterest(acc));
                        }catch(Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                }, 0, 1, TimeUnit.DAYS);
    }

    public void addSavingInterest() {
        final ScheduledFuture<?> taskHandle = scheduler.scheduleAtFixedRate(
                new Runnable() {
                    public void run() {
                        try {
                            System.out.println("In addSavingInterest");
                            TransactionRepo.transactions.stream()
                                    .filter(transaction -> transaction.getComment() == TransactionComment.Interest)
                                    .collect(Collectors.groupingBy(Transaction::getAccNo, Collectors.summingDouble(Transaction::getAmount)))
                                    .forEach((a, m)->bs.depositMoney(a, BigDecimal.valueOf(m)));
                        }catch(Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                }, 0, 30, TimeUnit.DAYS);
    }

    private BankService bs = new BankService();
    private TransactionService ts = new TransactionService();
    public List<Account> checkForKYC(long acc) {
        return bs.checkForKYC(acc);
    }

    public void withdrawMoney(long acc, BigDecimal amt) {
        bs.withdrawMoney(acc, amt);
        ts.addWithdrawal(acc, getAccountBalance(acc), amt);
    }

    public void depositMoney(long acc, BigDecimal amt) {
        bs.depositMoney(acc, amt);
        ts.addDeposit(acc, getAccountBalance(acc), amt);
    }

    public BigDecimal getAccountBalance(long accNo) {
        return bs.getAccountBalance(accNo);
    }

    public void addAccount(String accountHolder, String city, String state, String pin, String add, String aadhar, String phone){
        bs.addAccount(accountHolder, city, state, pin, add, aadhar, phone);
    }

    public void accountsWithZeroBalance(){
        bs.accountsWithZeroBalance();
    }
}