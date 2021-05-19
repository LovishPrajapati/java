package P2;

import P1.*;

public class ThreeDim extends P1.TwoDim
{
	private int z;
	
	public ThreeDim(){
		super();
		z=0;
	}
	
	public ThreeDim(int a,int b,int c){
		super(a,b);
		z=c;
	}
	
	public String toString(){
		
		String s=super.toString()+" Z="+z;
		return s;
	}
}
