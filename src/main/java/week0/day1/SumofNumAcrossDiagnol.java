package week0.day1;
import java.util.Scanner;

//import org.apache.commons.lang3.ArrayUtils;

public class SumofNumAcrossDiagnol {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int rows, columns;
		int i,j;
		System.out.println("Enter the number of rows");
		rows = s.nextInt();
		System.out.println("Enter the number of columns");
		columns = s.nextInt();
		int a[][] = new int[rows][columns];
		int arrsize = ((rows*columns)-rows)/2;
		int uppdiagnol[] = new int[arrsize];
		int lowerdiagnol[] = new int[arrsize];
		int uppdiagnolsum =0, lowerdiagnolsum =0, pos1=0, pos2=rows-1, k=0, l=0;
		System.out.println("Enter the elements");
		for( i=0; i<rows; i++) {
			for( j=0; j<columns; j++) {
				a[i][j] = s.nextInt();
				
			}
		}
	for(i=0; i<rows; i++) {
		for(j=0; j<columns; j++) {
			if(a[i][j]!=a[pos1][pos2]) {
				if(j<pos2) {
					uppdiagnolsum = uppdiagnolsum+a[i][j];
					uppdiagnol[k]= a[i][j];
					k++;
				}
			   if(j>pos2) {
				   lowerdiagnolsum = lowerdiagnolsum+a[i][j];
				   lowerdiagnol[l] = a[i][j];
				   l++;
			   }
			
			}
		}
	pos1 = pos1+1;
	pos2 = pos2-1;
	
	
	}
	
	System.out.println("sum of upper half:"+uppdiagnolsum);
	System.out.println("sum of lower half:"+lowerdiagnolsum);
	System.out.print("half which is greater is ");
	/*if(uppdiagnolsum>lowerdiagnolsum){
		System.out.print(ArrayUtils.toString(uppdiagnolsum));
	}else{
		System.out.print(ArrayUtils.toString(lowerdiagnolsum));
	}*/
	
	}

}
	
