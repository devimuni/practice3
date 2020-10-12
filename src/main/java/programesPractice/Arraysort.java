package programesPractice;

import java.util.Arrays;



public class Arraysort 
{	
	public static void sortarray(int a[])
	{


		for(int i=0;i<a.length-1;i++)
		{

			for(int j=0;j<a.length-1;j++)
			{

				if(a[j] > a[j+1])
				{

					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}


			}
		}
		
	}


	public static void main(String[] args) {
		int a[] = {10,30,50,40,20};
		System.out.println("Before sorting an array  "+ Arrays.toString(a));	
		
		sortarray(a);
		System.out.println("After sorting an array  "+ Arrays.toString(a));
	}

}
