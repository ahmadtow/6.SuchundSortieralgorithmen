package Hashing;

public class HashTableArray<T> {
	Entry[] arrayHash;
	int Size;

	public HashTableArray(int Size) {
		this.Size = Size;
		arrayHash = new Entry[this.Size];
		for (int i = 0; i < arrayHash.length; i++)
			arrayHash[i] = new Entry<T>();
	}

	int getHash(int key) {

		return key % Size; // hier wird den Hash generiert // there is Manyways to make this

	}

	public void put(int key, T Value) {
		int index=getHash(key);
		Entry ArrayValue= arrayHash[index];
		while(ArrayValue!=null) {
			if(ArrayValue.getKey()==key) {
				Value=(T)ArrayValue.getValue();
				break;
			}
			
		}
	}
}
