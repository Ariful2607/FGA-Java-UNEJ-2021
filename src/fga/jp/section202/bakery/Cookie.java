package fga.jp.section202.bakery;

public class Cookie implements Item{
	public String cookieType;
	private double price;

	public Cookie(String type, double price){
	   cookieType = type;
	   this.price = price;
	}//end constructor method   

	public String getItemName() {
		return "Cookie";
	}//end method getItemName

	public double getPrice() {
		return price;
	}//end method getPrice

	public void setPrice(double price) {
		this.price = price;
	}//end method setPrice

	public String getDepartment() {
		return "Bakery";
	}//end method getDepartment

	public String getType() {
		return cookieType;
	}//end method getType

}//end class Cookie
