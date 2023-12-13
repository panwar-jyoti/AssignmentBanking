package banking.utils;

import java.util.concurrent.atomic.AtomicLong;

public class AccountNumberGeneratorUtility {
    public static AtomicLong number=new AtomicLong(1);

    public static long getNewAccountNumber(){
        return number.incrementAndGet();
    }
}
