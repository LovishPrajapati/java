package P2;

import P1.*;
import java.util.*;

class Rectangle implements Figure
{
	private double length;
	private double width;
	
	public Rectangle(double a,double b){
		length=a;
		width=b;
		}
		
	public Rectangle(){
		length=0.0;
		width=0.0;
		}
		
	public double area(){
		return length*width;
		}
		
	public double perimeter(){
		return 2*(length+width);
		}
	
	public void display(){
		System.out.println("Area of Rectangle: "+area());
		System.out.println("Perimeter of Rectangle: "+perimeter());
		}     
		
	public int input(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of Rectangle: ");
		length=sc.nextDouble();
		System.out.println("Enter width of Rectangle: ");
		width=sc.nextDouble();
		if((length<0)||(width<0)){
			return -1;
			}
		else return 1;
		}	
}
