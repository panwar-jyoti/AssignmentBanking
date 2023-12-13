package banking.services;

import banking.models.Account;
import banking.models.Transaction;
import banking.repo.TransactionRepo;
import banking.utils.TransactionComment;
import banking.utils.TransactionType;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransactionService {
    private static final BigDecimal ROI = BigDecimal.valueOf(6);
    public void addInterest(Account acc){
        TransactionRepo.transactions.add(new Transaction(acc.getAccountNumber(), acc.getBalance().multiply(ROI).divide(BigDecimal.valueOf(36500)), LocalDateTime.now(), TransactionType.CREDIT, acc.getBalance(), TransactionComment.Interest));
    }

    public void addDeposit(long accNo, BigDecimal balance, BigDecimal amount){
        TransactionRepo.transactions.add(new Transaction(accNo, amount, LocalDateTime.now(), TransactionType.CREDIT, balance, TransactionComment.Interest));
    }

    public void addWithdrawal(long accNo, BigDecimal balance, BigDecimal amount){
        TransactionRepo.transactions.add(new Transaction(accNo, amount, LocalDateTime.now(), TransactionType.DEBIT, balance, TransactionComment.Interest));
    }
}