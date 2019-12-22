package view;

import java.util.Scanner;

public class J_NonmMenu {
	//비회원이 영화 예매할 때 사용하는 페이지
	
	Scanner sc = new Scanner(System.in);
	
	//앞 메뉴에서 영화제목, 상영시간, 좌석이 정해졌다면 해당 정보를 인자로 전달 받기
	public void nonmBook(String grade) {
		
		System.out.println("============ 비회원 예매 ============");
		
		//상영 영화 목록 보여주기
		
//		System.out.println("============ 예매 내용 입력 ============");
//		System.out.print("원하는 영화 제목을 입력해 주세요 : ");
//		String movie_title = sc.next();

		System.out.print("이름을 입력해주세요 : ");
		String nonmName = sc.next();
		System.out.print("휴대전화번호를 입력해주세요 : ");
		int nonmPhone = sc.nextInt();
		System.out.print("태어난 연도를 입력해주세요 : ");
		int nonmYear = sc.nextInt();
		System.out.println("태워난 월을 입력해주세요 : ");
		int nonmMonth = sc.nextInt();
		System.out.println("태워난 일을 입력해주세요 : ");
		int nonmDay = sc.nextInt();		
		
		//등급 검사
		if(grade.equals("19세이상")) {
			if(nonmYear < 20) {
				System.out.println("19세 이상만 관람 가능한 영화입니다.");
			}else {
				System.out.println("예매 완료!");
				System.out.println("예매해주셔서 감사합니다");				
			}
		}else {
			System.out.println("예매 완료!");
			System.out.println("예매해주셔서 감사합니다");			
		}
		
	}
}
