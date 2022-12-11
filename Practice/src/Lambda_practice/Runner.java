package Lambda_practice;

import java.util.function.Function;

public class Runner {

	public static void main(String[] args) {


		BankAccount acct1 = new BankAccount(12345678, 987654, "Mr J Smith", "savings", 1.1, 25362.91);
		BankAccount acct2 = new BankAccount(87654321,234567	,"Ms J Jones","current/checking",0.2,550);
		BankAccount acct3 = new BankAccount(74639572,946284	,"Dr T Williams","savings"	,1.1	,4763.32);
		BankAccount acct4 = new BankAccount(94715453,987654	,"Ms S Taylor"	,"savings"	,1.1	,10598.01);
		BankAccount acct5 = new BankAccount(16254385,234567	,"Mr P Brown"	,"current/checking"	,0.2,	-195.74);
		BankAccount acct6 = new BankAccount(38776543,946284	,"Ms F Davies"	,"current/checking"	,0.2,	-503.47);
		BankAccount acct7 = new BankAccount(87609802,987654	,"Mr B Wilson"	,"savings"	,1.1	,2.50);
		BankAccount acct8 = new BankAccount(56483769,234567	,"Dr E Evans"	,"current/checking"	,0.2	,-947.72);
		
		
//		
//		Function<BankAccount, String> cusTomerNameAndBalance = a -> "Name: " + a.getAccountHolder() + " Balance : "+a.getBalance();
//		System.out.println(cusTomerNameAndBalance.apply(acct3));
//		
		
	
		
		System.out.println(acct4.accountHolder + acct4.accountNumber);
	}

}
