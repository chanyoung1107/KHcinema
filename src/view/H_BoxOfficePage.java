package view;

import java.util.HashMap;
import java.util.Scanner;

import controller.H_MovieManager;
import model.vo.H_Movie;

public class H_BoxOfficePage {
	
	private Scanner sc = new Scanner(System.in);
	
	public H_BoxOfficePage() {
		
		while(true) {
			System.out.println("========== 박스오피스 순위 ==========");
			System.out.println("1위. 백두산");
			System.out.println("2위. 시동");
			System.out.println("3위. 신비아파트 극장판 하늘도깨비 대 요르문간드");
			System.out.println("4위. 캣츠");
			System.out.println("5위. 겨울왕국");
			System.out.println("6위. ~");
			System.out.println("7위. ~");
			System.out.println("8위. ~");
			System.out.println("9위. ~");
			System.out.println("10위. ~");
			System.out.println("================================");
			System.out.println("예매하실려면 1번");
			System.out.println("영화정보를 자세히 보고싶으시면 2번");
			System.out.println("메인화면으로 돌아가고 싶으시면 3번을 입력해주세요");
			int num = Integer.parseInt(sc.nextLine());
			if(num == 1) {
				System.out.print("몇 위의 영화를 예매하시겠습니까? : ");
				break;
			}
			else if(num == 2) {
				System.out.print("몇 위의 영화 정보를 보고싶으신가요 ? : ");
				break;
			}
			else if(num == 3) {
				//메인메뉴로 연동
				break;
			}
			else {
				System.out.println("잘못된 번호를 입력하셨습니다.");
				break;
			}
		}
		
	}
	
	public void test() {
		HashMap<String, String> rank2 = new HashMap<String, String>();

		rank2.put("1", "백두산");
		
		H_MovieManager mm = new H_MovieManager();
		H_Movie hm = mm.selectOneMovie(rank2.get("1"));
		System.out.println(hm.getTitle());
		System.out.println(hm.getDirector());
		System.out.println(hm.getGenre());
		String[] actors = hm.getActors();
		for(int i = 0; i < actors.length; i++) {
			System.out.print(actors[i] + "\t");
		}
		System.out.println();
		System.out.println(hm.getSummary());
	}
	
	public static void main(String[] args) {
		H_BoxOfficePage bop = new H_BoxOfficePage();
	}
	
	}
