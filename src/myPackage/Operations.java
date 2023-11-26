package myPackage;

public class Operations {
	public Integer Add(int a, int b) {
		int c = a+b;
		System.out.println("Addition="+c);
		return c;
	}
	public Integer Sub(int a, int b) {
		int c = a-b;
		System.out.println("Substraction="+c);
		return c;
	}
	public Integer mul(int a, int b) {
		int c = a*b;
		System.out.println("Multiplication="+c);
		return c;
	}
	public Integer Div(int a, int b) {
		int c =a/b;
		System.out.println("Division="+c);
		return c;
	}

	public static void main(String[] args) {
		Operations op = new Operations();
		op.Add(100, 10);
		op.Sub(50, 5);
		op.mul(20, 25);
		op.Div(80, 20);
	}
}
