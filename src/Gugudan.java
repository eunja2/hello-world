public class Gugudan {
	public static void main(String[] args) {
		//2단
//		System.out.println("2단");
//		System.out.println(2*1);
//		System.out.println(2*2);
//		System.out.println(2*3);
//		System.out.println(2*4);
//		System.out.println(2*5);
//		System.out.println(2*6);
//		System.out.println(2*7);
//		System.out.println(2*8);
//		System.out.println(2*9);

		//3단
//		System.out.println("3단");
//		System.out.println(3*1);
//		System.out.println(3*2);
//		System.out.println(3*3);
//		System.out.println(3*4);
//		System.out.println(3*5);
//		System.out.println(3*6);
//		System.out.println(3*7);
//		System.out.println(3*8);
//		System.out.println(3*9);

		//4단
//		int number = 4;
//		int result = number * 1;
//		System.out.println(result);
//		result = number * 2;
//		System.out.println(result);
//		result = number * 3;
//		System.out.println(result);
//		result = number * 4;
//		System.out.println(result);
//		result = number * 5;
//		System.out.println(result);
//		result = number * 6;
//		System.out.println(result);
//		result = number * 7;
//		System.out.println(result);
//		result = number * 8;
//		System.out.println(result);
//		result = number * 9;
//		System.out.println(result);

		// 5단
//		System.out.println("구구단 중 출력할 단은? : ");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt(); // 정수를 입력받아서 변수 num에 저장
//		System.out.println(number*1);
//		System.out.println(number*2);
//		System.out.println(number*3);
//		System.out.println(number*4);
//		System.out.println(number*5);
//		System.out.println(number*6);
//		System.out.println(number*7);
//		System.out.println(number*8);
//		System.out.println(number*9);
		
		// 6단
//		int i=1;
//		while(i<10) {
//			System.out.println(6*i);
//			i++;
//		}
			
		// 7단
//		for(i=1; i<10; i++) {
//			System.out.println(7*i);
//		}
		
		// 8단, 9단
//		System.out.println("구구단 중 출력할 단은? : ");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		System.out.println("number : " + number); // 정수를 입력받아서 변수 num에 저장
//		if (number<2 || number>9) {
//			System.out.println("잘못된 값을 입력하셨습니다.");
//		} else {
//			for(int i=1; i<10; i++) {
//				System.out.println(7*i);
//			}
//		}
		
		// 배열
//		int[] result = new int[9];
//		for(int i=0; i<result.length; i++) { // 계산 결과를 배열에 저장후 출력
//			result[i]=(i+1)*2;
//			System.out.println(result[i]);
//		}
//		
//		result = new int[9];
//		for(int i=0; i<result.length; i++) { // 계산 결과를 배열에 저장후 출력
//			result[i]=(i+1)*3;
//			System.out.println(result[i]);
//		}

		//이중for문
//		int[] result = new int[9];
//		for(int i=1; i<result.length; i++) { // 계산 결과를 배열에 저장후 출력
//			for(int j=1; j<result.length+1; j++) {
//				result[i]=(i+1)*j;
//				System.out.println(result[i]);
//			}		
//		}
		
		// 메서드
//		int[] times2 = calculate(2);
//		print(times2);
//		int[] times3 = calculate(3);
//		print(times3);
//		int[] times4 = calculate(4);
//		print(times4);
		
		
		// 클래스
		for (int j=2; j<10; j++) {
			Gugudan.calculate(j);
			Gugudan.print(Gugudan.calculate(j));
		}
		
	}	
	
	// 메서드
	public static int[] calculate(int times) {
		int[] result = new int[9];
		for(int i=0; i<result.length; i++) { // 계산 결과를 배열에 저장후 출력
			result[i]=(i+1)*times;
			}		
		return result;
	}
	
	public static void print(int[] result) {
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
}


