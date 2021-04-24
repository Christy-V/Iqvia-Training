
public class PalindromeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome Pob= new Palindrome();
		int num=1234;
		Pob.setNumber(num);
		if (Pob.getRev()==num)
		{	
			System.out.println("Number is a Palindrome");
		}
		else {
			System.out.println("Number is not a Palindrome");
		}
	}

}
