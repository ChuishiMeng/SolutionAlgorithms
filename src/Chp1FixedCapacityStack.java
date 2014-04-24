/**
 *  write a generic class 
 *  Pay attention to line 14
 * @author Chuishi Meng
 *
 * @param <Item>
 */
//add <Item> by the end of class name
public class Chp1FixedCapacityStack<Item>{
	private Item[] a;
	private int N;
	
	public Chp1FixedCapacityStack(int cap){
		//cannot do this: a = new Item[cap]
		a = (Item[])new Object[cap];
	}
	public boolean isEmpty(){
		return N == 0;
	}
	public int size(){
		return N;
	}
	public void push(Item item){
		a[N++] = item;
	}
	public Item pop(){
		return a[--N];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chp1FixedCapacityStack<String> s = new Chp1FixedCapacityStack<String>(100);
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
