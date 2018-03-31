package week0.day1;

public class RearrangeNumberinAscending {

	public static void main(String[] args) {
	int a[] = {12, 13, 15, 14, 7, 8 ,9};
	int i, temp;
	int value = a.length;
	for( i=0; i<value-1; i++) {
		for(int j=0; j<a.length-1; j++) {
			if(a[i]<a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j] = temp;
			}
		}
	}
	System.out.println("Ascending order");
	for(i=0; i<a.length-1; i++) {
	System.out.print(+a[i]+" ");
	
	}
	System.out.println();
	System.out.println("The smallest element in array"+a[0]);
	System.out.println("Largest element in array"+ a);
}
}