package intro;

public class TimeComplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double now= System.currentTimeMillis();
		
		TimeComplexity demo =new TimeComplexity();
		System.out.println(demo.findSum(9));
		
		System.out.println("time taken "+(System.currentTimeMillis()-now)+" millisecs.");
	}
	
	public int findSum(int n) {
		return n*(n+1)/2;
	}
//	public int findSum(int n) {
//		int sum=0;
//		for(int i=0;i<=n;i++) {
//			sum=sum+i;
//		}
//		return sum;
//	}
}
