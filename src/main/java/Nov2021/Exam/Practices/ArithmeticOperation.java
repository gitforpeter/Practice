package Nov2021.Exam.Practices;

import java.util.Scanner;

public class ArithmeticOperation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter two integers");
		int i = sc.nextInt();
		int j = sc.nextInt();
			System.out.println("Arithmetic Operation");
		int result = i + j;
			System.out.printf("%d + %d  = %d\n", i, j, result);
		result = i - j;
			System.out.printf("%d - %d  = %d\n", i, j, result);
		result = i * j;
			System.out.printf("%d * %d  = %d\n", i, j, result);
			// /와 %에 주의 하자 : 정수 나누기 정수는 정수다. %는 나머지만 구해준다.
		result = i / j;
			System.out.printf("%d / %d  = %d\n", i, j, result);
		result = i % j;
			// %자체를 출력하기 위해서는 %%를 써야 한다.
			System.out.printf("%d %% %d  = %d\n", i, j, result);
		sc.close();
	}
}
