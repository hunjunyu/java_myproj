package Chapter05ex03;

public class Asignmentoperator {
	public static void main(String[] args) {
		
		//대입 연산자의 축약 표현
	
		 /*  a = a + b   a += b
		 *   a= a - b    a -= b
		 *   a= a * b    a *= b
 		     a= a |b     a /= b
		
		비트연산의 축약표현
		a = a&b                  a&=b
		a =a|b       a|=b
		
		쉬프트 연산의 축약표현
		a = a>>b     a>>=b
		a = a<<b      a<<=b
		
		논린 쉬프트
		 a = a >>>b        a>>>=b
		
		
		*/
		
		int value1 = 3;
		value1 = value1 + 3;    //대입연산자는 제일 나중에 적용
		value1 = value1 + 12;
		System.out.println(value1);
		
		int value2 ;    //변수 선언
		value2 = 1;    //변수에 값 할당 : //
		System.out.println(value2 += 2);  // value2 = value2 + 2
		             //3
		System.out.println(value2 -= 2);  // value2 = value2 - 2
	                 //1	
		System.out.println(value2 *=2 );  // value2 = value2 * 2
		             //2
		System.out.println(value2 /= 2);  // value2 = value2 / 2
		            //1
		System.out.println(value2 %=2);  //value2 = value2 / 2
		            //1     : 나머지 값만 출력
		System.out.println(value2 <<= 2); // value2 = value2 << 2
		            //4      : 1 *2 *2
		System.out.println(value2 >>= 2); // value2 = value2 >> 2
		            //1 
		
		
		
		
		
		
		
		
	
  }
}
