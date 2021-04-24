package com.mycalculator;
import com.calculations.Sum;
import com.calculations.Difference;
import com.calculations.Divide;
import com.calculations.Multiply;

public class MyCalculator {
	private int num1,num2,result;
	private char operator;
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public void setOperator(char operator) {
		this.operator = operator;
	}
	public int getResult() {
		switch(operator) {
		case '+':
			Sum Sob =new Sum();
			Sob.setNum1(num1);
			Sob.setNum2(num2);
			result=Sob.getSum();
			break;
		case '-':
			Difference Dob =new Difference();
			Dob.setNum1(num1);
			Dob.setNum2(num2);
			result=Dob.getDiff();
			break;	
		case '/':
			Divide dob =new Divide();
			dob.setNum1(num1);
			dob.setNum2(num2);
			result=dob.getDiv();
			break;	
		case '*':
			Multiply Mob =new Multiply();
			Mob.setNum1(num1);
			Mob.setNum2(num2);
			result=Mob.getMul();
		
			break;	
		}
		
		return result;
	}

}
