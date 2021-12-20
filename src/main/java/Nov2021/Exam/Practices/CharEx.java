package Nov2021.Exam.Practices;

public class CharEx {
	public static void main(String[] args) {
		char ch = 'A';
				System.out.println("ch  = " + ch + " : " + (ch+0));
			
			ch = 97;
				System.out.println("ch  = " + ch + " : " + (ch+0));
	
						// ch = -10; 에러이다  양수만 저장가능하다.
						// ch = "A"; 에러이다 ""는 문자열로 String타입이다.
						// ch=''; 에러이다. 반드시 1글자가 있어야 한다.
			ch='\t'; 	// 에러가 아니다. 제어 문자열은 1글자로 인식한다.
				System.out.println("ch  = " + ch);
				System.out.println("ch  = " + (ch+0));
			ch = '한';
				System.out.println("ch  = " + ch);
				System.out.println("ch  = " + (ch+0));
			ch = 54621;
				System.out.println("ch  = " + ch + " : " + (ch+0));
			ch = '가';
				System.out.println("ch  = " + ch + " : " + (ch+0));
			ch++;
				System.out.println("ch  = " + ch + " : " + (ch+0));
			ch++;
				System.out.println("ch  = " + ch + " : " + (ch+0));
			ch++;
				System.out.println("ch  = " + ch + " : " + (ch+0));
				
			System.out.println("========================================");
			char a = 'A';
			System.out.println(a + 1);
			// 'A' + 1 = 65 + 1 = 66 : 'A'의 ASCII코드값 65번으로 변경되어 정수 연산을 한다.
			System.out.println((char)(a + 1)); // 다시 문자형으로 변경하면 66번 코드 'B'가 나온다.
			// 대문자 + 32 = 소문자, 소문자 - 32 = 대문자
			System.out.println((char)(a + 32));
			System.out.println((char)('f' - 32));
			System.out.println((char)('F' + 32));			
	}
}
