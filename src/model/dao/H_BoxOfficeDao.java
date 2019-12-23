package model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

import model.vo.H_Movie;

public class H_BoxOfficeDao {
	
	public H_BoxOfficeDao() {}
	
	public HashMap<Integer, String> readMovieList(){
		ObjectInputStream ois = null;
		HashMap<Integer, String> list = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("BoxOfficeList.dat"));

			list = (HashMap<Integer, String>)ois.readObject();
			
		}catch(FileNotFoundException e) {
			System.out.println("파일이 없습니다.");

		}catch(ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public int writeMovieList(HashMap<Integer, String> list) {
		ObjectOutputStream oos = null;
		
		int result = 0;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("BoxOfficeList.dat"));
			
			oos.writeObject(list);
			
			result++;
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
}
