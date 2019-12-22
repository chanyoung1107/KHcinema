package model.vo;

public class Y_Popcorn extends Y_Food implements Y_Order{
	
	public Y_Popcorn(String foodName, String foodSize, int foodPrice, int calorie, int stock) {
		super(foodName, foodSize, foodPrice, calorie, stock);
	}
	
	
	
	@Override
	public void order() {
	
	}

	@Override
	public void print() {
		
	}
	 
	 
}
