package Assignment16;

import java.time.LocalDate;

public class item {
	String iname;
	String category;
	double price;
String dom;
String doe;

	
	@Override
public String toString() {
	return "item [iname=" + iname + ", category=" + category + ", price=" + price + ", dom=" + dom + ", doe=" + doe
			+ "]";
}


	public item(String iname, String category, double price, String dom,String doe) {
		
		this.iname = iname;
		this.category = category;
		this.price = price;
		this.dom = dom;
		this.doe = doe;
	}
	
}