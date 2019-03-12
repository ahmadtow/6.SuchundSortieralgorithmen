package Aufgabe;

public class binSuche {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// final int LENGTH = 10000;
		// int[] test = new int[LENGTH];
		// for (int i=0; i<LENGTH; i++){
		// test[i] = 2 * i;

		int[] liste = { 11, 22, 33, 44, 55, 66, 67, 78, 90, 122, 307, 444 };

		System.out.println(getSearchBin(liste, 122));

	}

	static int getSearchBin(int list[], int searchValue) {

		int links = 0;
		int rechts = list.length - 1;
		while (rechts >= 0 && links <= rechts) {
			// mitte des Suchbereich finden
			int pos = (links + rechts) / 2;
			if (searchValue == list[pos]) {
				return pos; // Position des Gesuchten Wertes im Array
			}
			if (searchValue < list[pos]) {
				rechts = pos - 1;
			} else {
				links = pos + 1;
			}
		}
		return -1;

	}

	int getSearchBinRek(int list[], int searchValue, int low, int high) {
		/**
		 *  die Rekursive Lösung 
		 */
		if (low > high) {
			return -1; // kein Ergebnis
		}
		int middle = (low + high) / 2;
		if (searchValue == list[middle]) {
			return middle; // Ergebnis gefunden
		}
		if (searchValue < list[middle]) {
			return getSearchBinRek(list, searchValue, low, high - 1);
		} else {
			return getSearchBinRek(list, searchValue, middle + 1, high);
		}

	}
}
