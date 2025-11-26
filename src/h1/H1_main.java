package h1;

public class H1_main {
	public static void main (String []args) {
		int[]a= {1,2,3,4};
		int[]b= {4,3,2,1};
		
		int[]c= {2,4,6};
		int[]d= {6,4,9};
		
		System.out.println(isMirrorArray(b,a));
		System.out.print(isMirrorArray(d,c));
	}
	
	public static boolean isMirrorArray (int[] a, int []b) {
		
		int j=a.length-1;
		
		if (a.length==b.length) {
			for (int i=0; i<a.length; i++) {
				if (a[i] != b[j]) {
					return false;
				}
				j--;
			}
			return true;
		}
		
		return false;
		
	}

}
