import java.util.*;

class Complex
{
	private double real;
	private double img;

	Complex()
	{
	 real = 0.0;
	 img = 0.0;
	}

	public void input()
		{
		 Scanner scc=new Scanner(System.in);
		 System.out.println("Enter real part");
		 real=scc.nextDouble();
		 System.out.println("Enter imag. part");
		 img=scc.nextDouble();
		}

	public Complex add(Complex c)
		{
		 Complex temp=new Complex();
		 temp.real=real+c.real;
		 temp.img=img+c.img;
		 return temp;
		}

	public Complex sub(Complex c1)
		{
		 Complex temp=new Complex();
		 temp.real=real-c1.real;
		 temp.img=img-c1.img;
		 return temp;
		}

	public Complex mul(Complex c2)
		{
		 Complex temp=new Complex();
		 temp.real=((real*c2.real)-(img*c2.img));
		 temp.img=((real*c2.img)+(c2.real*img));
		 return temp;
		}
	public String toString()
		{
		 String s="Number is: "+real+"+i"+img;
		 return s;
		}
}


class Pr3
{
	public static void main(String []args)
		{
		 Scanner sc=new Scanner(System.in);
		 Complex ob1=new Complex();
		 ob1.input();
		 Complex ob2=new Complex();
		 ob2.input();
		 Complex ob3;
		 int choice;
		 while(true)
			{
			 System.out.println("--------Enter your choice--------");
			 System.out.println("          1. Addition            ");
			 System.out.println("          2. Subtract            ");
			 System.out.println("          3. Multipy             ");
			 System.out.println("          4. Exit                ");
			 System.out.println("---------------------------------");
			 choice=sc.nextInt();
			 switch(choice)
				{
				 case 1: ob3=ob1.add(ob2);
					 System.out.println(ob3);
					 break;
				 case 2: ob3=ob1.sub(ob2);
					 System.out.println(ob3);
					 break;
				 case 3: ob3=ob1.mul(ob2);
					 System.out.println(ob3);
					 break;					
				 case 4: System.exit(0);
				}
			}
		}
}
