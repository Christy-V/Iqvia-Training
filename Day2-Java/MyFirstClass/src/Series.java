
public class Series {
	private int num,sum;

	public void setNum(int num) {
		this.num = num;
	}	
	public int getSum() {
		sum=0;
		Factorial fob = new Factorial();
		for (int i=1; i<=num;i++) {
			fob.setNum(i);
			sum=sum+fob.getFactorial()/i;
		}
		return sum;
	}

}
