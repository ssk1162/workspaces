package testjava;

/*
 * ��, ����, ����
 * �Ա�, ����
 */

public class TestClass {
	
	private boolean power;
	private int money;
	private String menu;
	
	public TestClass() {
		// TODO Auto-generated constructor stub
	}
	
	public TestClass(boolean power, int money, String menu) {
		this.power = power;
		this.money = money;
		this.menu = menu;
	}

	void power () {
		this.power = false;
	}
	
	void money(int pay) {
		if (this.money < pay) {
			
		}
	}
	

	void menu() {
		
	}
	
	
	
}
