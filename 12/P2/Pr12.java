package P2;

import P1.*;
import java.util.*;

class Pr12
{
	public static void main(String [] args){
		int choice;
		Scanner sc=new Scanner(System.in);
		Figure f;
		while(true){
			System.out.println("Enter your choice");
			System.out.println("--------MAIN MENU--------");
			System.out.println("	1. Area of Rectangle    ");
			System.out.println("	2. Area of Triangle     ");
			System.out.println("	3. Exit		   ");
			System.out.println("-------------------------");
			choice=sc.nextInt();
			switch(choice){
				case 1:Rectangle ob1=new Rectangle();
					f=ob1;
					int check=f.input();
					while(check==-1){
						check=f.input();
						}
					f.display();
					break;
					
				case 2:Triangle ob2=new Triangle();
					f=ob2;
					int check1=f.input();
					while(check1==-1){
						check1=f.input();
						}
					f.display();
					break;
				case 3:System.exit(0);
				default: System.out.println("Invalid choice:");
				
			}
		}
	}
} 
