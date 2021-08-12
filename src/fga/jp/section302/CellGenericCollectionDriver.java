package fga.jp.section302;

public class CellGenericCollectionDriver {
	public static void main(String[] args) {
		CellGenericCollection cells = new CellGenericCollection(5);
		cells.add(new Cell());
		cells.add(new Cell());
		System.out.println(cells.get(0));
		System.out.println(cells.get(1));
//		cells.get(0).setValue("First Cell");
//		cells.get(1).setValue("Second Cell");
		System.out.println(cells.get(0));
		System.out.println(cells.get(1));
	}//end method main
}//end class
