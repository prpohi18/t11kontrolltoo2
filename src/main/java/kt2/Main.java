package kt2;

public class Main{
  public static int[] funktsioon(int[] x, JooneLiides j){
    int[] y = new int[x.length]; 
    for (int i = 0; i < x.length; i++) {
      y[i] = j.joon(x[i]);
    }
  return y;
  }
  
  public static void main(String[] args) {
    JooneLiides k1=new Kordaja(3);
    System.out.println("6?"+k1.joon(2));

    JooneLiides v1=new Vabaliige(1, 2);
    int[] x = new int[]{1, 2, 3};
    int[] y = funktsioon(x,v1);
    for (int i = 0; i <y.length ; i++) {
      System.out.println("3, 4, 5?"+y[i]);
    }
  }
}