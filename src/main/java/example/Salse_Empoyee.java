package example;

public class Salse_Empoyee {
	
	Salse_Empoyee(){
		instance_count += 1;
	}
	
	static final String COMPANY_NAME = "〇〇商事";
	
	static int instance_count = 0;
	
	String name;
	
	int salesAmt;
	
	static void displayCompany() {
		System.out.println(COMPANY_NAME);
	}
	
	//売り上げるメソッド
	int sell(int amt) {
		return salesAmt += amt;
	}
	
	//返品を受け付ける
	int refund(int amt) {
		return salesAmt -= amt;
	}
	
	void displayInfo() {
		System.out.println("名前：" + this.name);
		System.out.println("売り上げ" + this.salesAmt + "円");
	}

}
