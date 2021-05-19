import java.util.*;

abstract class Shape
{
	double len,bre;
	
	Shape(double a,double b){
		len=a;
		bre=b;
	}

	Shape(double r){
		len=r;
	}

	abstract double area();
}

class Rectangle extends Shape
{
	Rectangle(double le,double br){
		super(le,br);
	}

	double area(){
		return len*bre;
	}
}

class Circle extends Shape
{
	Circle(double r){
		super(r);
	}

	double area(){
		return 3.14*len*len;
	}
}

class Pr9
{
	public static void main(String [] args){
	Scanner s=new Scanner(System.in);
	int choice;
	double dim1,dim2;
	Shape ob;
	while(true){
		System.out.println("--------MAIN MENU--------");
		System.out.println("   1. Area of Rectangle  ");
		System.out.println("   2. Area of Circle     ");
		System.out.println("   3. Exit               ");
		System.out.println("-------------------------");
		choice=s.nextInt();
		switch(choice){
			case 1: System.out.println("Enter length of rectangle");
				dim1=s.nextDouble();
				System.out.println("Enter breadth of rectangle");
				dim2=s.nextDouble();
				Rectangle ob1=new Rectangle(dim1,dim2);
				ob=ob1;
				System.out.println("Area of rectangle:"+ob.area());
				break;
			case 2: System.out.println("Enter radius of circle");
				dim1=s.nextDouble();
				Circle c=new Circle(dim1);
				ob=c;
				System.out.println("Area of circle:"+ob.area());
				break;
			case 3: System.exit(0);
			default: System.out.println("Invalid choice");
				break;
			}
		}
	}
}
