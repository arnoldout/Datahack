package datathon;

import java.util.Date;

public class Transaction {

	private Date epoch;
	private String category;
	private String subCategory;
	private float transAmount;
	private String transTyp;
	public Transaction(Date epoch, String category, String subCategory,
			float transAmount, String transTyp) {
		super();
		this.epoch = epoch;
		this.category = category;
		this.subCategory = subCategory;
		this.transAmount = transAmount;
		this.transTyp = transTyp;
	}
	public Date getEpoch() {
		return epoch;
	}
	public void setEpoch(Date epoch) {
		this.epoch = epoch;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	public float getTransAmount() {
		return transAmount;
	}
	public void setTransAmount(float transAmount) {
		this.transAmount = transAmount;
	}
	public String getTransTyp() {
		return transTyp;
	}
	public void setTransTyp(String transTyp) {
		this.transTyp = transTyp;
	}
}
