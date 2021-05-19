import java.util.Scanner;

class Pr2
{
  public static void main(String []args)
	{
	  Scanner sc=new Scanner(System.in);
	  int a;
	  int sum=0;
	  if(args.length<1)
	  	{
	  	 System.out.println("Invalid arguements");
	  	 System.exit(0);
	  	}
	  else
	  	{
	  	 int b=Integer.parseInt(args[0]);
	  	 while(b!=0)
	  		{
	  	  	 System.out.println("Enter number:");
	  	  	 a=sc.nextInt();
	  	  	 sum=sum+a;
	  	  	 b=b-1;
	  		} 
	  System.out.println("Sum=" + sum);
		}
	}
};	  	 
