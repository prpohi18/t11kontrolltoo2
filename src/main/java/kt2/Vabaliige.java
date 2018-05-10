package kt2;

public class Vabaliige implements JooneLiides{
  int kordaja;
  int vabaliige;
  public Vabaliige(int kordaja, int vabaliige){
    this.kordaja=kordaja;
    this.vabaliige=vabaliige;
  }
  
  @Override
  public int joon(int x) {
    return x * kordaja + vabaliige;
  }

}