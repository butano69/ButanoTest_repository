package example;

public class Product {
	
	public Product(String name,int price){
		this.name = name;
		this.price = price;
		instance_count +=1;
	}
	
	static final String STORE_NAME = "速水PC販売店";
	static int instance_count = 0;
	
	String name;
	public int price;
	
	int up(int amt) {
		return price += amt;
	}
	
	int down(int amt) {
		return price -= amt;
	}
	
	void display() {
		System.out.println(name + ":" + price + "円");
		System.out.println(STORE_NAME);
	}
}
