package Hashing;

public class test {
	
	 	static int MAX = 4000;
	 	
		public static void main(String[] args) {
	
			
		
			
		 int erg = 0;
		erg = getHash("WI WiSe 2012");
		System.out.println(erg);
		erg = getHash("WI WiSe 2012_");
		System.out.println(erg);
		erg = getHash("WI WiSe 2012_-");
		System.out.println(erg);
		}

		
		public static int getHash(String name){
		 int b = name.length();
		 int pos = b  % MAX;
		 return pos;
	
		} 

}
