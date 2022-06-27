package Assignment16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class itemtest {
	public static void main(String[] args) {



		List<item> itemlist=new ArrayList<>();
		itemlist.add(new item("shirt","clothes",700,"2022-1-03",null));
		itemlist.add(new item("oil","home",210,"2022-02-03","2022-12-03"));
		itemlist.add(new item("straightner","electronics",1700,"2022-1-03",null));
		itemlist.add(new item("milk","food",60,"2022-05-16","2022-05-20"));
		itemlist.add(new item("pepsi","colddrink",45,"2022-04-17","2022-06-17"));

		System.out.println("Enter Category");
		Scanner sc= new Scanner(System.in);
		String cat=sc.next();
		List<item> ilist=itemlist.stream().filter(e->e.category.equals(cat)).collect(Collectors.toList());
		for (item list1:ilist)
		{
		System.out.println("item name= "+list1.iname+" price= "+list1.price+" date of manufacture "+list1.dom+" date of expiry "+list1.doe);
		}

		System.out.println("Enter starting letter of item,,, ");
		String start=sc.next();
		List<item> itemnames=itemlist.stream().filter(e->e.iname.startsWith(start.toLowerCase())).collect(Collectors.toList());
		for (item s:itemnames)
		{
		System.out.println("item name= "+s.iname+" category "+s.category+" price= "+s.price+" date of manufacture "+s.dom+" date of expiry "+s.doe);
		}
		System.out.println("Enter starting letter of item,,, ");
		String start1=sc.next();
		List<item> item=itemlist.stream().filter(e->e.iname.startsWith(start1.toLowerCase())).collect(Collectors.toList());
		for (item s:item)
		{
		System.out.println("item name= "+s.iname+" category "+s.category+" price= "+s.price+" date of manufacture "+s.dom+" date of expiry "+s.doe);
		}
		System.out.println("Enter Date of manufacturing,,, ");
	String Dom=sc.next();
	System.out.println("enter date of expiry");
	String Doe=sc.next();
	List<item> date1=itemlist.stream().filter(e->e.dom.contains(Dom)&&e.doe.contains(Doe)).collect(Collectors.toList());
	date1.stream().forEach(System.out::println);
	System.out.println("enter min price");
	int minprice=sc.nextInt();
	System.out.println("enter max price");
	int maxprice=sc.nextInt();
	List<item> price=itemlist.stream().filter(e->e.price>minprice && e.price<maxprice).collect(Collectors.toList());
	price.stream().forEach(System.out::println);
	}
		
}
