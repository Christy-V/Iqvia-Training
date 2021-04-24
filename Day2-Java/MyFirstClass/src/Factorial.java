
public class Factorial {
private int num,factorial;

public void setNum(int num) {
	this.num = num;
}
public int getFactorial() {
	factorial =1;
	for (int i=1;i<=num;i++) {
		factorial=factorial*i;
	}
	return factorial;
}

}
