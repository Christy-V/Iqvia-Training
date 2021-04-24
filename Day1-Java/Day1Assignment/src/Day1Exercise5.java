
public class Day1Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Write a program to display the Fibonacci series starting from 0 till 200.
0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 */
		int first =0;
		int second =1;
		int sum=0;
		System.out.println("The series is :");
		while(second<=200) {
		sum=first+second;
		first=second;
		second=sum;
		System.out.println(first);}
	}

}
