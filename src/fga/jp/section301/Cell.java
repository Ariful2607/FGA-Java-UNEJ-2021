package fga.jp.section301;

public class Cell<T, T2> {
	private T t;
    private T2 k;
    
	public void setValue(T celldata, T2 i) {
		t = celldata;
		k = i;
	}//end method setValue
	
	public T getT1Value() {
	   return t;
	}//end method getT1Value
	
	
	public T2 getT2Value() {
		   return k;
	}//end method getT2Value
	
	public String toString(){
		return("cell type is: Type1: " + t.getClass() + " and Type2: " + k.getClass());
	}//end method toString
}//end class Cell
