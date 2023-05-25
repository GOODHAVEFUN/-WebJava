package classTest;

public class CalcMain {
	public static void main(String[] args) {
		//클래스의 객체생성
		Calc c = new Calc();//더하기기능만 사용
		Calc c1 = new Calc();//곱하기기능만 사용
		
		//메소드 호출
		System.out.println(c.add(1, 2));
		System.out.println(c1.mul(1, 2));
		
	}
	
}
