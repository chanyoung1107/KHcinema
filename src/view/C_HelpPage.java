package view;

import java.util.Scanner;

public class C_HelpPage { //이용방법(도움말 페이지)

	public C_HelpPage() {
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("==========도움말===========");
			System.out.println("프로그램 이용 설명에 대해 쓸 것...");
			System.out.println("..........................");
			System.out.println("..........................");
			System.out.println(".....................입니다.");
			System.out.println("==========================");

			System.out.println("메인화면으로 돌아가시겠습니까? : ");
			System.out.println("1. 확인            2. 취소");
			int num = sc.nextInt();
			
			if(num == 1) {
				return;
			}
		}
	}
}
