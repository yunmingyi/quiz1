package baseball;

import java.util.Scanner;

public class baseball {
	private int AB;
	private int H;
	private int TwoB;
	private int ThreeB;
	private int HR;
	private int R;
	private int BB;
	private int HBP;
	private int SF;
	
	public void main(){
		Scanner in = new Scanner(System.in);
		
		System.out.print("AB: ");
		AB =in.nextInt();
		
		System.out.print("H:");
		H=in.nextInt();
		
		System.out.print("2B:");
		TwoB=in.nextInt();
		
		System.out.print("3B:");
		ThreeB=in.nextInt();
		
		System.out.print("HR:");
		HR=in.nextInt();
		
		System.out.print("R:");
		R=in.nextInt();
		
		System.out.print("BB:");
		BB=in.nextInt();
		
		System.out.print("HBP:");
		HBP=in.nextInt();
		
		System.out.print("SF:");
		SF=in.nextInt();
	}
	
	public double BA( ) {
		double result = H/AB;
		return result;
	}
	
	public double OBP( ) {
		double result = (H+BB+HBP)/(AB+BB+HBP+SF);
		return result;
	}
		
	public double SLG( ) {
		double result = (H+2*TwoB+3*ThreeB+4*HR)/AB;
		return result;
	}
	
	public double OBS( ) {
		double result = OBP()+SLG();
		return result;
	}
	
	public int TB( ) {
		int result =H+2*TwoB+3*ThreeB+4*HR;
		return result;
	}	
	
}
