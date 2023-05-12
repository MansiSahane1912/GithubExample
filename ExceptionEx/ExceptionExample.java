package ExceptionEx;

import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6};
		for(int i=0; i<=arr.length; i++)
		{
			try
			{
			System.out.println(arr[i]);
			}
			catch(Exception e)
			{
				System.out.println("Index out of array "+e);
			}
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of i:");
		int i = sc.nextInt();
		
		System.out.println("Enter value of j:");
		int j = sc.nextInt();
		
		int k = 0;
		try
		{
		   k=i/j;
		}
		catch(Exception e)
		{
			System.out.println("You are dividing the number by 0 !!! it is not allowed."+e);
		}
		
		System.out.println("Result:"+k);

	}

}
