package Assignment15;

public class phythogorus {
	public static void main(String[] args) {
	int a[]= {4,3,5,7,6,8,9,2,3,4,3, 1, 4, 6, 5};
	int count=0;
	for(int i=0;i<=a.length-3;i++) {
		int aa=a[i]*a[i];
		int b=a[i+1]*a[i+1];
		int c=a[i+2]*a[i+2];
		if(aa==b+c||c==aa+b||b==aa+c) {
			count++;
		}
	}
	System.out.println("combination of numbers:"+count);
	
	}
}