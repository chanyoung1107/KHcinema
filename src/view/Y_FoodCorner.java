package view;

import java.util.Scanner;

public class Y_FoodCorner {
	Scanner sc = new Scanner(System.in);
	public void foodMenu() {

		System.out.println("============= Menu =============");             
		System.out.println("1. 오리지널 팝콘(M) -------- 4000원");
		System.out.println("2. 오리지널 팝콘(L) -------- 5000원");
		System.out.println("3. 캐러멜 팝콘(M) --------- 4500원");
		System.out.println("4. 캐러멜 팝콘(L) --------- 5500원");
		System.out.println("5. 나초 ----------------- 4500원");
		System.out.println("6. 콜라(M) -------------- 1500원");
		System.out.println("7. 콜라(L) -------------- 2000원");
		System.out.println("8. 맥주(380cc) ---------- 4000원");
		System.out.println("9. 맥주(660cc) ---------- 6000원");
		System.out.println("================================");
		System.out.println("10. 돌아가기");
		System.out.println("================================");
		System.out.println("번호를 입력해주세요.");
		int num = sc.nextInt();
		
		switch (num) {
		case 1: break;
		case 2: break;
		case 3: break;
		case 10: new C_MemberMainMenu(); return;
		}
	}

}
