package inheritance;

public class MainCar {
	public static void main(String[] args) {
		Car c1 = new Car("기아","빨간색",100000);
		c1.enginStart();
		c1.enginStop();
		
		SuperCar sc1 = new SuperCar("현대", "검은색", 150000, true);
		System.out.println(sc1.booster);
		sc1.boosterOn();
		sc1.enginStart();
	}
}
