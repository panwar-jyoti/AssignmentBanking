package banking.repo;

import banking.models.Account;

import java.util.HashMap;
import java.util.Map;

public class BankRepository {
    public static Map<Long, Account> accounts = new HashMap<Long, Account>();
}
