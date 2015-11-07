package datathon;

import java.util.Date;

public class Income {
	
	public Income(float income, Date payday) {
		super();
		this.income = income;
		this.payday = payday;
	}
	private float income;
	private Date payday;
	public float getIncome() {
		return income;
	}
	public void setIncome(float income) {
		this.income = income;
	}
	public Date getPayday() {
		return payday;
	}
	public void setPayday(Date payday) {
		this.payday = payday;
	}
}
