package fga.jp.section202.bakery;

public class BakeryDriver {

	public static void main(String[] args) {
		Cookie cookie = new Cookie("Choc Chip", 1);
		
		System.out.println(cookie.getDepartment());
		System.out.println(cookie.getItemName());
		System.out.println(cookie.getType());
		System.out.println(cookie.getPrice());
		cookie.setPrice(1.5);
		System.out.println(cookie.getPrice());
	}//end method main
}//end class BAkeryDriver
