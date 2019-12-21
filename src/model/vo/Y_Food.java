package model.vo;

public class Y_Food {
	private String foodCode;                                           // 음식 코드
	private String foodName;                                           // 음식 이름
	private int foodPrice;                                             // 음식 가격
	private int calorie;                                               // 음식 칼로리  
	
	public Y_Food() {}

	public Y_Food(String foodCode, String foodName, int foodPrice, int calorie) {
		this.foodCode = foodCode;
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.calorie = calorie;
	}
	
	public String getFoodCode() {
		return foodCode;
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
	
	public void setFoodCode(String foodCode) {
		this.foodCode = foodCode;
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
	
	
	public void menu() {
		System.out.println(foodCode + " " + foodName + " " + foodPrice + "원 " + calorie + "kcal");
	}

}
