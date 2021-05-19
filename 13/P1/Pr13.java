package P1;

import P2.*;

import java.util.*;

class Pr13
{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int choice,x,y,z;
		TwoDim ref;
		while(true){
			System.out.println("Enter your choice");
			System.out.println("--------MAIN MENU--------");
			System.out.println("	1. 2D		     ");
			System.out.println("	2. 3D		     ");
			System.out.println("	3. Exit		     ");
			System.out.println("-------------------------");
			choice=sc.nextInt();
			switch(choice){
				case 1: System.out.println("Enter x co-ordinate");
						x=sc.nextInt();
						System.out.println("Enter y co-ordinate");
						y=sc.nextInt();
						TwoDim ob1=new TwoDim(x,y);
						ref=ob1;
						System.out.println(ref.toString());
						break;
						
				case 2: System.out.println("Enter x co-ordinate");
						x=sc.nextInt();
						System.out.println("Enter y co-ordinate");
						y=sc.nextInt();
						System.out.println("Enter z co-ordinate");
						z=sc.nextInt();
						ThreeDim ob2=new ThreeDim(x,y,z);
						ref=ob2;
						System.out.println(ref.toString());
						break;
						
				case 3: System.exit(0);
			}
		}
	}
}
