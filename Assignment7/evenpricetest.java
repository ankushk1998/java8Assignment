package Assignment7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class evenpricetest {
	public static void main(String s[])
	  {
	List<evenprice> elist= new ArrayList<evenprice>();
elist.add(new evenprice(1,"Tea",10f));
elist.add(new evenprice(2,"pen",10f));
elist.add(new evenprice(3,"shoes",500f));
elist.add(new evenprice(4,"mobile",9000f));
elist.add(new evenprice(5,"mouse",350f));
elist.add(new evenprice(6,"shirts",650f));
elist.add(new evenprice(7,"pants",550f));
List <Float> Elist=elist.stream().filter(p -> p.itemprice%2==0).map(p->p.itemprice).collect(Collectors.toList());
System.out.println(Elist);
}
	}
 