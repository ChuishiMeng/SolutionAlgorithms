

public class Chp1Integer2BinaryString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chp1Integer2BinaryString i2s = new Chp1Integer2BinaryString();
		System.out.printf("%8s%8s\n","Number","Binary");
		for(int i=0; i<8;i++){
			System.out.printf("%8d%8s\n", i, i2s.toBinaryString(i));
		}
	}
	public String toBinaryString(int N){
		String s = "";
		for(int i=N; i>0; i/=2){
			s = i%2 + s;
		}
		return s;
	}

}
