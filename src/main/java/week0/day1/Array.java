package week0.day1;

public class Array
{
	public static void main(String[] args)
	{
		int a[] = {1,2,3,4,5,1,3,5,6};
        int count =0;
		System.out.println("The repeated numbers are: ");
		for(int i=0; i<= a.length -1; i++)
		{
			for(int j=i+1; j<a.length-1; j++)
			{
				if((a[i]==a[j]  ))
				{
					System.out.println(a[j]);
					count++;
				}
				
				/*else {
					System.out.println("No repeated numbers");
				}*/
				
			}
			
		}

	}
	}













