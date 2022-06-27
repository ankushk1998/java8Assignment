package assignment13;

public class series {
public static void main(String[] args) {
	int a[]= {1,2,3,6,7,8,10,11,12,13,14,17,18,19,20};
	for(int i=0;i<a.length;i++) {if (i<=4) {
		String d=a[i]+"_"+(a[i+2]);
		System.out.print(d+",");
		i=i+2;
	
	}
	else if(i<=10) {
		String c=a[i]+"_"+(a[i+4]);
		System.out.print(c+",");
		i=i+4;
		
	}else {
		String c=a[i]+"_"+(a[i+3]);
		System.out.print(c);
		System.out.print("");
		i=i+4;
	}
		
	}
}
}
