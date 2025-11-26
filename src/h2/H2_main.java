package h2;

public class H2_main {
	public static void main (String []args) {
		int []a={1,2,3};
		int []b={1,2,4}; 
		int []c={1,3,2}; 
		int []d={1,2};
		int []e={1,2,3};
		
		System.out.println(compareArrays(a,b));
		System.out.println(compareArrays(b,c));
		System.out.println(compareArrays(c,d));
		System.out.println(compareArrays(d,e));
		
		System.out.println("");
		
		System.out.println(compareArrays(e,a));
		System.out.println(compareArrays(a,e));
		System.out.println(compareArrays(c,c));
	}
	
	public static boolean compareArrays (int[]a, int[]b) {
		
		if (a.length==b.length) {
			for (int i=0; i<a.length; i++) {
				if (a[i] != b[i]) {
					return false;
				}
			}
			return true;
		}
		
		return false;
	}

}
