package test.main;
// 한 줄 주석입니다.
// 역시 한 줄 주석입니다.

/*
 	여러 줄 주석 입니다.
 		하나
 		두울
 		세엣
*/

// 파일명 : MainClass.java 
// 파일명과 클래스명은 같아야 한다!
public class MainClass { // 클래스 명 : MainClass
	
	// 실행 순서가 시작되는 특별한 main 메소드(Method)
	// function main(args){
	// }
	public static void main(String[] args) { // 메소드명 : main
		// syso + ctrl + space
		System.out.println("안녕하세요.");
		
		// 비교연산의 결과로 얻어진 boolean type 데이터를 변수에 담기
		boolean isGreater= 10>1;
		
		if(isGreater) {
			System.out.println("10은 1보다 커요");
		}
		
		// 논리연산의 결과로 얻어진 boolean type 데이터를 변수에 담기
		// or => ||		and => &&
		boolean result=  true || false;

		System.out.println("main 메소드가 리턴(종료) 됩니다.");
	}
}
