package banking.models;

import banking.utils.AccountNumberGeneratorUtility;

import java.time.LocalDate;

public class AccountInfo {
    final long accNo;
    final String name;

    @Override
    public String toString() {
        return "AccountInfo{" +
                "accNo=" + accNo +
                ", name='" + name + '\'' +
                ", dateOfOpening=" + dateOfOpening +
                '}';
    }

    final LocalDate dateOfOpening;

    public AccountInfo(String name, LocalDate dateOfOpening) {
        this.accNo = AccountNumberGeneratorUtility.getNewAccountNumber();
        this.name = name;
        this.dateOfOpening = dateOfOpening;
    }
}
