package assignment12;

import java.util.ArrayList;
import java.util.List;



public class lambda {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<Integer>();
	Max d=(int a[])->{
		for(int i=1;i<=a.length-1;i++) {
			list.add(a[i]);
		}
		Integer Maximum=list.stream().max((e1,e2)->e1>e2?1:-1).get();
		System.out.println("maximum NUMBER IN ARRAY"+Maximum);
		
	
};
d.maxArray(new int[] {23,8,90,34,78});
}
}