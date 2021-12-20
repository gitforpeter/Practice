package Nov2021.Exam.Practices;

public class TypeCollect {
	public static void main(String[] args) {
	// 1.ByteType
	System.out.println("<<<<====ByteType====>>>>");
			// byte타입은 정수를 저장하는 타입으로 -128 ~ +127까지 저장가능하다.
			// Byte타입은 참조형으로 기본자료형을 한번 감싸 객체로 처리하는 클래스이다.
		byte b = 123;
			System.out.println(Byte.BYTES + "Byte");
			System.out.println(Byte.SIZE + "Bit");
			System.out.println(Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
			System.out.println("b = " + b);
			
		b += 123; // 123을 더하라
			System.out.println("b = " + b); // 오버플로우가 발생하여 -10이다.
			System.out.println();
	// 2. ShortType
	System.out.println("<<<<====ShortType====>>>>");
			// short타입은 정수를 저장하는 타입으로 2바이트를 차지한다. -32768~32767까지 저장가능하다.
			// Short타입은 참조형으로 기본자료형을 한번 감싸 객체로 처리하는 클래스이다.
			
		short c = 123;
			System.out.println(Short.BYTES + "Byte");
			System.out.println(Short.SIZE + "Bit");
			System.out.println(Short.MIN_VALUE + "~" + Short.MAX_VALUE);
			System.out.println("c = " + c);
			
		c += 123; // 123을 더하라
			System.out.println("c = " + c); 

		c += Short.MAX_VALUE; // 최대 저장값을  더하라
			System.out.println("c = " + c); // 오버플로우
			
			System.out.println();
	// 3. IntegerType
	System.out.println("<<<<====IntegerType====>>>>");
			// int타입은 정수를 저장하는 타입으로 4바이트를 차지한다. -2147483648~2147483647까지 저장가능하다.
			// Integer타입은 참조형으로 기본자료형을 한번 감싸 객체로 처리하는 클래스이다.
		int d = 123;
			System.out.println(Integer.BYTES + "Byte");
			System.out.println(Integer.SIZE + "Bit");
			System.out.println(Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
			System.out.println("d = " + d);
			
		d += 123; // 123을 더하라
			System.out.println("d = " + d); 

		d += Integer.MAX_VALUE; // 최대 저장값을  더하라
			System.out.println("d = " + d); // 오버플로우
			
			System.out.println();
	// 4. LongType
	System.out.println("<<<<====LongType====>>>>");
			// long타입은 정수를 저장하는 타입으로 8바이트를 차지한다. -9223372036854775808~9223372036854775807까지 저장가능하다.
			// Long타입은 참조형으로 기본자료형을 한번 감싸 객체로 처리하는 클래스이다.
		long e = 123;
			System.out.println(Long.BYTES + "Byte");
			System.out.println(Long.SIZE + "Bit");
			System.out.println(Long.MIN_VALUE + "~" + Long.MAX_VALUE);
			System.out.println("e = " + e);
			
		e += 123; // 123을 더하라
			System.out.println("e = " + e); 

		e += Long.MAX_VALUE; // 최대 저장값을  더하라
			System.out.println("e = " + e); // 오버플로우
			System.out.println();
	// 5. FloatType
	System.out.println("<<<<====FloatType====>>>>");
			// float타입은 단정도 실수를 저장하기 위한 자료형이다. 4Byte용량
			// 1.4E-45~3.4028235E38
			// double타입은 배정도 실수를 저장하기 위한 자료형이다. 8Byte용량
			float f = 123.456f;
			System.out.println(Float.BYTES + "Byte");
			System.out.println(Float.SIZE + "Bit");
			System.out.println(Float.MIN_VALUE + "~" + Float.MAX_VALUE);
			System.out.println("f = " + f);
			// 정수 나누기 정수의 결과는 정수이다.
			float div = 10/3;
			System.out.println("10나누기 3의 값 : " + div);
			div = 10/3f; // 숫자 뒤에 f를 붙이면 float형 상수이다.
			System.out.println("10나누기 3의 값 : " + div);
			// div = 10/3.0; // 에러이다. 3.0은 double형이다. 연산 결과가 8바이트인 double이다.
			                 // double을 float에 넣을 수 없다.
			double div2 = 10/3.;
			System.out.println("10나누기 3의 값 : " + div2);
			// 실수의 연산은 부정확하다. 유효자릿수를 생각해야 한다. 
			System.out.println("  12345678901234567890");
			// %n.mf : n(전체자릿수),m(소수이하 자릿수) 
			System.out.printf("%.20f\n", div); // 소수이하 6자리까지만 믿어라
			System.out.printf("%.20f\n", div2);// 소수이하 15자리까지만 믿어라
			System.out.println();			
	}
}
