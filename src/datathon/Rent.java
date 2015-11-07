package datathon;

import java.util.Date;

public class Rent {
	private Date epoch;
	private float transAmount;
	public Rent(Date epoch, float transAmount) {
		super();
		this.epoch = epoch;
		this.transAmount = transAmount;
	}
	public Date getEpoch() {
		return epoch;
	}
	public void setEpoch(Date epoch) {
		this.epoch = epoch;
	}
	public float getTransAmount() {
		return transAmount;
	}
	public void setTransAmount(float transAmount) {
		this.transAmount = transAmount;
	}
}
