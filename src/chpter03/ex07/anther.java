package chpter03.ex07;

import java.util.Scanner;

public class anther {

	public static void main(String[] args) {
		// if문에서  String 문자열 비교.
		// -- 기본 자료형에서 변수의 값이 같다 : ==
		// -- 참조 자료형에서는 변수의 값이 같음을 표현할때 : 변수명.equals("값")
		
		Scanner sc = new Scanner(System.in);  //sc 객체 생성
		
		System.out.println("주문하실 커피 메뉴를 고르세요>>>>>>");
		String order = sc.next();
		
		if (order.equals("아메리카노")) { 
			System.out.println("당신이 주문한 커피는 : " + order + " 입니다");
		} else if (order.equals("카푸치노")) {
			System.out.println("당신이 주문한 커피는 : " + order + "입니다");
		} else if (order.equals("카페라떼")) {
			System.out.println("당신이 주문한 커피는 : " + order + "입니다");
		}else if (order.equals("아보카도")) {
			System.out.println("당신이 주문한 커피는 : " + order + "입니다");
		}else {
			System.out.println("우리 매장에는 없는 메뉴입니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
