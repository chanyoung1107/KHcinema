package view;

import java.util.Scanner;

public class C_MainMenu {
				//첫 메인메뉴 페이지(회원 / 비회원 모두)
	
	Scanner sc = new Scanner(System.in);

	public C_MainMenu() {
		System.out.println("========== KH시네마에 오신걸 환영합니다 ==========");
		System.out.println();
		while(true) {
			System.out.println("1. 박스오피스 순위");
			System.out.println("2. 영화 예매 / 취소");
			System.out.println("3. 로그인");
			System.out.println("4. 회원가입");
			System.out.println("5. 이용방법");

			System.out.print("원하는 메뉴를 선택하세요 : ");
			int mainnum = sc.nextInt();

			if(mainnum > 5 || mainnum < 1) {
				System.out.println("번호를 잘못 입력하셨습니다. 다시 선택해주세요");
				continue;
			} 
			if(mainnum >= 1 && mainnum <= 5) {
				switch(mainnum) {
//				case 1 : 박스오피스 페이지 (지호)
//				case 2 : 회원/비회원 선택페이지
//				case 3 : 로그인 페이지 (재선형)
//				case 4 : 회원가입 페이지 (재선형)
//				case 5 : 이용방법페이지
				}
			}
		}
	}
}
