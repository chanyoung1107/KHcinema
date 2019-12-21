package view;

public class Y_FoodCorner {

	public void foodCorner() {

		System.out.println("============ 푸드 코너 ============");              // 음식 주문 선택하면 뜨는 창
		System.out.println("1. 메뉴 보기");
		System.out.println("2. 주문 하기");
		System.out.println("3. 주문 확인");
		System.out.println("9. 돌아가기");
		System.out.println("===============================");

	}

	public void foodMenu() {
		System.out.println("============ 푸드 코너 ============");             // 푸드 메뉴를 확인할 수 있는 창, 위의 1번 메뉴 보기 선택하면 뜸
		System.out.println("1. 팝콘(오리지널)");
		System.out.println("2. 팝콘(캐러멜)");
		System.out.println("3. 팝콘(치즈)");
		System.out.println("4. 팝콘(어니언)");
		System.out.println("5. 나초");
		System.out.println("6. 콜라");
		System.out.println("7. 맥주");
	}

}
