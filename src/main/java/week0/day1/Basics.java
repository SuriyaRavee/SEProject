package week0.day1;

import java.util.Scanner;
public class Basics
{
	public static void main(String[] args) 
	{ 
		int a1[] = new int[10];
	    int a2[] = new int[10];
	    int merge[] = new int[21];
	    
		int i;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enterr 1st array elements");
		for( i =0; i<10; i++)
		{
			a1[i] = s.nextInt();
		}
		System.out.println("Enterr 2nd array elements");
		for( i =0; i<10; i++)
		{
			a2[i] = s.nextInt();
		}

		for(i=0; i<10; i++)
		    {
			merge[i] = a1[i];
			}

        
		for(i=0; i<10; i++) {
			
			merge[i+10] = a2[i];
		}
		System.out.println("After merging");
		for(i=0; i<21; i++) {
			System.err.print(merge[i]+" ");
		}
		

	}
}

