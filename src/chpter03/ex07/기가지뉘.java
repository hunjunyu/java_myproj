package chpter03.ex07;

public class 기가지뉘 {
	public static void main(String[] args) {
		
	    /*
	      제어문 : 프로글매의 순서를 바꾸는 구문
	       - 선택 제어문 : if, switch
	       - 반복 제어문 : for, while, do while;
	      if : 조건을 만족하는 실행문을 실행후 if 문을 빠져나온다.
	           (break를 사용하지 않더라도 if 문을 빠져나온다.
	           switch 문은 break를 사용해서 구문을 빠져 나온다.)
	           
	            
		 - if (조건) { 실행 } ;  //조건이 참일때 실행문1을 실행
		 
		 - if (조건) {
		     실행문1;   //실행문1 : 조건이 참일때
		 } else {
		     실행문2;  //실행문2 : 조건이 거짓일때
		 }
		 
		 
		 - if (조건1) {   //조건1이 참일때, 실행문1을 실행
		   실행문1 ;
		   }else if (조건2){  //조건2가 참일때, 실행문2를 실행
		   실행문2 ; 
		   }else if (조건3){  //조건3가 참일때, 실행문3을 실행
		   실행문3 ; 
		   }......
		   } else{             //위의 모든 조건을 만족하지 않을때 실행문10을 실행
		     실행문10 ;
		   }
		
		
	     */
		
	
		//if (조건) {실행문1}
		
		System.out.println("=======조건이 false===========");
		if (3>5) {    //조건이 false이기 때문에 실행문내의 구문은 실행되지 않는다.
			      System.out.println("안녕");
		          System.out.println("방가");
		}
		System.out.println("=======조건이 true===========");
		
		if (3<5) {    //조건이 true이기 때문에 실행문내의 구문은 실행되지 않는다.
		      System.out.println("안녕");
	          System.out.println("방가");
	    }
		
       //if 조건에서 실행문이 1개일때는 중괄호를 생략할수있다. (주의요망)
		    //권장사항 : 중괄호 명시 후 사용.
	   System.out.println("======================================");
	   if (5<3) 
		   System.out.println("오늘은 비가 내린다 양말 다 젖었네 시팔 아이 ㅈ같애라~ ");  //중괄호 생략
	       System.out.println("비가 존나게 내립니다.");    /// 중괄호 밖의 실행구문
	       System.out.println("======================================");
	       
	   /*2. if (조건) {
	            실행문1 ;   //조건이 참일때, 실행문 1 실행 
	            }else{   
	            실행문2 ;  //조건이 거짓일때, 실행문 2 실행
	            }
	       
	       */
	       if (5>3) {   // 조건은 반드시 true, false
	    	   System.out.println("정답이다 연금술사!(참)");  //조건이 참일때 실행
	       }else {
	    	   System.out.println("쌉에바다 연금술사...(거짓)");  //조건이 거짓일때 실행
	       }
	       
	       //변수 선언 : 동일한 변수를 여러개 선언시 , 로 구분
	       //    - 기본 자료형 (8가지) : 초기값을 할당하지 않으면 오류
	              // boolean, (byte, short, int, long) 정수 , float, double, char
	       //    - 참조 자료형 (무한대) : 초기 값을 할당하지 않으면 컴파일러가 자동으로 넣어줌 
	                 //String (문자열)  <== 참조 자료형
	       int a , b;    //변수 선언만 한 경우
	       
	       //System.out.println(a);          //변수의 값을 넣지 않고 출력
	       a = 5;       //변수의 초기값 할당.
	       b = 0;
	       if (a>5) {
	    	   b=10;
	       }else {
	    	   b=20;
	       }
	       System.out.println(b);        //20
	       
	       //if (조건) ~ else 구문을 삼항 연산자료 변환  : 삼항 연산자는 한라인으로 처리
	       System.out.println("=======삼항 연산자 출력================");
	       System.out.println((a>5) ? 10 : 20);
	     
           if (a>5) {System.out.println("정답이다 연금술사");
           }else {
        	   System.out.println("쌉에바다 연금술사");
           }
           System.out.println("======================================");
	       
	       /*3. 조건이 여러개인 경우 : if(조건) ~ else if (조건) ~ else 구문
	        *   : 해당조건을 만족하는 실행문을 실행후 if문 탈출
	        */
          int c;
          c = 85;
          
          if (c>=90) {                           //false
          
        	  System.out.println("A 학점입니다.");
          }else if (c>=80) {                     // true
        	  System.out.println("B 학점입니다.");  //실행문 실행후 if문을 빠져나옴
          }else if (c>=70) {
        	  System.out.println("C 학점입니다.");
        	  
          }else if (c>=60) {
        	  System.out.println("D 학점입니다.");
          }else { 
        	  System.out.println("학점미달입니다.");
        	  
          }
	   
          System.out.println("if문 탈출됨!!!!!!!!!!!!!!!!!!!");
     
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
