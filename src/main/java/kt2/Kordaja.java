package kt2;

public class Kordaja implements JooneLiides{

  int kordaja;
  public Kordaja(int kordaja){
    this.kordaja=kordaja;
  } 

  @Override
  public int joon(int x) {
    return x * kordaja;
  }
}