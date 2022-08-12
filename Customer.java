public class Customer {
	String name;
	int age;
	
	
	public Customer(String name, int age) {
		this.name = name; 
		this.age = age;
	}
	
	public Customer(Customer c1) {
		this.setAge(c1.getAge());
		this.setName(c1.getName());
	}

	

	public void setName(String name) {
		this.name = name; 

	}

	public void setAge(int age) {
		this.age = age;

	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

}
