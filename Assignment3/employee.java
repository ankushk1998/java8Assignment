package Assignment3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class employee {
	public static void main(String[] args) { 
	String emp = Arrays.asList("Ankush", "Ajit","Ajit","Ankush", "Meghraj","Dhannu","Sneha"). stream().distinct().sorted().collect(Collectors.joining(","));
			System.out.println(emp);
			
	}
	
}