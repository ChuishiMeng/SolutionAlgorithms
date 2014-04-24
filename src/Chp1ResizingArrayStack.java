/**
 *  Stack which can automatically resize itself to fit the data when pop and push
 */
import java.util.Iterator;

public class Chp1ResizingArrayStack<Item> implements Iterable<Item>{
	private Item[] a = (Item[]) new Object[1];
	private int N = 0;
	
	public boolean isEmpty(){
		return N == 0;
	}
	public int size() {
		return N;
	}
	private void resize(int max){
		Item[] tmp = (Item[]) new Object[max];
		for(int i=0; i<N; i++){
			tmp[i] = a[i];
		}
		a = tmp;
	}
	public void push(Item item){
		//if is full, resize it
		if(N == a.length){
			resize(2*a.length);
		}
		a[N++] = item;
	}
	public Item pop(){
		Item item = a[--N];
		a[N] = null; // avoid loitering, i.e. let the system to collect it
		if(N > 0 && N == a.length /4 ){
			resize(a.length / 2);
		}
		return item;
	}
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new ReverseArrayIterator();
	}
	private class ReverseArrayIterator implements Iterator<Item>{
		private int i = N;
		public boolean hasNext() {
			return i >= 0;
		}
		public Item next() {
			return a[--i];
		}
		public void remove(){
			//leave it blank
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chp1ResizingArrayStack<String> s = new Chp1ResizingArrayStack<String>();
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
