package inheritance;

public class Car {
	//필드
	//brand, color, price
	
	String brand;
	String color;
	int price;
	
	//생성자
	//기본생성자, 매개변수3개있는 생성자
	
	public Car() {
		super();

	}
	
	
	public Car(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	
	//메소드
	//enginStart() => 시동이켜졌습니다
	void enginStart() {
		System.out.println("시동이켜졌습니다.");
	}
	

	//enginStop() => 시동이꺼졌습니다
	
	void enginStop() {
		System.out.println("시동이꺼졌습니다.");
	}
	
	
	//Car 상속받는 SuperCar 클래스 
	//필드 boolean booster
	//생성자 매개변수로 모두 다 받는 생성자
	//메소드
	//boosterOn => 부스터 on
	//boosterOff => 부스터 off
	
	
}
