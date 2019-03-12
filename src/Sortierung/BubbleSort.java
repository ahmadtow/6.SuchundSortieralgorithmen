package Sortierung;

public class BubbleSort {

	public static void main(String[] args) {

		int [] a = {1,2,3,7,9,8,2,4,7,5,6};
		
		getBubbleSort(a);
		System.out.println(a);
	}

	public static void getBubbleSort(int[] feld) {

		for (int i = 0; i < feld.length; i++) {

			for (int j = 0; j < feld.length - 1; j++) {
		
				// Paarweiser Vergleich der Feldinhalte
		
				if (feld[j] > feld[j + 1]) {
				// Tauschen der Feldinhalte des Paars
					int temp = feld[j];
					feld[j] = feld[j + 1];
					feld[j + 1] = temp;
				}
			}
		}
	}
}
