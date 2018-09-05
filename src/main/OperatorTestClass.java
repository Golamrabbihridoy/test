package main;


public class OperatorTestClass {
	public int addition(int i, int j) {
		return i + j;
	}
	public int subtraction(int i, int j) {
		return i - j;
	}
	public int multiplication(int i, int j) {
		return i * j;
	}

	public int modulus(int i, int j) {
		return i % j;
	}
	public int division(int i, int j) {
		return i/j;
	}
	public int bitNot(int op1) {
		return ~op1;
	}
	public int bitAnd(int op1,int op2) {
		return op1 & op2;	
	}
	public int bitOr(int op1,int op2) {
		return op1 | op2;	
	}
	public int bitxor(int op1,int op2) {
		return op1 ^ op2;	
	}
	public int bitShiftLeft(int op1) {
		return op1<<1;	
	}
	public int bitShiftRight(int op1) {
		return op1>>1;	
	}
	
	public boolean logicalor(boolean op1,boolean op2) {
		return op1 || op2;	
	}
	public boolean logicalAnd(boolean op1,boolean op2) {
		return op1 && op2;	
	}
	public boolean logicalxor(boolean op1,boolean op2) {
		return op1 ^ op2;	
	}
	public boolean logicalNot(boolean op1) {
		return !op1;	
	}
	
}
