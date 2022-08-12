
public class Alcohol extends Beverage{
	private boolean isServed;
	private static final double fee = 0.6;
	
	public Alcohol(String name, SIZE size, boolean served) {
		super(name, TYPE.ALCOHOL, size);
		this.setServedOnWeekends(served);
	}
	
	public double calcPrice() {
		double price = 0;
		price += (isServed) ? fee : 0;
		price +=  this.BASE_PRICE + ((SIZE.SMALL == this.getSize()) ? 0 : (SIZE.MEDIUM == this.getSize()) ? this.SIZE_PRICE: this.SIZE_PRICE*2); 
		return price;
	}
	
	public boolean equals(Alcohol alcohol) {
		return (this.getSize() == alcohol.getSize()) && (this.getBevName() == alcohol.getBevName()) && (this.getBevType() == alcohol.getBevType()) && (this.isServedOnWeekends() == alcohol.isServedOnWeekends());
	}
	
	public String toString() {
		String outStr = "Alchohol Name: " + this.getBevName() + "\n";
		outStr += "Size: " + this.getSize() + "\n";
		outStr += "Served On Weekends: " + ((isServed) ? "Yes\n": "No\n");
		outStr += "Price: " + this.calcPrice() + "\n";
		return outStr;
	}
	
	public boolean isServedOnWeekends() {
		return isServed;
	}

	public void setServedOnWeekends(boolean servedOnWeekends) {
		this.isServed = servedOnWeekends;
	}

	public double getBasePrice() {
		return super.BASE_PRICE;
	}
}

