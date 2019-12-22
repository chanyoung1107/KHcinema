package view;

import java.util.Scanner;

public class Y_MyPage {
	Scanner sc = new Scanner(System.in);
	
	public void myPage() {  // 마이페이지 창
		System.out.println("=========== my Page ===========");
		System.out.println("1. 결제내역");
		System.out.println("2. 포인트 현황");
		System.out.println("3. 내가 본 영화");
		System.out.println("4. 회원정보 수정");
		System.out.println("5. 로그아웃");
		System.out.println("6. 회원탈퇴");
		System.out.println("0. 돌아가기");
		System.out.println("===============================");
		System.out.print("번호를 입력해주세요 : ");
		int num = sc.nextInt();
		
		switch (num) {
		case 1: break;
		case 2: break;
		case 3: break;
		case 4: break;
		case 5: logOut(); break;
		case 6: withdrawal(); break;
		case 0: new C_MemberMainMenu(); return;
		}
	}
	public void logOut() {  // 마이페이지에서 5번을 입력할 시 실행되는 로그아웃 메소드 
		System.out.println("로그아웃 되었습니다.");
		// 메인메뉴로 이동
		new C_MainMenu();
	}
	
	public void withdrawal() {  // 회원탈퇴 
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("회원탈퇴를 진행하시겠습니까? ");
		System.out.println("1. Yes");
		System.out.println("2. No");
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.print("번호를 입력해주세요 : ");
		int num = sc.nextInt();
		
		// 1번 yes를 입력한 경우
		if(num == 1) {  
			/*
			C_Member m = (C_Member) 
		    m.setId(null);
		    m.setPassword(null);
		    m.setName(null);
		    m.setBirthday(null);
		    m.setEmail(null);
		    m.setPoint(null);
		    */
			System.out.println("정상적으로 탈퇴처리 되었습니다.");   
			// 탈퇴 처리 메시지가 출력되고 메인메뉴로 이동
			new C_MainMenu();
		// 그 밖의 다른 숫자를 입력한 경우
		}else { 
			System.out.println("회원탈퇴가 취소되었습니다."); 
			// 탈퇴 취소 메시지가 출력되고 마이페이지로 이동
			myPage();                                  
		}
		
		
	}
}
