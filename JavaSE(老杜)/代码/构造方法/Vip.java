public class Vip{
	long no;
	String name;
	String birth;
	boolean sex;
	
	public Vip(){
		
	}
	public Vip(long no){
		System.out.println("no:" + no);
		if(no == no) System.out.println(true);
		else System.out.println(false);
		no = no;
		System.out.println("no:" + no);
		if(no == no) System.out.println(true);
		else System.out.println(false);		
	}
	
	// public Vip(long huiYuanHao, String xingMing){
		// no = huiYuanHao;
		// name = xingMing;
	// }
	
	// public Vip(long huiYuanHao, String xingMing, String shengRi){
		// no = huiYuanHao;
		// name = xingMing;
		// birth = shengRi;
	// }
	
	// public Vip(long huiYuanHao, String xingMing, String shengRi, boolean xingBie){
		// no = huiYuanHao;
		// name = xingMing;
		// birth = shengRi;
		// sex = xingBie;
	// }
}