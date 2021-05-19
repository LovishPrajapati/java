package P2;

import P1.*;
import java.lang.*;
import java.util.*;

class Triangle implements Figure
{
	private double a;
	private double b;
	private double c;
	

	public Triangle(double x,double y,double z){
		a=x;
		b=y;
		c=z;
		}
		
	public Triangle(){
		a=0.0;
		b=0.0;
		c=0.0;
		}
	
	public double area(){
		double s;
		s=(a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
		}
		
	public double perimeter(){
		return a+b+c;
		}
	public void display(){
		System.out.println("Area of Triangle: "+area());
		System.out.println("Perimeter of Triangle: "+perimeter());
		}    
		
	public int input(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side 1 of triangle: ");
		a=sc.nextDouble();
		System.out.println("Enter side 2 of triangle: ");
		b=sc.nextDouble();
		System.out.println("Enter side 3 of triangle: ");
		c=sc.nextDouble();
		if(((a+b)<=c)||((b+c)<=a)||((a+c)<=b)){
			return -1;
			}
		else if(a<0||b<0||c<0)
			return -1;
		else return 1;
		}		                                                               
}
