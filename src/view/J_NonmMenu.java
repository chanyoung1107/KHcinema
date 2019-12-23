package view;

import java.util.Calendar;
import java.util.Scanner;

public class J_NonmMenu {
	//비회원이 영화 예매할 때 사용하는 페이지
	
	Scanner sc = new Scanner(System.in);
	
	public void nonmBook() {
		
		System.out.println("============ 비회원 예매 ============");
		
		System.out.println("============ 상영 영화 목록 ============");

		//상영 영화 목록 vo에서 불러오기
		
		System.out.println("============ 상영 영화 선택 ============");
		
		System.out.print("원하는 영화 번호를 선택해주세요 : ");
	    int movie = sc.nextInt();
		
		String grade = "19세 이상";
		
		System.out.println("============ 비회원 정보 입력 ============");		
		System.out.print("이름을 입력해주세요 : ");
		String nonmName = sc.next();
		
		//전화번호 입력 체크
		boolean phoneCk = true;
		
		do {
			System.out.print("휴대전화번호를 입력해주세요 : ");
			int nonmPhone = sc.nextInt();	
			
			if(nonmPhone >= 1000000000 && nonmPhone <= 1099999999) {
				System.out.println("전화번호가 정상 입력되었습니다.");
				phoneCk = false;
			}else {
				System.out.println("잘못된 전화번호를 입력하셨습니다.");
			}
			
		}while(phoneCk);
		
		//성인 인증을 위한 생년 받기, (예정) 생일 되면 축하쿠폰
		System.out.print("태어난 연도를 입력해주세요 : ");
		int nonmYear = sc.nextInt();
		System.out.print("태워난 월을 입력해주세요 : ");
		int nonmMonth = sc.nextInt();
		System.out.print("태워난 일을 입력해주세요 : ");
		int nonmDay = sc.nextInt();		
		
		Calendar c = Calendar.getInstance();
		int sysYear = c.get(Calendar.YEAR);
		
		//영화 등급이 관람 가능한지 검사
		if(grade.equals("19세 이상")) {
			if(sysYear - nonmYear < 20) {
				System.out.println("19세 이상만 관람 가능한 영화입니다.");
				new C_MainMenu();
				
			}else {
				System.out.println("성인 인증되었습니다.");
				System.out.println("예매 완료!");
				System.out.println("예매해주셔서 감사합니다");				
			}
		}else {
			System.out.println("예매 완료!");
			System.out.println("예매해주셔서 감사합니다");			
		} 
		
	}
	
	public static void main(String[] args) {
		J_NonmMenu nm = new J_NonmMenu();
		nm.nonmBook();
	}
}
