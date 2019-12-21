package model.dao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import model.vo.J_NonmBooking;

public class J_NonmBookingDao {

	public void insertNonmBooking(J_NonmBooking nb) {
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("nonmBooking.dat", true));
			oos.writeObject(nb);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		    try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
