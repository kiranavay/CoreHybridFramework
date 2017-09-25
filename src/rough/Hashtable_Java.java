package rough;

import java.util.Hashtable;

public class Hashtable_Java {

	public static void main(String[] args) {
		
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("name","Selenium");
		ht.put("version","2.53.1");
		
		System.out.println(ht.get("name"));

	}

}
