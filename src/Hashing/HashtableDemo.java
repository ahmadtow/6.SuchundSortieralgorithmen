package Hashing;

public class HashtableDemo {

	public static void main(String[] args) {
		
		HashTableArray<String> hash=new HashTableArray<String>(10);
		hash.put(10, "Ahmad");
		hash.put(11, "AbuZed");
		hash.put(5, "Christopher");
		System.out.println(hash.getHash(11));
	}

}
