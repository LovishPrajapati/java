package P1;

public class TwoDim
{
	private int x;
	private int y;
	
	public TwoDim(){
		x=0;
		y=0;
	}
	
	public TwoDim(int a,int b){
		x=a;
		y=b;
	}
	
	public String toString(){
		String s= "X="+ x +" Y="+ y;
		return s;
	}
}
