package review;

public class MethodTest {
	//정수 배열의 합을 계산하는 메소드(ArraySum)
	int ArraySum(int[] arr) {
		int sum = 0;
		for(int i : arr) {
			sum += i;
		}
		return sum;
		
	}
	public static void main(String[] args) {
		int[] number= {1,2,3,4,5};
		
		MethodTest mt=new MethodTest();
		
		System.out.println(mt.ArraySum(number));

	}

}
