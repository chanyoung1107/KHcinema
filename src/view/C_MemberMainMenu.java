package view;

import java.util.Scanner;

public class C_MemberMainMenu {
				//로그인 후 회원전용 페이지
	
	Scanner sc = new Scanner(System.in);
	
	public C_MemberMainMenu(/*멤버 객체 매개변수로 받아와야함.*/) {
		while(true) {
		System.out.println("========회원 전용 페이지 입니다.========");
		System.out.println("1. 박스오피스 순위");
		System.out.println("2. 영화 예매 / 취소");
		System.out.println("3. 예매내역 확인");
		System.out.println("4. 음식 주문");
		System.out.println("5. 마이페이지");
		System.out.println("6. 이용방법");
		System.out.println("==================================");
		System.out.println("원하시는 메뉴를 선택하여 주세요 : ");
		int num = sc.nextInt();
		
		switch(num) {
//		case 1 : 박스오피스 페이지 (지호) break;
		case 2 : 
//		case 3 : 예매내역 확인
		case 4 : new Y_FoodCorner();
		case 5 : new Y_MyPage(/*멤버 객체 인자값으로 넘거줘야함*/);
		case 6 : new C_HelpPage();  //도움말페이지
		}
		
		}
	}
}
