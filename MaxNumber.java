package ajvm;

public class MaxNumber {
	int num1;
	int num2;
	int num3;
	public MaxNumber(int l,int m,int n) {
		this.num1=l;
		this.num2=m;
		this.num3=n;
	}
	public int NumberMax() {
		if(num1>num2) {
			if(num1>num3) {
				return num1;
			}
		}else if(num2>num1) {
			if(num2>num3) {
				return num2;
			}
		}else {
			return num3;
		}
		return 0;
	}
	public static void main(String[]args) {
		MaxNumber number=new MaxNumber(23,29,12);
		int Greatest=number.NumberMax();
		System.out.println("Greatest num is"+Greatest);
	}

}
