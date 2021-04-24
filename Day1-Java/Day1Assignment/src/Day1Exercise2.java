
public class Day1Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a program to get two numbers and swap the values of two numbers 
		  without using a temporary variable and display the same.*/
		int a=10;
		int b=20;
		System.out.println("Original Numbers are : "+a+" , "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swapped Numbers are : "+a+" , "+b);
	}

}
