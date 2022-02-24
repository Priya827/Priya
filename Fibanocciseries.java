package week1.day1;

public class Fibanocciseries {

	public static void main(String[] args) {
		int n = 8, firstnum = 0, secondnum = 1 ,sum;
		System.out.println("Fibonacci Series till " + n + " terms:");
		for(int i=1; i<=n; ++i) {
		System.out.println(firstnum);
			sum = firstnum + secondnum;
			firstnum = secondnum;
			secondnum = sum;
		}
		
	}

}


