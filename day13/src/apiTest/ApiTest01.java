package apiTest;
import java.util.Random;
public class ApiTest01 {
	public static void main(String[] args) {
		//내부 API
		Random r = new Random();
		
		//n미만의 랜덤정수
		
		//0이상 1미만의 랜덤 실수 반환
		double num3 = r.nextDouble();
		System.out.println(num3);
		
		//범위를 지정하여 랜덤 정수를 생성한다
		int min = 5;
		int max = 15;
		int range = max - min +1;
		int randomRange = r.nextInt(range)+min;
		System.out.println(randomRange);
		
	}
}
