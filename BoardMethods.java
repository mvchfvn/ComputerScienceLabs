

public interface BoardMethods {
    
  // public abstract methods (note that we don't have to put public abstract in front
  // since methods declared in an interface are public abstract by default  
  // so public abstract could be left off
  
  public abstract void setCellStatus(int row, int col, char value);
  public abstract char getCellStatus(int row, int col);
  
  // note that we can not write constructors in an interface!!!!
  // and we cannot define variables here!!!!!!!!!!!!!!!!!!!!!!!!
  
}