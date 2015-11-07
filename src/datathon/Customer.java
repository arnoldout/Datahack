package datathon;

public class Customer {

	private int cust_num;
	private Rent rent;
	private Transaction transaction;
	private Income income;
	private Balance balance;
	private Demographic demographic;

	public Customer() {
		super();
	}

	public Rent getRent() {
		return rent;
	}

	public void setRent(Rent rent) {
		this.rent = rent;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public Income getIncome() {
		return income;
	}

	public void setIncome(Income income) {
		this.income = income;
	}

	public Balance getBalance() {
		return balance;
	}

	public void setBalance(Balance balance) {
		this.balance = balance;
	}

	public Demographic getDemographic() {
		return demographic;
	}

	public void setDemographic(Demographic demographic) {
		this.demographic = demographic;
	}

	public int getCust_num() {
		return cust_num;
	}

	public void setCust_num(int cust_num) {
		this.cust_num = cust_num;
	}
}
