package controller;

import java.util.HashMap;

import model.dao.H_BoxOfficeDao;

public class H_BoxOfficeManager {
	private H_BoxOfficeDao bod = new H_BoxOfficeDao();
	
	public void insertBoxOffice(Integer rank, String movie_title) {
		
		HashMap<Integer, String> list = bod.readMovieList();
		
		if(list == null) {
			list = new HashMap<Integer, String>();
			System.out.println(list);
		}
		
		list.put(rank, movie_title);
		System.out.println(list);
		
		int result = bod.writeMovieList(list);
		
		if(result > 0) {
			System.out.println("등록 성공");
		}else {
			System.out.println("등록 에러");
		}
	
	}
	
	public void printAll() {
		HashMap<Integer, String> list = bod.readMovieList();
		
		if(list == null) {
			list = new HashMap<Integer, String>();
			System.out.println(list);
		}
		System.out.println(list);
	}
	
	public String selectMovie(Integer rank) {
		HashMap<Integer, String> list = bod.readMovieList();
		
		String title = null;
		
		if(list.containsKey(rank)) {
			title = list.get(rank);
		}
		
		return title;
	}
	
	public void updateRank(Integer rank, String movie_title) {
		
		HashMap<Integer, String> list = bod.readMovieList();
		
		int result = 0;
		
		if(list.containsKey(rank)) {
			list.put(rank, movie_title);
			result = bod.writeMovieList(list);
		}
		
		if(result > 0) {
			System.out.println("영화 변경");
		}
	}
}
