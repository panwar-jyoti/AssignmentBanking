package banking.utils;

import java.util.concurrent.atomic.AtomicLong;

public class TransactionNumberGeneratorUtil {
    public static AtomicLong number=new AtomicLong(1);

    public static long getNewTransactionNumber(){
        return number.incrementAndGet();
    }
}
