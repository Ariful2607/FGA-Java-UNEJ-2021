package fga.jp.section302.genericcollections;

public class CellGenericCollection<T> {
  T[] cells;
  int index=0;
  
  //boolean remove(Object o)



  public CellGenericCollection(int size) {
//    cells = new T[size];
      cells = (T[]) new Object[size];
  }//end constructor

  public void add(T c) {
    cells[index]=c;
    index++;
  }//end method add
  
  public T get(int i) {
    return cells[i];
  }//end method get
}//end class CellCollection