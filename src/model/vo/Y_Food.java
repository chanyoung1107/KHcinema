package model.vo;

public class Y_Food {
	private String foodName;                                           // 음식 이름
	private String foodSize;                                           // 음식 사이즈
	private int foodPrice;                                             // 음식 가격
	private int calorie;                                               // 음식 칼로리  
	private int stock;                                                 // 음식 재고량
	
	public Y_Food() {}

	public Y_Food(String foodName, String foodSize, int foodPrice, int calorie, int stock) {
		this.foodName = foodName;
		this.foodSize = foodSize;
		this.foodPrice = foodPrice;
		this.calorie = calorie;
		this.stock = stock;
	}
	
	
	public String getFoodName() {
		return foodName;
	}
	
	public String getFoodSize() {
		return foodSize;
	}

	public int getFoodPrice() {
		return foodPrice;
	}

	public int getCalorie() {
		return calorie;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	
	public void setFoodSize(String foodSize) {
		this.foodSize = foodSize;
	}

	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}

	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	public void menuInfo() {
		System.out.println(foodName + " " + "(" + foodSize + ") " + foodPrice + "원 " + calorie + "kcal");
	}

}
