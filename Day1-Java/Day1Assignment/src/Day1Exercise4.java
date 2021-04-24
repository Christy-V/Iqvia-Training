
public class Day1Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*Write a program to determine whether a number is a palindrome or not.*/
		int num=1234;
		int num1=num;
		int rev=0;
		int rem=0;
		while (num>0) {
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		}
		if (rev==num) {
			System.out.println("The number "+num1+" is a palindrome");
		}
		else {
			System.out.println("The number "+num1+" is not a palindrome");
		}
	}

}
