public class Coffee extends Beverage {
	boolean extraShot;
	boolean extraSyrup;
	String name;
	SIZE size;
	TYPE type = TYPE.COFFEE;

	public Coffee(String name, SIZE size, boolean extraShot, boolean extraSyrup) {
		super(name, TYPE.COFFEE, size);
		this.extraShot = extraShot;
		this.extraSyrup = extraSyrup;
		this.name = name;
		this.size = size;

	}

	public double getBasePrice() {
		return super.BASE_PRICE;
	}

	public String toString() {
		String extra = "";
		if (extraShot) {
			extra += "Extra shot";
		}
		if (extraSyrup) {
			extra += "Extra syrup";
		} else {
			extra += "Nothing";
		}
		return "Name : " + this.name + " Size : " + this.size + " Contains : " + extra + " Price : " + this.calcPrice();
	}

	public double calcPrice() {
		double price = super.calcPrice();
		int count = 0;
		if (extraSyrup) {
			count++;
		}
		if (extraShot) {
			count++;
		}
		return price + ((0.50) * count);
	}

	public String getBevName() {
		return this.name;
	}

	public SIZE getSize() {
		return this.size;
	}

	public TYPE getType() {
		return this.type;
	}

	public boolean getExtraShot() {
		return extraShot;
	}

	public boolean getExtraSyrup() {
		return extraSyrup;
	}
}