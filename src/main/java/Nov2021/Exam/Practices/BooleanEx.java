package Nov2021.Exam.Practices;

public class BooleanEx {
	public static void main(String[] args) {
		boolean gender = true;				
				System.out.println("gender : " + gender);
				/* 보통의 경우 연산자와 같이 사용된다.
				   삼항연산자 : 연산 대상이 3개인 연산자
				    		   	( 논리식 ? 참 : 거짓 )
				*/             
				System.out.println("gender : " + (  gender ? "MAN" : "GIRL"));
				// ! : NOT 연산자 gender가 아니라면...
				System.out.println("gender : " + (! gender ? "MAN" : "GIRL"));
	}
}
