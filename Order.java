import java.util.ArrayList;
import java.lang.Math; 

public class Order implements OrderInterface, Comparable<Order>{
	private ArrayList<Beverage> beverage;
	private Customer customer; 
	private DAY day;
	private int orderNum; 
	private double time;
	
	public Order(int time, DAY day, Customer customer) {
		this.orderNum = random();
		this.day = day; 
		this.customer = new Customer(customer);
		this.setOrderTime(time);
		beverage = new ArrayList<Beverage>();
	}
	public void setOrderTime(int time) {
		this.time=time;
		
	}
	
	public int compareTo(Order order) {
		if(order.getOrderNo() == this.getOrderNo()) {
			return 0;
		}
		else if(order.getOrderNo() < this.getOrderNo()) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
	public int random() {
		int rand = 10000 + (int)(Math.random() * ((90000 - 10000) + 1));
		return rand;
	}
	
	public String toString() {
		String total = "ORDER NUMBER: " + this.getOrderNo() + "\nCUSTOMER NAME: " + this.getCustomer().getName() + "\n ORDER TOTAL:" + this.calcOrderTotal() + "\n";
		for(int i = 0; i < beverage.size();i++) {
			total += "[ "+this.getBeverage(i).toString()+"]";
		}
		return total;
	}

	public int getTotalItems() {
		return beverage.size();
	}

	public boolean isWeekend() {
		if(day==DAY.SUNDAY||day==DAY.SATURDAY) {
			return true;
		}
		else
		{		
			return false;
		}
	}

	public Customer getCustomer() {

		return new Customer(customer);
	}

	public double calcOrderTotal() {
		double total = 0.0;
		for(int i = 0; i < beverage.size();i++) {
			total = total + beverage.get(i).calcPrice();
			
		}
		return total;
	}

	public void Customer(Customer customer) {
		this.customer = new Customer(customer);
	}
	public void setListOfBeverages(ArrayList<Beverage> bev) {
		this.beverage = bev;
	}
	public int getOrderNo() {

		return this.orderNum;
	}

	public Beverage getBeverage(int i) {

		return beverage.get(i);
	}



	public void addNewBeverage(String bevName, SIZE size, boolean extraShot, boolean extraSyrup) {
		Coffee c = new Coffee(bevName, size, extraShot, extraSyrup);
		beverage.add(c);
	}

	public void addNewBeverage(String bevName, SIZE size) {
		Alcohol a = new Alcohol(bevName, size, this.isWeekend());
		beverage.add(a);
	}

	public void addNewBeverage(String bevName, SIZE size, int numOfFruits, boolean addPRotien) {
		Smoothie s = new Smoothie(bevName, size, numOfFruits, addPRotien);
		beverage.add(s);
	}
	

	public int findNumOfBeveType(TYPE type) {
		int bevtype  = 0; 
		for(int i = 0; i < beverage.size();i++) {
			if(beverage.get(i).getType()==type) {
				bevtype++;
			}
		}
		return bevtype; 
	}
	public  double getOrderTime() {
		return time;
	}
	public DAY getOrderDay() {
		return day;
	}


}