package controller;

import java.util.ArrayList;

import model.dao.H_MovieDao;
import model.vo.H_Movie;

public class H_MovieManager {
	private H_MovieDao md = new H_MovieDao();
	
	//새 영화 등록용 메소드 
	public void insertMovie(H_Movie m) {
		
		//파일에 기록된 리스트 조회
		ArrayList<H_Movie> list = md.readMovieList();
		//조회 내역이 있는지 확인
		if(list == null) {
			//조회 내역이 없는 경우 새로운 리스트 생성
			list = new ArrayList<H_Movie>();
			System.out.println(list);
		}
		
		//리스트에 movie객체 추가
		list.add(m);
		System.out.println(list);
		//리스트를 파일에 기록 후 결과값 정수로 리턴
		int result = md.writeMovieList(list);
		//성공 실패 여부에 따라 뷰 페이지 결정
		if(result > 0) {
			System.out.println("등록 성공");
		}else {
			System.out.println("등록 에러");
		}
	}
	
	// 제목으로 검색하여 영화 객체 리턴하는  메소드
	public H_Movie selectOneMovie(String title) {
		ArrayList<H_Movie> list = md.readMovieList();
		
		H_Movie selectedMovie = null;
		
		if(list != null) {
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i).getTitle().equals(title)) {
					selectedMovie = list.get(i);
					break;
				}
			}
		}
		
		return selectedMovie;
	}
	
	//파일에 들어있는 모든 영화의 값 출력
	public void printAll() {
		ArrayList<H_Movie> list = md.readMovieList();
		if(list == null) {
			list = new ArrayList<H_Movie>();
			System.out.println(list);
		}
		System.out.println(list);
	}
	
	//영화 줄거리 출력 메소드
	public void selectSummary(String title) {
		
		//전체 영화 정보 조회
		ArrayList<H_Movie> list = md.readMovieList();
		
		H_Movie selectedMovie = null;
		
		if(list != null) {
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i).getTitle().equals(title)) {
					selectedMovie = list.get(i);
					break;
				}
			}
		}
		
		System.out.println("줄거리 \n" + selectedMovie.getSummary());
	}
	
	public void deleteMovie(String title) {
		ArrayList<H_Movie> list = md.readMovieList();
		
		//H_Movie selectedMovie = null;
		
		if(list != null) {
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i).getTitle().equals(title)) {
					//selectedMovie = list.get(i);
					list.remove(i);
					System.out.println(title +"을 삭제했습니다.");
					break;
				}
			}
		}
		
	}
	
	
}
