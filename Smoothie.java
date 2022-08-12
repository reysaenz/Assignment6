public class Smoothie extends Beverage{
	int fruits; 
	boolean protein;
	public static final TYPE type = TYPE.SMOOTHIE;
	public Smoothie(String name, SIZE size, int numOfFruits, boolean protein) {
		super(name,type,size);
		this.protein = protein;
		this.fruits=numOfFruits;

	}
	public String toString() {
		String coffee  = super.toString();
		coffee+=" "+" Fruit count : "+ this.fruits+ " Has protein" + this.protein+ " Price: "+ this.calcPrice();
		return coffee;
	}
	public boolean equals(Smoothie beverage) {
		boolean equals  = false; 
		if(super.equals(beverage)) {
			if((this.fruits==beverage.getNumOfFruits())&&this.protein==beverage.protein) {
				equals = true;
			}
		}
		else
		{
			equals = false;
		}
		return equals;
	}
	public double getBasePrice() {
		return super.BASE_PRICE;
	}

	public double calcPrice() {
		double price = super.calcPrice();
		if(protein) {
			price = price + 1.50;
		}
		price+=(0.50)*(fruits);
		return price;
	}

	public String getBevName() {
		return this.getName();
	}

	public SIZE getSize() {
		return this.size;
	}

	public int getNumOfFruits() {
		return this.fruits;
	}
	public boolean getAddProtien() {

		return protein;
	}

}