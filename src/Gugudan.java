public class Gugudan {
	public static void main(String[] args) {
		//2��
//		System.out.println("2��");
//		System.out.println(2*1);
//		System.out.println(2*2);
//		System.out.println(2*3);
//		System.out.println(2*4);
//		System.out.println(2*5);
//		System.out.println(2*6);
//		System.out.println(2*7);
//		System.out.println(2*8);
//		System.out.println(2*9);

		//3��
//		System.out.println("3��");
//		System.out.println(3*1);
//		System.out.println(3*2);
//		System.out.println(3*3);
//		System.out.println(3*4);
//		System.out.println(3*5);
//		System.out.println(3*6);
//		System.out.println(3*7);
//		System.out.println(3*8);
//		System.out.println(3*9);

		//4��
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

		// 5��
//		System.out.println("������ �� ����� ����? : ");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt(); // ������ �Է¹޾Ƽ� ���� num�� ����
//		System.out.println(number*1);
//		System.out.println(number*2);
//		System.out.println(number*3);
//		System.out.println(number*4);
//		System.out.println(number*5);
//		System.out.println(number*6);
//		System.out.println(number*7);
//		System.out.println(number*8);
//		System.out.println(number*9);
		
		// 6��
//		int i=1;
//		while(i<10) {
//			System.out.println(6*i);
//			i++;
//		}
			
		// 7��
//		for(i=1; i<10; i++) {
//			System.out.println(7*i);
//		}
		
		// 8��, 9��
//		System.out.println("������ �� ����� ����? : ");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		System.out.println("number : " + number); // ������ �Է¹޾Ƽ� ���� num�� ����
//		if (number<2 || number>9) {
//			System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�.");
//		} else {
//			for(int i=1; i<10; i++) {
//				System.out.println(7*i);
//			}
//		}
		
		// �迭
//		int[] result = new int[9];
//		for(int i=0; i<result.length; i++) { // ��� ����� �迭�� ������ ���
//			result[i]=(i+1)*2;
//			System.out.println(result[i]);
//		}
//		
//		result = new int[9];
//		for(int i=0; i<result.length; i++) { // ��� ����� �迭�� ������ ���
//			result[i]=(i+1)*3;
//			System.out.println(result[i]);
//		}

		//����for��
//		int[] result = new int[9];
//		for(int i=1; i<result.length; i++) { // ��� ����� �迭�� ������ ���
//			for(int j=1; j<result.length+1; j++) {
//				result[i]=(i+1)*j;
//				System.out.println(result[i]);
//			}		
//		}
		
		// �޼���
//		int[] times2 = calculate(2);
//		print(times2);
//		int[] times3 = calculate(3);
//		print(times3);
//		int[] times4 = calculate(4);
//		print(times4);
		
		
		// Ŭ����
		for (int j=2; j<10; j++) {
			Gugudan.calculate(j);
			Gugudan.print(Gugudan.calculate(j));
		}
		
	}	
	
	// �޼���
	public static int[] calculate(int times) {
		int[] result = new int[9];
		for(int i=0; i<result.length; i++) { // ��� ����� �迭�� ������ ���
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


