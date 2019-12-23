package view;

import java.util.Scanner;

public class C_SelectMember {
	//첫 메인메뉴 페이지에서 2번 선택시
	Scanner sc = new Scanner(System.in);

	public C_SelectMember() {
		while(true) {
			System.out.println("=========유형을 선택하여 주세요=========");
			System.out.println("1. 회원               2. 비회원");
			System.out.println("===================================");
			int num = sc.nextInt();

			if(num == 1) {
				new S_Login();
			}else if(num == 2) {
				//			비회원 정보 입력 페이지
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
}
