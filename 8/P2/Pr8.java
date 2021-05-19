package P2;
import P1.*;

import java.util.*;
			
class Pr8
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		int rows,columns;
		System.out.println("Enter no. of rows");
		rows=s.nextInt();
		System.out.println("Enter no. of columns");
		columns=s.nextInt();
		P1.Matrix ob1=new P1.Matrix(rows,columns);
		ob1.input();
		P1.Matrix ob3,ob;
		int choice;
		while(true)
		{
			System.out.println("--------MAIN MENU--------");
			System.out.println("       1. Addition       ");
			System.out.println("       2. Multiplication ");
			System.out.println("       3. Transpose      ");
			System.out.println("       4. Exit           ");
			System.out.println("-------------------------");
			choice=s.nextInt();
			switch(choice)
			{
				case 1: 
					System.out.println("Enter no. of rows");
					rows=s.nextInt();
					System.out.println("Enter no. of columns");
					columns=s.nextInt();
					ob=new P1.Matrix(rows,columns);
					ob.input();
					ob3=ob1.add(ob);
					System.out.println("Resultant:");
					System.out.println(ob3);
					break;
				case 2: System.out.println("Enter no. of rows");
					rows=s.nextInt();
					System.out.println("Enter no. of columns");
					columns=s.nextInt();
					ob=new P1.Matrix(rows,columns);
					ob.input();
					ob3=ob1.mul(ob);
					System.out.println("Resultant:");
					System.out.println(ob3);
					break;
				case 3: ob3=ob1.transpose();
					System.out.println("Resultant:");
					System.out.println(ob3);
					break;
				case 4: System.exit(0);
				default: System.out.println("Invalid choice");
					 break;
			}
		}
	}
}		
