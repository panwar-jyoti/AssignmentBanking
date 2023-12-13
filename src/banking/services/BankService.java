package banking.services;

import banking.models.Account;
import banking.models.AccountInfo;
import banking.models.Address;
import banking.repo.BankRepository;
import banking.utils.AccountNumberGeneratorUtility;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class BankService {

    public List<Account> checkForKYC(long acc) {
        return BankRepository.accounts.values().stream().filter(account -> !account.isKYCDone()).toList();
    }

    public void withdrawMoney(long acc, BigDecimal amt) {
        BankRepository.accounts.get(acc).withdraw(amt);
    }

    public void depositMoney(long acc, BigDecimal amt) {
        BankRepository.accounts.get(acc).deposit(amt);
    }

    public BigDecimal getAccountBalance(long accNo) {
        return BankRepository.accounts.get(accNo).getBalance();
    }

    public void addAccount(String accountHolder, String city, String state, String pin, String add, String aadhar, String phone){
        BankRepository.accounts.put(AccountNumberGeneratorUtility.number.get(), new Account(new AccountInfo(accountHolder, LocalDate.now()), aadhar, phone, new Address(city, state, add, pin)));
        System.out.println("Successfully created your account!");
    }

    public void accountsWithZeroBalance(){
        BankRepository.accounts.values().stream().filter(account -> account.getBalance().compareTo(BigDecimal.ZERO)==0).toList().forEach(System.out::println);
    }
}
