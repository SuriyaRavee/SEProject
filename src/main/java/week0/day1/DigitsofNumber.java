package week0.day1;


public class DigitsofNumber {
	public static void main (String[] args) {
		int  x,y,z;
     
        /*int num[] = {1,2,3};
        for(x=0; x<3; x++) {
			for(y=0; y<3; y++) {
				for(z=0; z<3; z++) {
					if (x != y && y != z && z != x) {
						System.out.println(num[x] + "" + num[y] + ""
								+ num[z]);

					}
				}
			}
		}*/
        int num[] = {1,2,3,4};
        int z1;
        for(x=0; x<4; x++) {
			for(y=0; y<4; y++) {
				for(z=0; z<4; z++) {
					for( z1=0; z1<4; z1++) {
						
					}
					if (x != y && x!=z && x!=z1 && y!=z && y!=z1 && z!=z1 ) {
						System.out.println(num[x] + "" + num[y] + ""
								+ num[z]+ ""+num[z1]);
					}
				}
			}
		}
	
	
	
	
	
	}
}


