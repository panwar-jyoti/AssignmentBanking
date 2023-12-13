package banking.models;

import banking.utils.TransactionComment;
import banking.utils.TransactionNumberGeneratorUtil;
import banking.utils.TransactionType;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {
    long id;

    public long getAccNo() {
        return accNo;
    }

    public double getAmount() {
        return amount.doubleValue();
    }

    public TransactionComment getComment() {
        return comment;
    }

    long accNo;
    BigDecimal amount;
    LocalDateTime dateTimeOfTransaction;
    TransactionType type;
    BigDecimal balanceAsOn;
    TransactionComment comment;
    public Transaction(long accNo, BigDecimal amount, LocalDateTime dateTimeOfTransaction, TransactionType type, BigDecimal balanceAsOn, TransactionComment comment) {
        this.id = TransactionNumberGeneratorUtil.getNewTransactionNumber();
        this.accNo = accNo;
        this.amount = amount;
        this.dateTimeOfTransaction = dateTimeOfTransaction;
        this.type = type;
        this.balanceAsOn = balanceAsOn;
        this.comment = comment;
    }
}