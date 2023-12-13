package banking;

import banking.models.Account;
import banking.models.AccountInfo;
import banking.models.Address;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BankingSimulation {
//    static List<Account> accounts = new ArrayList<>();
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println();
//    }
//
//    public static void runSimulation(Scanner scanner){
//        System.out.println("Welcome to XYZ bank! Please input number for operation you want to perform");
//        System.out.println("1 to create a new Account");
//        System.out.println("2 to get balance");
//        System.out.println("3 to deposit");
//        System.out.println("4 to withdraw");
//        System.out.println("5 to a find all accounts with zero balance");
//        System.out.println("6 to check if KYC is done");
//        System.out.println("7 for adding levyCharge");
//        switch (scanner.nextInt()){
//            case 1:
//                addAccount(scanner);
//                break;
//            case 2:
//                getAccountBalance(scanner);
//                break;
//            case 3:
//                depositMoney(scanner);
//                break;
//            case 4:
//                withdrawMoney(scanner);
//                break;
//            case 5:
//                accountsWithZeroBalance();
//                break;
//            case 6:
//                checkForKYC(scanner);
//                break;
//            case 7:
//                addLevyCharge();
//                break;
//            default:
//                System.out.println("Invalid operation..");
//        }
//    }
//
//    private static void addLevyCharge() {
//    }
//
//    private static void checkForKYC(Scanner scanner) {
//    }
//
//    private static void withdrawMoney(Scanner scanner) {
//    }
//
//    private static void depositMoney(Scanner scanner) {
//        System.out.println("Enter your account number :");
//        long accNo;
//        accNo = scanner.nextLong();
//        System.out.println("Enter amount you want to deposit :");
//        BigDecimal amt;
//        amt = scanner.nextBigDecimal();
//
//    }
//
//    private static void getAccountBalance(Scanner scanner) {
//        System.out.println("Enter your account number :");
//        long accNo;
//        accNo = scanner.nextLong();
//        BigDecimal balance = accounts.stream().filter(account -> account.accountInfo.accNo == accNo).findFirst().get().balance;
//        System.out.println("Your account balance is "+balance);
//    }
//
//    public static void addAccount(Scanner scanner){
//        String accountHolder, city, state, pin, add, aadhar, phone;
//        Boolean kyc=false;
//        System.out.println("Enter account holder name :");
//        accountHolder = scanner.nextLine();
//        System.out.println("Enter account holder address :");
//        add = scanner.nextLine();
//        System.out.println("Enter account holder city :");
//        city = scanner.nextLine();
//        System.out.println("Enter account holder state :");
//        state = scanner.nextLine();
//        System.out.println("Enter account holder PIN Code :");
//        pin = scanner.nextLine();
//        System.out.println("Enter account holder  Phone number:");
//        phone = scanner.nextLine();
//        System.out.println("Do you have Aadhar card (y/n) :");
//        if(scanner.nextLine().equalsIgnoreCase("y")){
//            System.out.println("Enter account holder Aadhar Card Number :");
//            aadhar = scanner.nextLine();
//        }
//        else
//            aadhar="";
//        System.out.println("Creating your account...");
//
//        accounts.add(new Account(new AccountInfo(accountHolder, LocalDate.now()), aadhar, phone, new Address(city, state, add, pin)));
//
//        System.out.println("Successfully created your account!");
//    }
//
//    public static List<Account> accountsWithZeroBalance(){
//        return accounts.stream().filter(account -> account.getBalance().compareTo(BigDecimal.ZERO)==0).collect(Collectors.toList());
//    }
}
