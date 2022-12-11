package com.fdmgroup.streamsExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;


public class Runner {

	public static void main(String[] args) {
		BankAccount acct1 = new BankAccount(12345678, 987654, "Mr J Smith", "savings", 1.1, 25362.91);
		BankAccount acct2 = new BankAccount(87654321,234567	,"Ms J Jones","current/checking",0.2,550);
		BankAccount acct3 = new BankAccount(74639572,946284	,"Dr T Williams","savings"	,1.1	,4763.32);
		BankAccount acct4 = new BankAccount(94715453,987654	,"Ms S Taylor"	,"savings"	,1.1	,10598.01);
		BankAccount acct5 = new BankAccount(16254385,234567	,"Mr P Brown"	,"current/checking"	,0.2,	-195.74);
		BankAccount acct6 = new BankAccount(38776543,946284	,"Ms F Davies"	,"current/checking"	,0.2,	-503.47);
		BankAccount acct7 = new BankAccount(87609802,987654	,"Mr B Wilson"	,"savings"	,1.1	,2.5);
		BankAccount acct8 = new BankAccount(56483769,234567	,"Dr E Evans"	,"current/checking"	,0.2	,-947.72);
		
		
		System.out.println("=======================COUNTING THE NUMBER OF CURRENT/CHECKING==========================================================");
		
		List<BankAccount> accountslist = new ArrayList<>(Arrays.asList(acct1,acct2,acct3,acct4,acct5,acct6,acct7,acct8));
		
		
		Long numberOfCurrentAccount = accountslist.stream().filter(account -> account.getAccountType().equals("current/checking")).count();
		
		System.out.println(numberOfCurrentAccount);
		
		
		System.out.println("=======================COUNTING THE NUMBER OF ACCOUNTS OVERDRAWN==========================================================");
		
		System.out.println(accountslist.stream().filter(account -> account.getBalance() < 0).count());
		
		System.out.println("=======================HIGHEST ACCOUNT BALANCE==========================================================");
	
		OptionalDouble highestAccount = accountslist.stream().mapToDouble(account -> account.getBalance()).max();
		
		if(highestAccount.isPresent()) {
			System.out.println(highestAccount);
				
		}else {
			System.out.println("No Highest amount Found");
				
		}
		
		System.out.println("=======================AVERAGE ACCOUNT BALANCE==========================================================");
		
		OptionalDouble averageAccount = accountslist.stream().mapToDouble(account -> account.getBalance()).average();
		
		System.out.println(averageAccount);
		
		
		System.out.println("=======================AVERAGE ACCOUNT BALANCE in Credit==========================================================");
		
		
		OptionalDouble averageInCredit =  accountslist.stream().filter(account -> account.getBalance()< 0).mapToDouble(account -> account.getBalance()).average();
		
		
		System.out.println(averageInCredit );
		
		System.out.println("=======================Sum of All Overdrafts==========================================================");
		
		double sumInCredit = accountslist.stream().filter(account -> account.getBalance()< 0).mapToDouble(account -> account.getBalance()).sum();
		
		
		System.out.println(sumInCredit);
		
		
		System.out.println("=======================Total interest Due==========================================================");
		
		List<String> accountsOverDrawn = accountslist.stream().filter(account -> account.getBalance() < 0).map(account -> account.getAccountHolder()).collect(Collectors.toList());
		for(String s : accountsOverDrawn) {
			System.out.println(s);
		}
		
		
		accountslist.stream().filter(a -> a.getAccountType().equals("savings")).
				forEach(a -> a.setInterestRate(1.3));
		
		accountslist.stream().filter(a -> a.getBankCode() == (234567)).forEach(a -> a.setBankCode(123456));
		
	
		for(BankAccount a : accountslist) {
			System.out.println(a);
		}
		
		System.out.println("=======================987654==========================================================");
		
		accountslist.stream().filter(a -> a.getBankCode() == 987654).forEach(a -> System.out.println(a.getAccountHolder() + a.getBankCode()));
		
		System.out.println("=======================DR==========================================================");
		
		accountslist.stream().filter(a -> a.getAccountHolder().startsWith("Dr")).forEach(a -> System.out.println(a.getAccountHolder()));
	
		System.out.println("=======================reduce=========================================================");
		
	
		Optional<BankAccount> maxBalance =accountslist.stream().reduce((a1,a2) -> a1.getBalance() > a2.getBalance() ? a1:a2);
		
		System.out.println(maxBalance);
	
	
	
		System.out.println("=======================Lowest balacne for code 987654======================================================");
	
		Optional<BankAccount> lowestAcoount = accountslist.stream().filter(a -> a.getBankCode() == 987654).reduce((a1,a2) -> a1.getBalance() < a2.getBalance() ? a1:a2);
	
		System.out.println(lowestAcoount);
	
	
	
	
	
	}

}
