
public class Chp1FixedCapacityStackOfStrings {
	private String[] a;
	private int N;
	
	public Chp1FixedCapacityStackOfStrings(int cap){
		a = new String[cap];
	}
	public boolean isEmpty(){
		return N == 0;
	}
	public int size(){
		return N;
	}
	public void push(String item){
		a[N++] = item;
	}
	public String pop(){
		return a[--N];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chp1FixedCapacityStackOfStrings s = new Chp1FixedCapacityStackOfStrings(100);
		while(!StdIn.isEmpty()){
			String item = StdIn.readString();
			if(!item.equals("-")){
				s.push(item);
			}else if(!s.isEmpty()){
				StdOut.print(s.pop() + " ");
			}
		}
	}

}
