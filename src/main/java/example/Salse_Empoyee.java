package example;

public class Salse_Empoyee {
	
	String name;
	
	int salesAmt;
	
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
