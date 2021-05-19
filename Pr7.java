import java.util.*;

class stackd
{
	private int[] arr;
	private	int pos;
	public stackd(int size)
			{
			 arr=new int[size];
			 pos=-1;
			}
	public	void push()
			{
			 Scanner sc=new Scanner(System.in);
			 if(pos==(arr.length-1)){
			 int temp[]=new int[arr.length*2];
			 for(int i=0;i<arr.length;i++){
			 	temp[i]=arr[i];
				}
				arr=temp;
				System.out.println("Enter number");
				arr[++pos]=sc.nextInt();
			}
			 else
			 {
			  System.out.println("Enter number");
			  arr[++pos]=sc.nextInt();
			 }
			 }
	public	void pop()
			{
			 if(pos==-1)
			 System.out.println("Stack is empty");
			 else
			 {
			  System.out.println("Popped element:" + arr[pos]);
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
			System.out.println();
			}
}

class Pr7
{
	public static void main(String []args)
		{
		 int choice,n;
		 Scanner scc=new Scanner(System.in);
		 System.out.println("Enter size of stack");
		 n=scc.nextInt();
		 stackd s=new stackd(n);
		 while(true)
		 	{
		 	 System.out.println("--------Enter your choice--------");
		 	 System.out.println("	    1. Push an element       ");
		 	 System.out.println("	    2. Pop an element        ");
		 	 System.out.println("	    3. Display stack         ");
		 	 System.out.println("	    4. Exit                  ");
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
