package example;

public class Hello {

	public static void main(String[] args) {

		System.out.println("HelloWould");
		
		//課題
		ArrayPrint.sysout();
		
		Salse_Empoyee.displayCompany();
		//サンプル問題
		System.out.println("インスタンス数：" + Salse_Empoyee.instance_count);
		Salse_Empoyee empoyee1 = new Salse_Empoyee();
		System.out.println("インスタンス数：" + Salse_Empoyee.instance_count);
		Salse_Empoyee empoyee2 = new Salse_Empoyee();
		System.out.println("インスタンス数：" + Salse_Empoyee.instance_count);
		
		//課題
		Product keyboard = new Product("キーボード",2000);
		keyboard.down(1000);
		keyboard.display();
		keyboard.up(3000);
		keyboard.display();
		
		//サンプルプログラム
		System.out.println("demo");
		
		//課題
		Product apple = new Product("りんご",150);
		apple.display();
		apple.up(2900);
		apple.down(1000);
		apple.display();
		
		int a;
		
		
		
	}

}
