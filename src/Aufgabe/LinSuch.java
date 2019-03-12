package Aufgabe;

public class LinSuch {

	public static void main(String[] args) {

		int[] liste = { 11, 22, 33, 44, 55, 66, 67, 78, 90, 122, 307, 444 };

		System.out.println(getSearchLin(liste, 33));
	}

	static int getSearchLin(int list[], int searchValue) {
		int n = list.length - 1;
		int left = 0;
		for (int i = left; i <= n; i++) {
			if (searchValue == list[i])
				return i;
		}
		return -1;

	}
}
