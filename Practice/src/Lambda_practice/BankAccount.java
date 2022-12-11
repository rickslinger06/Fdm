package Lambda_practice;

public class BankAccount {
	
	int accountNumber;
	int bankCode;
	String accountHolder;
	String accountType;
	double interestRate;
	double balance;
	public BankAccount(int accountNumber, int bankCode, String accountHolder, String accountType, double interestRate,
			double balance) {
		super();
		this.accountNumber = accountNumber;
		this.bankCode = bankCode;
		this.accountHolder = accountHolder;
		this.accountType = accountType;
		this.interestRate = interestRate;
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBankCode() {
		return bankCode;
	}
	public void setBankCode(int bankCode) {
		this.bankCode = bankCode;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountHolder == null) ? 0 : accountHolder.hashCode());
		result = prime * result + accountNumber;
		result = prime * result + ((accountType == null) ? 0 : accountType.hashCode());
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + bankCode;
		temp = Double.doubleToLongBits(interestRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if (accountHolder == null) {
			if (other.accountHolder != null)
				return false;
		} else if (!accountHolder.equals(other.accountHolder))
			return false;
		if (accountNumber != other.accountNumber)
			return false;
		if (accountType == null) {
			if (other.accountType != null)
				return false;
		} else if (!accountType.equals(other.accountType))
			return false;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (bankCode != other.bankCode)
			return false;
		if (Double.doubleToLongBits(interestRate) != Double.doubleToLongBits(other.interestRate))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Trainee [accountNumber=" + accountNumber + ", bankCode=" + bankCode + ", accountHolder=" + accountHolder
				+ ", accountType=" + accountType + ", interestRate=" + interestRate + ", balance=" + balance + "]";
	}
	
	
	
	

}
