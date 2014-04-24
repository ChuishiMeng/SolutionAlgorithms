/**
 * Note: String use "", character use ''
 * not to compare string with char, e.g. char.equals("(") --- should be char.equals(')')
 * @author chuishimeng
 *
 */

public class EX_1_3_4 {

	public static void main(String[] args) {
		Chp1Stack<Character> stack = new Chp1Stack<Character>();
		String inputString = StdIn.readString();
		for(int i=0; i<inputString.length(); i++){
			Character c = inputString.charAt(i);
			if(c.equals('(') || c.equals('{') || c.equals('[')){
				stack.push(c);
			}else if(c.equals(')')){
				if(!stack.pop().equals('(')){
					System.out.println("false");
					return;
				}
			}else if(c.equals('}')){
				if(!stack.pop().equals('{')){
					System.out.println("false");
					return;
				}
			}else if(c.equals(']')){
				if(!stack.pop().equals('[')){
					System.out.println("false");
					return;
				}
			}
		}
		System.out.println("true");
	}

}
