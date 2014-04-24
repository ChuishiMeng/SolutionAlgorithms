import java.util.Stack;

public class Chp1Evaluate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = args[0];
		Stack<Double> operand = new Stack<Double>();
		Stack<String> operator = new Stack<String>();
		while(!s.isEmpty()){
			String c = s.substring(0,1);	
			s = s.substring(1);
			if(c.equals("(") ){
				//do nothing
			}else if(c.equals("*") || c.equals("/") || c.equals("+") || c.equals("-")){
				operator.push(c);
			}else if(c.equals(")")){
				String op = operator.pop();
				double val = operand.pop();
				if(op.equals("+")){
					operand.push(operand.pop() + val);
				}else if(op.equals("-")){
					operand.push(operand.pop() - val);
				}else if(op.equals("*")){
					operand.push(operand.pop() * val);
				}else if(op.equals("/")){
					operand.push(operand.pop() / val);
				}
			}else{
				operand.push(Double.parseDouble(c));
			}
		}
		System.out.println(operand.pop());
	}

}
