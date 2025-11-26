package h3;

public class H3_main {
	
	public static void main(String []args) {
		int []a={1,2,3};
		int []b={1,2,4}; 
		int []c={1,3,2}; 
		int []d={1,2};
		int []e={1,2,3};
		int []f={1,1,2};
		
		System.out.println(compareArraysVal(a,b));
		System.out.println(compareArraysVal(b,c));
		System.out.println(compareArraysVal(c,d));
		System.out.println(compareArraysVal(d,e));
		System.out.println(compareArraysVal(e,f));
		System.out.println(compareArraysVal(f,a));
		
		System.out.println("");
		
		System.out.println(compareArraysVal(c,a));
		System.out.println(compareArraysVal(a,c));
		System.out.println(compareArraysVal(c,e));
		System.out.println(compareArraysVal(e,c));
		System.out.println(compareArraysVal(a,e));
		System.out.println(compareArraysVal(e,a));
		System.out.println(compareArraysVal(f,f));
		System.out.println(compareArraysVal(d,d));
	}
	
	public static boolean compareArraysVal (int[]a, int[]b) {
		
		if (a.length==b.length) {
			
			int[][] m=new int [a.length][2];
			
			for (int i=0; i<a.length; i++) {
				for (int j=0; j<b.length; j++) {
					if (a[i]==b[j]) {
						if (m[i][0]==0 && m[j][1]==0) {
							m[i][0]=1;
							m[j][1]=1;
						}
					}
				}
			}
			for (int n=0; n<a.length;n++) {
				if (m[n][0]==0 || m[n][1]==0) {
					return false;
				}
			}
			return true;
			
		}
		
		return false;
	}

}
