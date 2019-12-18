package model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import model.vo.H_Movie;

public class H_MovieDao {

	public H_MovieDao() {}
	
	public ArrayList<H_Movie> readMovieList(){
		ObjectInputStream ois = null;
		ArrayList<H_Movie> list = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("MovieList.dat"));

			list = (ArrayList<H_Movie>)ois.readObject();
			
		}catch(FileNotFoundException e) {
			System.out.println("파일이 없습니다.");

		}catch(ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		return list;
	}
}
