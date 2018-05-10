package kt2;

public class Vorrand implements JooneLiides{
  int y; 
  public Vorrand(int y) {
    this.y=y;
  }
  //v6rrand y=3x
  @Override
  public int joon(int x) {
    y=3*x;
    return y;
  }

}
