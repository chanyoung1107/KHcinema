package view;

import java.util.Scanner;

import controller.H_BoxOfficeManager;
import controller.H_MovieManager;
import model.vo.H_Movie;

public class H_MovieInfoPage {
	
	private H_MovieManager mm = new H_MovieManager();
	private H_BoxOfficeManager bom = new H_BoxOfficeManager();
	private Scanner sc = new Scanner(System.in);
	
	public H_MovieInfoPage(int rank) {
			String movie_title = bom.selectMovie(rank);
			
			H_Movie hm = mm.selectOneMovie(movie_title);
			
			System.out.println("=================================");
			System.out.println("제목 : " + hm.getTitle());
			System.out.println("감독 : " + hm.getDirector());
			String[] actors = hm.getActors();
			System.out.print("출연 배우 : ");
			for(int i = 0; i < actors.length; i++) {
				System.out.print(actors[i] + "  ");
			}
			System.out.println();
			System.out.println("장르 : " + hm.getGenre());
			System.out.println("국가 : " + hm.getNational());
			System.out.println("등급 : " + hm.getGrade());
			System.out.println("러닝타임 : " + hm.getRunningtime());
			System.out.println("줄거리");
			System.out.println(hm.getSummary());
			System.out.println("=================================");
			System.out.print("예매하실려면 1번, 뒤로 가실려면 2번을 눌러주세요 : ");
			int num = Integer.parseInt(sc.nextLine());
			switch(num) {
			case 1 : System.out.println("예매페이지 이동"); break;
			case 2 : return;
			default : System.out.println("메뉴에 없는 번호를 입력하셨습니다.");
			}
			
	}
}
