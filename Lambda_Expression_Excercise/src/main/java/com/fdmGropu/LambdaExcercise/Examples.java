package com.fdmGropu.LambdaExcercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Examples {

	public static void main(String[] args) {
		
	
		BankAccount acct1 = new BankAccount(12345678, 987654, "Mr J Smith", "savings", 1.1, 25362.91);
		BankAccount acct2 = new BankAccount(87654321,234567	,"Ms J Jones","current/checking",0.2,550);
		BankAccount acct3 = new BankAccount(74639572,946284	,"Dr T Williams","savings"	,1.1	,4763.32);
		BankAccount acct4 = new BankAccount(94715453,987654	,"Ms S Taylor"	,"savings"	,1.1	,10598.01);
		BankAccount acct5 = new BankAccount(16254385,234567	,"Mr P Brown"	,"current/checking"	,0.2,	-195.74);
		BankAccount acct6 = new BankAccount(38776543,946284	,"Ms F Davies"	,"current/checking"	,0.2,	-503.47);
		BankAccount acct7 = new BankAccount(87609802,987654	,"Mr B Wilson"	,"savings"	,1.1	,2.50);
		BankAccount acct8 = new BankAccount(56483769,234567	,"Dr E Evans"	,"current/checking"	,0.2	,-947.72);
		
		
		Function<BankAccount, String> accountNameAndBalance = account -> account.getAccountHolder() + ": " + account.getBalance();
		System.out.println(accountNameAndBalance.apply(acct3));
		
		Function<BankAccount, Double> interestRate = account -> (account.getBalance() * account.getInterestRate())/100;
		System.out.println(interestRate.apply(acct2));
		
		
		Function<BankAccount, Double> overdrawnAccount = account -> account.getBalance() < 0 ? 0.0 :1.1;
		System.out.println(overdrawnAccount.apply(acct8));
		
		
		Consumer<BankAccount> printName = account -> System.out.println(account.getAccountHolder());
	
		
		Predicate<BankAccount> currentCheckingCheck = account -> account.getAccountType().equals("current/checking");
		System.out.println(currentCheckingCheck.test(acct6));
		
		
		Predicate<BankAccount> overDrawnAccountCheck = account -> account.getBalance() < 0;
		System.out.println(overDrawnAccountCheck.test(acct7));
		
		BinaryOperator<BankAccount> gethighestBalance = (account1,account2) -> account1.getBalance() > account2.getBalance() ? account1:account2;
		BankAccount highestBalance = gethighestBalance.apply(acct3, acct4);
		printName.accept(highestBalance);
		
		Consumer<BankAccount> bankChargeForallAccounts = account -> System.out.println(account.getBalance() -10);
		bankChargeForallAccounts.accept(acct6);
		
		BiConsumer<BankAccount, Integer> deductvalueof100 = (account,amount) -> System.out.println(account.getBalance() - amount);
		deductvalueof100.accept(acct5, 50);
		
		
		//===============================Lambda adding to list=====For each loops====
	
		List<BankAccount> accountslist = new ArrayList<>(Arrays.asList(acct1,acct2,acct3,acct4,acct5,acct6,acct7,acct8));
		
		accountslist.forEach(account -> System.out.println("Name: " + account.getAccountHolder()+ " Account number: " + (account.getBalance() - 10)));
		
		accountslist.removeIf(account -> account.getBalance() < 550);
		
		accountslist.forEach(account -> System.out.println(account.getAccountHolder()  +"  "+ account.getBalance()));
		
		
		//==============================lambda comparator========================
		System.out.println("====================Sorting by Balance============================");
		
		
		Comparator<BankAccount> sortingBalance = (a1,a2) -> a1.getBalance() > a2.getBalance() ? 1:-1;
	
		accountslist.sort(sortingBalance);
		
		accountslist.forEach(account -> System.out.println("Name: " + account.getAccountHolder()+ " Account #: " + account.getBalance() ));
		
		System.out.println("====================Sorting by Type============================");
		
		//=============Sorting by acoount type================
		Comparator<BankAccount> sortingByType = (a1,a2) -> a1.getAccountType().compareTo(a2.getAccountType());
		accountslist.forEach(account -> System.out.println("Name: " + account.getAccountHolder()+ " Account Balance: " + account.getBalance()+ "number : "  +account.getAccountNumber()+" Type: " + account.getAccountType()));
		
		accountslist.sort(sortingByType);
		
		//===========sorting by account number=========
		System.out.println("====================Sorting by Account Number============================");
		
		Comparator<BankAccount> SortingByAccount = (a1,a2) -> a1.getAccountNumber() > a2.getAccountNumber() ? 1:-1;
		accountslist.sort(SortingByAccount);
		accountslist.forEach(account -> System.out.println("Name: " + account.getAccountHolder()+ " Account Balance: " + account.getBalance()+ "number : "  +account.getAccountNumber()));
	
	
		System.out.println("====================Combining compararator============================");
	
		Comparator<BankAccount> sortbyTypeThenBalance = sortingByType.thenComparing(sortingBalance);
		accountslist.sort(sortbyTypeThenBalance);
		accountslist.forEach(account -> System.out.println("Name: " + account.getAccountHolder()+ " Account Balance: " + account.getBalance()+ "number : "  +account.getAccountNumber()+" Type: " + account.getAccountType() +" code: " + account.getBankCode()));
		
	
		System.out.println("====================HashMap merge============================");
	
		
		Map<Integer,Integer> numberOfbankCodes = new HashMap<>();
		for(BankAccount account : accountslist) {
			int code = account.getBankCode();
			
			numberOfbankCodes.merge(code, 1, (currentcount,add1) -> currentcount + add1);
	
			
		}
		System.out.println(numberOfbankCodes);
		
		Map<Integer,Double> sumofTheAccountsBalances = new HashMap<>();
	
		for(BankAccount account : accountslist) {
			int key = account.getBankCode();
			double value = account.getBalance();
			
			
			sumofTheAccountsBalances.merge(key,value , (currentAmount , addAmount) -> currentAmount + addAmount);

			System.out.println(sumofTheAccountsBalances);
		}
	
	
	
	
	
	
	}

}
