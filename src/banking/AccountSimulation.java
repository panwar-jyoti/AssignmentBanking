package banking;

import java.math.BigDecimal;

public class AccountSimulation {
    public static void main(String[] args) {

        BankManager bm = new BankManager();
        bm.addAccount("adf", "Hisar", "Haryana", "124242", "gcgan line", "", "05235225");
        bm.addAccount("afgbsf", "Hisar", "Haryana", "124242", "gcgan line", "", "05235225");
        bm.addAccount("gsf", "Hisar", "Haryana", "124242", "gcgan line", "74577", "05235225");
        bm.addAccount("gaggaf", "Hisar", "Haryana", "124242", "gcgan line", "74577", "05235225");

        bm.depositMoney(1, BigDecimal.valueOf(100));
        bm.depositMoney(2, BigDecimal.valueOf(50));
        bm.depositMoney(3, BigDecimal.valueOf(150));

        bm.withdrawMoney(1, BigDecimal.valueOf(30));
        bm.withdrawMoney(1, BigDecimal.valueOf(10));
        bm.withdrawMoney(2, BigDecimal.valueOf(30));
        bm.withdrawMoney(3, BigDecimal.valueOf(70));


        assert bm.getAccountBalance(1).equals(BigDecimal.valueOf(20));
        assert bm.getAccountBalance(2).equals(BigDecimal.valueOf(20));
        assert bm.getAccountBalance(3).equals(BigDecimal.valueOf(80));
    }
}