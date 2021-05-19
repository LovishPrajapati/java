package P1;

import java.util.*;

public class Matrix
{
	 int arr[][];
	 int rows;
	 int columns;
	
	public Matrix(int r,int c){
		rows=r;
		columns=c;
		arr=new int[r][c];
	}

	
	
	
	public void input(){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				System.out.println("Enter element"+" arr["+i+"]["+j+"]");
				arr[i][j]=sc.nextInt();
			}
		}
	}
	
	public Matrix add(Matrix m1){
		Matrix temp=new Matrix(rows,columns);
		if((rows==m1.rows)&&(columns==m1.columns)==false){
			System.out.println("Addition not possible");
			System.exit(0);
		}
		else{
			for(int i=0;i<rows;i++){
				for(int j=0;j<columns;j++){
					temp.arr[i][j]=arr[i][j]+m1.arr[i][j];
				}
			}
	}
	return temp;
}
	
	public Matrix transpose(){
		Matrix temp=new Matrix(columns,rows);
		for(int i=0;i<temp.rows;i++){
			for(int j=0;j<temp.columns;j++){
				temp.arr[i][j]=arr[j][i];
			}
		}
		return temp;
	}
	
	public Matrix mul(Matrix m2){
		Matrix temp=new Matrix(rows,m2.columns);
		if(columns==m2.rows){
			int sum=0;
			for(int i=0;i<temp.rows;i++){
				for(int j=0;j<temp.columns;j++){
					for(int k=0;k<m2.rows;k++){
						sum=sum+arr[i][k]*m2.arr[k][j];
					}
					temp.arr[i][j]=sum;
					sum=0;
				}
			}
		}
		else{
			System.out.println("Multiplication not possible");
			System.exit(0);
		}
		return temp;
	}
	
	public String toString(){
	String sr=new String();
	int i;
	for(i=0;i<rows;i++){
		sr=" ";
		for(int j=0;j<columns;j++){
			sr=sr+" "+arr[i][j];
			}
		if(i!=rows-1){
			System.out.println(sr);	
			System.out.println();
		}
	}
	
	return sr;
}
}
