import java.util.*;

class stack
{
	private int[] arr;
	private	int pos;
	public stack(int size)
			{
			 arr=new int[size];
			 pos=-1;
			}
	public	void push()
			{
			 if(pos==(arr.length-1))
			 System.out.println("Stack is full");
			 else
			 {
			  Scanner sc=new Scanner(System.in);
			  System.out.println("Enter number");
			  pos++;
			  arr[pos]=sc.nextInt();
			 }
			 }
	public	void pop()
			{
			 if(pos==-1)
			 System.out.println("Stack is empty");
			 else
			 {
			  System.out.println(arr[pos]);
			  pos--;
			 }
			}
	public	void display()
			{
			 if(pos==-1)
			 System.out.println("Stack is empty");
			 else
			{
			 System.out.println("Elements of stack are:");
			 for(int i=pos;i>=0;i--)
			 System.out.print(arr[i] + " ");
			}
			}
}

class Pr6
{
	public static void main(String []args)
		{
		 int choice,n;
		 Scanner scc=new Scanner(System.in);
		 System.out.println("Enter size of stack");
		 n=scc.nextInt();
		 stack s=new stack(n);
		 System.out.println("Enter your choice");
		 while(true)
		 	{
		 	 System.out.println();
		 	 System.out.println("1. Push an element");
		 	 System.out.println("2. Pop an element");
		 	 System.out.println("3. Display stack");
		 	 System.out.println("4. Exit");
		 	 choice=scc.nextInt();
		 	 switch(choice)
		 	 	{
		 	 	 case 1: s.push();
		 	 	         break;
		 	 	 case 2: s.pop();
		 	 	         break;
		 	 	 case 3: s.display();
		 	 	         break;
		 	 	 case 4: System.exit(0);
		 	 	}
		 	}
		 }
}
