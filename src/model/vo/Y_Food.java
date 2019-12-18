package model.vo;

public class Y_Food {
	private String foodName;
	private int foodPrice;
	private int calorie;
	
	public Y_Food() {}

	public Y_Food(String foodName, int foodPrice, int calorie) {
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.calorie = calorie;
	}

	public String getFoodName() {
		return foodName;
	}

	public int getFoodPrice() {
		return foodPrice;
	}

	public int getCalorie() {
		return calorie;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}

	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	
	
	public void buy() {}
 

}
