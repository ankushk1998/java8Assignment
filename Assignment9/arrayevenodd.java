package Assignment9;

import java.util.function.Predicate;

public class arrayevenodd {
	public static void main(String[] args) {
		 
        
        Predicate<Integer> p1 = i -> i%2 == 0;
 
        
       
 
      
        int numbers[] = {25, 35, 50, 60, 75, 90, 100};
 
        
        for(int num : numbers) {
 
            if(p1.test(num)) {
                System.out.println(num + " is EVEN" );
            }
        }
    
	
	Predicate<Integer> p2= i->i%2==1;
	 for(int num : numbers) {
		 
         if(p2.test(num)) {
             System.out.println(num + " is odd");
         }
     }
	
}
}
