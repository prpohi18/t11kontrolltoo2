package tahed;
public class TahtiSonasMain{
	public static void main(String[] arg) throws Exception{
		TaheOtsingSonast yl = new TaheOtsingSonast("peremees");
		System.out.println(yl.loeTahti('e'));
		System.out.println(yl.kysiTaht());
		System.out.println(yl.kysiSona());
	}
}
