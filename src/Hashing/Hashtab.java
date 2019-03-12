package Hashing;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * 
 * @author Aboshameh
 * eine selbständige Klasse ,
 */
public class Hashtab {

	public static void main(String[] args) {

		Hashtable<String, String> myTable = new Hashtable<String, String>();
		setHashtable(myTable);
		getHashtable(myTable);
	}

	public static void setHashtable(Hashtable<String, String> sHash) {

		sHash.put("B_NN 3244", "Daimler");
		sHash.put("DD_FG 3244", "VW");
		sHash.put("BN_L 3244", "Ford");
		sHash.put("LDS_L 3244", "BMW");
		sHash.put("PM_L 3244", "Audi");
		sHash.put("S_L 3244", "Porsche");

	}
	public static void getHashtable(Hashtable<String, String> gHash) {
		Enumeration<String> e;  											//
		String key;
		System.out.println(gHash.get("DD_FG 3244"));
		System.out.println("----------------------");
		for(e=gHash.keys(); e.hasMoreElements();) {
			key = (String)e.nextElement();
			System.out.println(gHash.get(key));
		}
		
		
	}
}
