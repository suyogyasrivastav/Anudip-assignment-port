package ajvm;

public class Time {
	double distance;
	double speed;
	public Time(double distance,double speed) {
		this.distance=distance;
		this.speed=speed;
	}
	public double CalculateTime(){
		double time=(distance/speed);
		return time;
	}
	public static void main(String[]args) {
		Time t=new Time(200,5);
		double time =t.CalculateTime();
		System.out.println("time="+time);
	}
}
