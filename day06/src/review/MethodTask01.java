package review;

import java.util.Scanner;

public class MethodTask01 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		MethodTask01 mt1 = new MethodTask01();
//
////		int num = sc.nextInt();
////		System.out.println(mt1.changeSing(num));
//		
//		int []avg = {1,2,3,4,5};
//		System.out.println(mt1.getAvg(avg));
//
//	}
//
//	// 1. 음수를 양수로, 양수를 음수로 바꾸는 메소드
//	// 메소드명 changeSing
//	int changeSing(int num) {
//		num *= -1;
//		return num;
//	}
//
//	// 2. 5개의 정수 중 평균값을 반환하는 메소드
//	// getAvg
//	double getAvg(int[] num) {
//		int sum = 0;
//		double avg = 0.0;
//		for (int i : num) {
//			sum += i;
//			System.out.println(sum);
//		}
//		avg = ((double)sum/num.length);
//		return avg;
//	}
//
//	// 3. 정수 배열 중 최대값과 최소값 출력하는 메소드
//	// Integer.Max_Value;
//	// Integer.Min_Value;

	public static void main(String[] args) {
		MethodTask01 mt = new MethodTask01();
		System.out.println(mt.changeSing(10));
		System.out.println(mt.changeSing(-10));

		int[] ar = { 1, 2, 3, 4, 5 };
		System.out.println(mt.getAvg(ar));

	}

	// 1. 음수를 양수로, 양수를 음수로 바꾸는 메소드
	// 메소드명 changeSing
	int changeSing(int num) {
		return num * -1;
	}

	// 2. 5개의 정수 중 평균값을 반환하는 메소드
	// getAvg
	double getAvg(int[] ar) {
		if (ar.length != 5) {
			return 0.0;
		}

		int total = 0;
		for (int i = 0; i < ar.length; i++) {
			total += ar[i];
		}
		return (double) total / ar.length;
	}

	// 3. 정수 배열 중 최대값과 최소값 출력하는 메소드
	// printMinMax

	void printMinMax(int[] ar) {
		int min = ar[0];
		int max = ar[0];

		for (int i = 0; i < ar.length; i++) {
//	         if(ar[i] < min) {
//	            min = ar[i];
//	         }
//	         if(ar[i] > max) {
//	            max = ar[i];
//	         }
			// 삼항연산자
			min = min > ar[i] ? ar[i] : min;
			max = max < ar[i] ? ar[i] : max;

		}
		System.out.println("최소값 : " + min);
		System.out.println("최대값 : " + max);
	}

}