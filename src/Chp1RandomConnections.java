/**
 *example input:
 *5
 *0.5
 *<c-z> 
 * @author chuishimeng
 *
 */
public class Chp1RandomConnections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = StdIn.readInt();
		double p = StdIn.readDouble();
//		int N = 5; 
//		double p = 0.5;
		double[] xAxis = new double[N];
		double[] yAxis = new double[N];
		StdDraw.circle(.2, .2, .2);
		StdDraw.setPenColor(StdDraw.BOOK_RED);
	    StdDraw.setPenRadius(.02);
		for(int i=0; i<N; i++){
			xAxis[i] = .2 + Math.cos(Math.PI/2 - 2* Math.PI*i/N) * .2;
			yAxis[i] = .2 + Math.sin(Math.PI/2 - 2* Math.PI*i/N) * .2;
			StdDraw.point(xAxis[i], yAxis[i]);
		}
		for(int i=0; i<N; i++){
			for(int j=i+1; j<N; j++){
				if(p < Math.random()){
					StdDraw.line(xAxis[i], yAxis[i], xAxis[j], yAxis[j]);
				}

			}
		}
	}

}
