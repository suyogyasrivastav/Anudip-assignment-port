package ajvm;
public class SimpleInterest{
	double principal;
	double rate;
	double time;
	public SimpleInterest(double principal,double rate,double time){
		this.principal=principal;
		this.rate=rate;
		this.time=time;
	}
	public double SimpleInterestCalculator(){
		double simpleinterest=(principal*rate*time)/100;
		return simpleinterest;
	}
	public static void main(String[]args) {
		SimpleInterest calculator=new SimpleInterest(1000,5,2);
			double interest=calculator.SimpleInterestCalculator();
			System.out.println("interest="+interest);
	}
}