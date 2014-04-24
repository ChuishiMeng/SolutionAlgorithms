/*************************************************************************
 *  Compilation:  javac BinarySearch.java
 *  Execution:    java BinarySearch whitelist.txt < input.txt
 *  Data files:   http://algs4.cs.princeton.edu/11model/tinyW.txt
 *                http://algs4.cs.princeton.edu/11model/tinyT.txt
 *                http://algs4.cs.princeton.edu/11model/largeW.txt
 *                http://algs4.cs.princeton.edu/11model/largeT.txt
 *
 *  % java BinarySearch tinyW.txt < tinyT.txt
 *  50
 *  99
 *  13
 *
 *  % java BinarySearch largeW.txt < largeT.txt | more
 *  499569
 *  984875
 *  295754
 *  207807
 *  140925
 *  161828
 *  [367,966 total values]
 *  
 *************************************************************************/



import java.util.Arrays;

public class Chp1BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] whiteList = In.readInts(args[0]);
		Arrays.sort(whiteList);
		while(!StdIn.isEmpty()){
			int key = StdIn.readInt();
			if(rank(key, whiteList)<0){
				StdOut.println(key);
			}
		}
	}

	public static int rank(int key, int[] a){
		int lo = 0;
		int hi = a.length - 1;
		while(lo <= hi){
			int mid = lo + (hi - lo)/2;
			if(key < a[mid]){
				hi = mid - 1;
			}else if (key > a[mid]){
				lo = mid + 1;
			}else{
				return mid;
			}
		}
		return -1;
	}
}
