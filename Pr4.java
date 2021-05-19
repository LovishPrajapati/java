import java.util.*;


class Rational
{
	private int numerator;
	private int denominator;
	
	
	Rational(int num,int deno){
		numerator=num;
		denominator=deno;
		int gcd;
		gcd=GCD.GCD1(numerator,denominator);
		numerator=numerator/gcd;
		denominator=denominator/gcd;
		if(denominator<0){
			numerator=-numerator;
			denominator=-denominator;
		}
	}
	
	Rational(){
		numerator=0;
		denominator=1;
	}
	
	public Rational add(Rational r){
		Rational temp=new Rational();
		temp.numerator=((numerator*r.denominator)+(r.numerator*denominator));
		temp.denominator=(denominator*r.denominator);
		return new Rational(temp.numerator,temp.denominator);
	}
	
	public Rational sub(Rational r1){
		Rational temp=new Rational();
		temp.numerator=((numerator*r1.denominator)-(r1.numerator*denominator));
		temp.denominator=(denominator*r1.denominator);
		return new Rational(temp.numerator,temp.denominator);
	}
	
	public Rational mul(Rational r2){
		Rational temp=new Rational();
		temp.numerator=numerator*r2.numerator;
		temp.denominator=denominator*r2.denominator;
		return new Rational(temp.numerator,temp.denominator);
	}
	
	public Rational div(Rational r3){
		Rational temp=new Rational();
		temp.numerator=numerator*r3.denominator;
		temp.denominator=denominator*r3.numerator;
		return new Rational(temp.numerator,temp.denominator);
	}
	
	public String toString(){
		String s="Result is:" + numerator+"/"+denominator;
		return s;
	}
}

class GCD
{
	public static int GCD1(int num,int deno){
		if(deno==0)
		return num;
		else 
		return GCD1(deno,num%deno);
	}
}


class Pr4
{
	public static void main(String []args){
		int choice,n,d;
		Scanner scc=new Scanner(System.in);
		System.out.println("Enter numerator");
		n=scc.nextInt();
		System.out.println("Enter denominator");
		d=scc.nextInt();
		while(d==0){
			System.out.println("Denominator cannot be zero.Enter again");
			d=scc.nextInt();
			}
		Rational ob1=new Rational(n,d);
		System.out.println("Enter numerator");
		n=scc.nextInt();
		System.out.println("Enter denominator");
		d=scc.nextInt();
		while(d==0){
			System.out.println("Denominator cannot be zero.Enter again");
			d=scc.nextInt();
			}
		Rational ob2=new Rational(n,d);
		Rational test;
		while(true)
		{
			System.out.println("Enter your choice");
			System.out.println("--------MAIN MENU--------");
			System.out.println("       1. Addition       ");
			System.out.println("       2. Substraction   ");
			System.out.println("       3. Multiply       ");
			System.out.println("       4. Divide         ");
			System.out.println("       5. Exit           ");
			System.out.println("-------------------------");
			choice=scc.nextInt();
			switch(choice){
				case 1: test=ob1.add(ob2);
					System.out.println(test);
					break;
				case 2: test=ob1.sub(ob2);
					System.out.println(test);
					break;
				case 3: test=ob1.mul(ob2);
					System.out.println(test);
					break;
				case 4: test=ob1.div(ob2);
					System.out.println(test);
					break;
				case 5: System.exit(0);
			}
		}
	}
}
	
