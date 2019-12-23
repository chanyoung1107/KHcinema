package view;

import java.util.HashMap;
import java.util.Scanner;

import controller.H_BoxOfficeManager;
import controller.H_MovieManager;
import model.vo.H_Movie;

public class H_BoxOfficePage {
	
	private Scanner sc = new Scanner(System.in);
	private H_BoxOfficeManager bom = new H_BoxOfficeManager();
	
	public H_BoxOfficePage() {
		
		while(true) {
			System.out.println("========== 박스오피스 순위 ==========");
			System.out.println("1위. " + bom.selectMovie(1));
			System.out.println("2위. " + bom.selectMovie(2));
			System.out.println("3위. " + bom.selectMovie(3));
			System.out.println("4위. " + bom.selectMovie(4));
			System.out.println("5위. " + bom.selectMovie(5));
			System.out.println("6위. " + bom.selectMovie(6));
			System.out.println("7위. " + bom.selectMovie(7));
			System.out.println("8위. " + bom.selectMovie(8));
			System.out.println("9위. " + bom.selectMovie(9));
			System.out.println("10위. " + bom.selectMovie(10));
			System.out.println("=================================");
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
				int rank = Integer.parseInt(sc.nextLine());
				if(rank >= 1 && rank <= 10) {
					new H_MovieInfoPage(rank);
					//break;
				}
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
	
	
	public static void main(String[] args) {

		H_BoxOfficePage bop = new H_BoxOfficePage();
	}
	
	}
