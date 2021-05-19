import java.util.*;

class Pr5
{
	public static void main(String []args)
		{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter size of sq. matrix");
		 int num=sc.nextInt();
		 int count=0;
		 int [][]arr=new int[num][num];
		 System.out.println("Enter elements");
		 for(int i=0;i<num;i++)
		 	{
		 	 for(int j=0;j<num;j++)
		 	 	{
		 	 	 System.out.println("Enter a[" + i + "][" + j + "]");
		 	 	 arr[i][j]=sc.nextInt();
		 	 	}
		 	}
		System.out.println("Original Matrix");
		for(int i=0;i<num;i++)
		 	{
		 	 for(int j=0;j<num;j++)
		 	 	{
		 	 	 System.out.print(arr[i][j] + " ");
		 	 	}
		 	 System.out.println();
		 	}
		for(int i=0;i<num;i++)
		 	{
		 	 for(int j=0;j<num;j++)
		 	 	{
				 if(arr[i][j]!=arr[j][i])
				 {
				  count=1;
				  break;
				 }
				}
			}
		if(count==0)
		System.out.println("Symmetric");
		else
		System.out.println("Asymmetric");
		}
} 
